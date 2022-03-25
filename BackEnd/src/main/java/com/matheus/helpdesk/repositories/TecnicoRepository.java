package com.matheus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
