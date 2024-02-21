package com.macedovingithub.algafoodAPIConfig;

import org.springframework.context.annotation.Bean;

import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorEmail;
import com.macedovingithub.algafoodAPIConfig.di.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {
	
	// Instanciação e configurações da classe NotificadorEmail
	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	// Instanciação e possível configurações da classe AtivacaoClienteService 
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		
		//return new AtivacaoClienteService(notificadorEmail());
		return new AtivacaoClienteService();
	}
	
	
	// Passando um objeto tipo Notificador como ARGUMENTO -> Funciona pois só tehnho um tipo 
	/*
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		
		return new AtivacaoClienteService(notificador);
	}
	*/
}
