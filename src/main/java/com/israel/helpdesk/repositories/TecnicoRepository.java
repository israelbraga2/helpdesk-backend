package com.israel.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israel.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
