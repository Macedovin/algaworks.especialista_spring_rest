package com.macedovingithub.algafoodAPI.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.notificacao.NivelUrgencia;
import com.macedovingithub.algafoodAPI.di.notificacao.Notificador;
import com.macedovingithub.algafoodAPI.di.notificacao.TipoDoNotificador;
import com.macedovingithub.algafoodAPI.di.service.ClienteAtivadoEvent;

// Classe que tem interesse em ESCUTAR o evento publicado
@Component
public class NotificacaoService {

// 	-> Injetando a classe que faz a notificação e especificando o método a notificar
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador; 
	
// 	-> Método que escuta e utiliza o EVENTO
	@EventListener
	@Order(0) // Modificando a ORDEM em que os eventos são escutados
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		
		System.out.println("Clinete " + event.getCliente().getNome() + " agora está ativo.");
		
//		Notificando o cliente
		notificador.notificar(event.getCliente(), "Seu cadastro está ativo!");
	}
}
