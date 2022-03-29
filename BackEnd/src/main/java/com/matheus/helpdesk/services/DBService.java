package com.matheus.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.matheus.helpdesk.domain.Chamado;
import com.matheus.helpdesk.domain.Cliente;
import com.matheus.helpdesk.domain.Tecnico;
import com.matheus.helpdesk.domain.enums.Perfil;
import com.matheus.helpdesk.domain.enums.Prioridade;
import com.matheus.helpdesk.domain.enums.Status;
import com.matheus.helpdesk.repositories.ChamadoRepository;
import com.matheus.helpdesk.repositories.ClienteRepository;
import com.matheus.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instanciaDB() {

		// -----------------------Ordem de Serviço 1------------------------------------

		Tecnico tec1 = new Tecnico(null, "Matheus Carvalho", "838.592.162-10", "matheuscarvalhophd@yahoo.com",
				encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Gal Gadot", "543.702.876-85", "galgadot@gmmail.com", encoder.encode("123"));

		Chamado c1 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 01", "Projeto: Mulher Maravilha", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

		// -----------------------Ordem de Serviço 2------------------------------------

		Tecnico tec2 = new Tecnico(null, "Alexei Volkoff", "986.781.950-02", "alexeivolkoff@gmail.com",
				encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli2 = new Cliente(null, "Jennifer Aniston", "012.309.610-38", "jenniferaniston@gmmail.com",
				encoder.encode("123"));

		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 02", "Projeto: Rachel Green", tec2, cli2);

		tecnicoRepository.saveAll(Arrays.asList(tec2));
		clienteRepository.saveAll(Arrays.asList(cli2));
		chamadoRepository.saveAll(Arrays.asList(c2));

		// -----------------------Ordem de Serviço 3------------------------------------

		Tecnico tec3 = new Tecnico(null, "Miguel Portella", "244.666.450-43", "miguelito@gmail.com",
				encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli3 = new Cliente(null, "Adam Sandler", "063.255.340-50", "adamsandler@gmmail.com",
				encoder.encode("123"));

		Chamado c3 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 03", "Projeto: Gente Grande", tec3,
				cli3);

		tecnicoRepository.saveAll(Arrays.asList(tec3));
		clienteRepository.saveAll(Arrays.asList(cli3));
		chamadoRepository.saveAll(Arrays.asList(c3));
		
		// -----------------------Ordem de Serviço 4------------------------------------

		Tecnico tec4 = new Tecnico(null, "Andrew Scott", "662.303.610-51", "adrewscott@gmail.com",
				encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli4 = new Cliente(null, "Margot Robbie", "712.425.290-39", "margotrobbie@gmmail.com",
				encoder.encode("123"));

		Chamado c4 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 04", "Projeto: Alerquina", tec4,
				cli4);

		tecnicoRepository.saveAll(Arrays.asList(tec4));
		clienteRepository.saveAll(Arrays.asList(cli4));
		chamadoRepository.saveAll(Arrays.asList(c4));
	}
}
