package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Qualifier("normal") // Utilizando identificador com nome mais abrangente
//@Qualifier("sms")
//@Primary
@Component
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
