package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {
	
	@Autowired
	private NotificadorSMSProperties smsProperties;
	
	public NotificadorSMS() {
		
		System.out.println("NotificadorSMS");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por SMS...");
		System.out.println("Operadora de telefone: " + smsProperties.getOperadoraTelefone());
		System.out.println("DDD: " + smsProperties.getNumeroDDD());
		
		
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
