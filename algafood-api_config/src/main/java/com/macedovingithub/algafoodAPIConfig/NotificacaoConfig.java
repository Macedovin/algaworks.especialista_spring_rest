package com.macedovingithub.algafoodAPIConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.macedovingithub.algafoodAPIConfig.di.notificacao.NivelUrgencia;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorEmail;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorEmailMock;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorEmailProperties;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.NotificadorSMS;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.TipoDoNotificador;

@Configuration
public class NotificacaoConfig {
	
	@Autowired
	private NotificadorEmailProperties emailProperties;
	
	@Value("${exibe.path.java}")
	private String localJava;
	
	@Profile("prod") // Utiliza a ANOTAÇÃO Profile e o identificador de perfil 
	@TipoDoNotificador(NivelUrgencia.NORMAL) // Utiliza a ANOTAÇÃO CUSTOMIZADA
	//@Qualifier("urgente")
	@Bean
	//@Primary // Fazendo desambiguação
	public NotificadorEmail notificadorEmail() {
		
		NotificadorEmail notificador = new NotificadorEmail(/*"smtp.algamail.com.br"*/);
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Profile("dev") // Utiliza a ANOTAÇÃO Profile e o identificador de perfil
	@TipoDoNotificador(NivelUrgencia.URGENTE) // Utiliza a ANOTAÇÃO CUSTOMIZADA
	@Bean
	public NotificadorEmailMock notificadorEmailmock() {
		
		NotificadorEmailMock notificador = new NotificadorEmailMock("smtp.algamail.com.br", localJava, emailProperties);
		notificador.setCaixaAlta(false);
		
		return notificador;
	}
	
	@Profile("prod") // Utiliza a ANOTAÇÃO Profile e o identificador de perfil
	@TipoDoNotificador(NivelUrgencia.NORMAL) // Utiliza a ANOTAÇÃO CUSTOMIZADA
	//@Qualifier("normal")
	@Bean
	@Primary
	public NotificadorSMS notificadorSMS() {
		
		NotificadorSMS notificador = new NotificadorSMS();
		
		return notificador;
	}
}
