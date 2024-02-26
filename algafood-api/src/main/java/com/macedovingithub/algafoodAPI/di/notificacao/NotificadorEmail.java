package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Profile("prod")  // ANOTAÇÂO Profile e seu identificador de perfil
@TipoDoNotificador(NivelUrgencia.NORMAL)  // Utiliza a ANOTAÇÃO CUSTOMIZADA
//@Qualifier("urgente") // Utilizando identificador com nome mais abrangente
//@Qualifier("email")
//@Primary                                    
@Component
public class NotificadorEmail implements Notificador {
	
// -> Utilizando as PROPRIEDADES CUSTOMIZADAS
	@Value("${notificador.email.host-server}")
	private String host;
	
	@Value("${notificador.email.porta-servidor}")
	private int porta;
	
	@Value("${exibe.path.java}")
	private String localJava;
	
// 	-> Obtem VARIÁVEL DE AMBIENTE sem o arquivo de configuração
	@Value("${OS}")
	private String osEnvVar;
	
	// Construtor uitlizado para debbug do Bean
	public NotificadorEmail() {
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
// 	-> Fazendo o debugg do uso das propriedades
		System.out.println("Host: " + host);
		System.out.println("Porta: " + porta);
		System.out.println("Java: " + localJava);
		System.out.println("Sistema operacional: " + osEnvVar);
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
