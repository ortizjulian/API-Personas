package com.personas.api_personas.controller;

import com.personas.api_personas.dto.PersonaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personas")
public class PersonaController {

    @GetMapping
    private PersonaDto obtenerHola(){
        return new PersonaDto("Julian", "Ortiz");
    }

}
