package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Profile("dev") // ANOTAÇÂO Profile e seu identificador de perfil
@TipoDoNotificador(NivelUrgencia.NORMAL)  // Utiliza a ANOTAÇÃO CUSTOMIZADA
//@Qualifier("urgente") // Utilizando identificador com nome mais abrangente
//@Qualifier("email")
//@Primary                                    
@Component
public class NotificadorEmailMock implements Notificador {
	
	// Construtor uitlizado para debbug do Bean
	public NotificadorEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
		
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
