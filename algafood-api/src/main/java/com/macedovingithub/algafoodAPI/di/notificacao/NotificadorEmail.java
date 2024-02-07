package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Qualifier("urgente") // Utilizando identificador com nome mais abrangente
//@Qualifier("email")
//@Primary                                    
@Component
public class NotificadorEmail implements Notificador {
		
	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
