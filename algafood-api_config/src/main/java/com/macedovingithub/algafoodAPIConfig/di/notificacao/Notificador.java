package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}