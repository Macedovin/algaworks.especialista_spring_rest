package com.macedovingithub.algafoodAPI.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;
import com.macedovingithub.algafoodAPI.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	// Injetando dependência usando Atributo
	private Notificador notificador;
	
//	@Autowired
//	// Injetando dependência usando Construtor com argumentos
//	// Utilizando uma Interface para redução de acoplamento
//	public AtivacaoClienteService(Notificador notificador) {
//		
//		this.notificador = notificador;
//		
//		System.out.println("AtivacaoClienteService: " + notificador);
//	}
	
//  Segundo CONSTRUTOR como exemplo -> Vai "confundir" o Spring
//	public AtivacaoClienteService(String qualquer) {
//		
//	}
	
	public void ativar(Cliente cliente) {
		
		System.out.println("Cliente ativado.");
		
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
//	@Autowired
//	// Injetando dependência refrenciando um dos SETTERS
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	
}
