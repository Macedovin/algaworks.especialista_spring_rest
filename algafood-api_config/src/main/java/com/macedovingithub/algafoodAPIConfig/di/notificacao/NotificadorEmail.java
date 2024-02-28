package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorEmailProperties emailProperties;
	
	// Novas propriedades de configuração
	private boolean caixaAlta;
	//private String hostServidorSMTP; 
/*
// Novas propriedades de configuração CUSTOMIZADAS
	@Value("${notificador.email.server-host}")
	private String host;
	
	@Value("${notificador.email.server-port}")
	private int port;
*/
	@Value("${exibe.path.java}")
	private String localJava;
	/*
	// Atribui propriedade no Construtor
	public NotificadorEmail(String hostServidorSMTP) {
		
		this.hostServidorSMTP = hostServidorSMTP;
		
		System.out.println("NotificadorEmail REAL");
	}
	*/
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
// ->  Fazendo o debug de utilização das propriedades do arquivo deconfiguração
		//System.out.println("Host: " + emailProperties.getServerHost());
		System.out.println("Porta: " + emailProperties.getServerPort());
		System.out.println("Java: " + localJava);
		
		// Verifica se apropriedade caixaAlta é utilizada
		if (this.caixaAlta) { 
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s, usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), emailProperties.getServerHost()/*hostServidorSMTP*/, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
