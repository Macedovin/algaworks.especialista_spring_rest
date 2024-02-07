package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {
	
	public NotificadorSMS() {
		
		System.out.println("NotificadorSMS");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por SMS...");
		
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
