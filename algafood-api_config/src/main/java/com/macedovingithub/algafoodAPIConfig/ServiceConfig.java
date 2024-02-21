package com.macedovingithub.algafoodAPIConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.macedovingithub.algafoodAPIConfig.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	// Instanciação e possível configurações da classe AtivacaoClienteService 
	// Utilizando um outro BEAN do tipo Notificador 
// 	-> Utilizando propriedades aceitas como ARGUMENTO para controle do ciclo de vida dos Beans
//	@Bean(initMethod="init", destroyMethod="destroy")
//	public AtivacaoClienteService ativacaoClienteService(/*@Qualifier("urgente")*/
//			@TipoDoNotificador(NivelUrgencia.NORMAL) Notificador notificador) {
//		
//		return new AtivacaoClienteService(notificador);
//	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		
		return new AtivacaoClienteService();
	}
}
