package com.personas.api_personas.controller;

import com.personas.api_personas.dto.PersonaDto;
import com.personas.api_personas.mapper.PersonaMapper;
import com.personas.api_personas.persistencia.repository.PersonaRepository;
import com.personas.api_personas.persistencia.entity.PersonaEntity;
import com.personas.api_personas.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;
    /*
    @RequiredArgsConstructor reemplaza el constructor
    @Autowired sería otra opción
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }*/

    @GetMapping()
    private List<PersonaDto> obtenerPersona(){
        return personaService.obtenerPersonas();

    }

    @PostMapping
    private PersonaDto crearPersona(@RequestBody PersonaDto persona){
        return personaService.crearPersona(persona);
    }

}
