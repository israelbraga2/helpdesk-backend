package com.israel.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israel.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
