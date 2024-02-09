package com.macedovingithub.algafoodAPIConfig.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.Notificador;

public class AtivacaoClienteService {
	
	//private Notificador notificador;
	@Autowired
//	RESOLVENDO DESAMBIGUAÇÃO -> Lista
	private List<Notificador> notificadores;
	
	// Injetando dependência usando Construtor com argumentos
	// Utilizando uma Interface para redução de acoplamento
	public AtivacaoClienteService(List<Notificador> notificadores) {
		
		this.notificadores = notificadores;
		
		System.out.println("AtivacaoClienteService: " + notificadores);
	}

	public void ativar(Cliente cliente) {
		
		System.out.println("Cliente ativado.");
		
		cliente.ativar();
		
		// ENHANCED FOR -> Para cada notificador da Lista de Notificadores, notificar cliente
		for (Notificador notificador : notificadores) {
			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}
}
