package com.personas.api_personas.mapper;

import com.personas.api_personas.dto.PersonaDto;
import com.personas.api_personas.persistencia.entity.PersonaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaEntity personaDtoToPersonaEntity(PersonaDto personaDto);

    PersonaDto personaEntityToPersonaDto(PersonaEntity personaEntity);

}
