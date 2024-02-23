package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import org.springframework.beans.factory.annotation.Value;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	// Novas propriedades de configuração
	private boolean caixaAlta;
	private String hostServidorSMTP; 
	
// Novas propriedades de configuração CUSTOMIZADAS
	@Value("${notificador.email.server-host}")
	private String host;
	
	@Value("${notificador.email.server-port}")
	private int port;
	
	// Atribui propriedade no Construtor
	public NotificadorEmail(String hostServidorSMTP) {
		
		this.hostServidorSMTP = hostServidorSMTP;
		
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
// ->  Fazendo o debug de utilização das propriedades do arquivo deconfiguração
		System.out.println("Host: " + host);
		System.out.println("Porta: " + port);		
		
		// Verifica se apropriedade caixaAlta é utilizada
		if (this.caixaAlta) { 
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s, usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), hostServidorSMTP, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
