package com.macedovingithub.di.notification;

import com.macedovingithub.di.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
}
