package com.macedovingithub.algafoodAPI.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.service.ClienteAtivadoEvent;

// Nova classe que também tem interesse em ESCUTAR o evento publicado
@Component
public class EmissaoNotaFsicalService {
		
//	-> Método que escuta e utiliza o EVENTO
	@EventListener
	@Order(1) // Modificando a ORDEM em que os eventos são escutados
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		
		System.out.println("Emitindo nota fiscal para " + event.getCliente().getNome() + ".");
		
	}
	
}
