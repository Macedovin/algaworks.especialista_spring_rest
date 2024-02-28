package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Profile("prod")  // ANOTAÇÂO Profile e seu identificador de perfil
@TipoDoNotificador(NivelUrgencia.NORMAL)    // Utiliza a ANOTAÇÃO CUSTOMIZADA
//@Qualifier("normal") // Utilizando identificador com nome mais abrangente
//@Qualifier("sms")
//@Primary
@Component
public class NotificadorSMS implements Notificador {
	
	@Autowired
	private NotificadorSMSProperties properties;
	
	public NotificadorSMS() {
		System.out.println("NotificadorSMS");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Notificar cliente por SMS...");
// 	-> Exibe as configurações do SMS
		System.out.println("DDD: " + properties.getNumeroDDD());
		System.out.println("Host: " + properties.getHostServidor());
		System.out.println("Porta: " + properties.getPortaServidor());
		
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
