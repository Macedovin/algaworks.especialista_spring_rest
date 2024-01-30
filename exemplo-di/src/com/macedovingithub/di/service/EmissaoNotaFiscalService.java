package com.macedovingithub.di.service;

import com.macedovingithub.di.model.Cliente;
import com.macedovingithub.di.model.Produto;
import com.macedovingithub.di.notification.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
	
	// Contrutor com argumentos
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		
		// TODO emite nota fiscal aqui...
		
		// Instancia um notificador e notifica um cliente
		// NotificadorSMS notificador = new NotificadorSMS();
		
		this.notificador.notificar(cliente, "Nota fiscal do produto "
				+ produto.getNome() + " foi enviada.");
	}
}
