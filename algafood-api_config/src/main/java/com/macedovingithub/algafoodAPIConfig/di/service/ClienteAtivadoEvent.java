package com.macedovingithub.algafoodAPIConfig.di.service;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

// Calsse que funciona como EVENTO
public class ClienteAtivadoEvent {

// -> Foncedndo dados para utilização do evento	
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}	
}
