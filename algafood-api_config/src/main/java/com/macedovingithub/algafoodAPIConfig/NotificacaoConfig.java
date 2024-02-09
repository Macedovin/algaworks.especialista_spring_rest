package com.macedovingithub.algafoodAPIConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.macedovingithub.algafoodAPIConfig.di.notificacao.NivelUrgencia;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorEmail;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorSMS;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.TipoDoNotificador;

@Configuration
public class NotificacaoConfig {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE) // Utiliza a ANOTAÇÃO CUSTOMIZADA
	//@Qualifier("urgente")
	@Bean
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@TipoDoNotificador(NivelUrgencia.NORMAL) // Utiliza a ANOTAÇÃO CUSTOMIZADA
	//@Qualifier("normal")
	@Bean
	//@Primary
	public NotificadorSMS notiificadorSMS() {
		
		NotificadorSMS notificador = new NotificadorSMS();
		
		return notificador;
	}
}
