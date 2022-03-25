package com.matheus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
