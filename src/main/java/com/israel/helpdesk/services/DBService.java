package com.israel.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.israel.helpdesk.domain.Chamado;
import com.israel.helpdesk.domain.Cliente;
import com.israel.helpdesk.domain.Tecnico;
import com.israel.helpdesk.domain.enums.Perfil;
import com.israel.helpdesk.domain.enums.Prioridade;
import com.israel.helpdesk.domain.enums.Status;
import com.israel.helpdesk.repositories.ChamadoRepository;
import com.israel.helpdesk.repositories.ClienteRepository;
import com.israel.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	

	//Injeção de dependência
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Israel Braga", "05660445950", "ibraga1003@gmail.com" , "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Nicolas", "123322123322", "nikc@gmail.com", "345");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		//instancia
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
