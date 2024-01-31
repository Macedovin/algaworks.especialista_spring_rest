package com.macedovingithub.algafoodAPI.di.notificacao;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}