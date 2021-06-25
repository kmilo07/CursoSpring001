package edu.com.ies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.com.ies.domain.Persona;


public interface PersonaDao extends JpaRepository<Persona, Long>{

}
