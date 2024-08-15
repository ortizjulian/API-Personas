package com.personas.api_personas.controller;

import com.personas.api_personas.dto.PersonaDto;
import com.personas.api_personas.mapper.PersonaMapper;
import com.personas.api_personas.persistencia.repository.PersonaRepository;
import com.personas.api_personas.persistencia.entity.PersonaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;
    /*
    @RequiredArgsConstructor reemplaza el constructor
    @Autowired sería otra opción
    public PersonaController(PersonaRepositoryImpl personaRepository) {
        this.personaRepository = personaRepository;
    }*/

    @GetMapping()
    private List<PersonaDto> obtenerPersona(){
        return personaRepository.
                findAll()
                .stream()
                .map(personaEntity -> personaMapper.personaEntityToPersonaDto(personaEntity))
                .collect(Collectors.toList());

    }

    @PostMapping
    private PersonaDto crearPersona(@RequestBody PersonaDto persona){

        PersonaEntity personaEntity = this.personaRepository.save(
                personaMapper.personaDtoToPersonaEntity(persona)
        );
        return personaMapper.personaEntityToPersonaDto(personaEntity);
    }

}
