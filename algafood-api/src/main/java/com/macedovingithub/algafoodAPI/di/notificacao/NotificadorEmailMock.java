package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Autowired
	private NotificadorEmailProperties emailProperties;
	
	@Value("${exibe.path.java}")
	private String localJava;
	
	// Construtor uitlizado para debbug do Bean
	public NotificadorEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
//	-> Exibir as configurações do ambiente de desenvolvimento
		System.out.println("Java: " + localJava);
		System.out.println("Host: " + emailProperties.getHostServer());
		System.out.println("Porta: " + emailProperties.getPortaServidor());
		
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
