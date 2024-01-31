package com.macedovingithub.algafoodAPI.di.service;

import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;
import com.macedovingithub.algafoodAPI.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	public NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
