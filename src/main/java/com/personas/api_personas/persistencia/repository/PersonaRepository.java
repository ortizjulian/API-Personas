package com.personas.api_personas.persistencia.repository;


import com.personas.api_personas.persistencia.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {
}
