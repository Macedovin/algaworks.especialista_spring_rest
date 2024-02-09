package com.macedovingithub.algafoodAPIConfig;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.macedovingithub.algafoodAPIConfig.di.notificacao.Notificador;
import com.macedovingithub.algafoodAPIConfig.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	// Instanciação e possível configurações da classe AtivacaoClienteService 
	// Utilizando um outro BEAN do tipo Notificador 
	@Bean
	public AtivacaoClienteService ativacaoClienteService(/*@Qualifier("urgente")*/ 
			List<Notificador> notificador) {
		
		return new AtivacaoClienteService(notificador);
	}
}
