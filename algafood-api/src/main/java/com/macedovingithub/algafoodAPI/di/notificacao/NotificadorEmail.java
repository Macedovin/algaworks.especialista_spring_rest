package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Component
public class NotificadorEmail {
		
	public NotificadorEmail() {
		System.out.println("Construtor foi chamado.");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
