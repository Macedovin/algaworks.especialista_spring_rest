package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

public class NotificadorEmailMock implements Notificador {
	
	// Novas propriedades de configuração
	private boolean caixaAlta;
	private String hostServidorSMTP; 
	
	// Atribui propriedade no Construtor
	public NotificadorEmailMock(String hostServidorSMTP) {
		
		this.hostServidorSMTP = hostServidorSMTP;
		
		System.out.println("NotificadorEmail MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por e-mail...");
		
		// Verifica se apropriedade caixaAlta é utilizada
		if (this.caixaAlta) { 
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s, usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), hostServidorSMTP, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
