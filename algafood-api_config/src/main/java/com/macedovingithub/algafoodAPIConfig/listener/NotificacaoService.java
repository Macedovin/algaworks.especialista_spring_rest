package com.macedovingithub.algafoodAPIConfig.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPIConfig.di.notificacao.NivelUrgencia;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.Notificador;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.TipoDoNotificador;
import com.macedovingithub.algafoodAPIConfig.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Cliente " + event.getCliente().getNome() + " agora esta ativo.");
		
		notificador.notificar(event.getCliente(), "Seu cadastro está ativo!");
	}
}
