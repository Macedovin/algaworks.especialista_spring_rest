package com.macedovingithub.di.service;

import com.macedovingithub.di.model.Cliente;
import com.macedovingithub.di.notification.Notificador;

public class AtivacaoClientService {
	
	private Notificador notificador;
	
	// Construtor com argumentos
	public AtivacaoClientService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		
		// Ativa um cliente
		cliente.ativar();		
		
		// Instancia um notificador e notifica o cliente 
		// NotificadorSMS notificador = new NotificadorSMS();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
