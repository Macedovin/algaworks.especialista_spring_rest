package com.macedovingithub.algafoodAPIConfig.di.service;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.Notificador;

public class AtivacaoClienteService {

	public Notificador notificador;
	
	// Injetando dependência usando Construtor com argumentos
	// Utilizando uma Interface para redução de acoplamento
	public AtivacaoClienteService(Notificador notificador) {
		
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		
		System.out.println("Cliente ativado.");
		
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
