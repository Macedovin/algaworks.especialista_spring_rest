package com.macedovingithub.algafoodAPIConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorEmail;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorSMS;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	@Primary
	public NotificadorSMS notiificadorSMS() {
		
		NotificadorSMS notificador = new NotificadorSMS();
		
		return notificador;
	}
}
