package com.macedovingithub.algafoodAPI.di.service;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

// Criado o EVENTO que informa a ativação de um cliente
public class ClienteAtivadoEvent {

// 	-> Fornecendo informações úteis para o EVENTO 
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}	
}
