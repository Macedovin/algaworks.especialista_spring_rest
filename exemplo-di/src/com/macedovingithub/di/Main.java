package com.macedovingithub.di;

import java.math.BigDecimal;

import com.macedovingithub.di.model.Cliente;
import com.macedovingithub.di.model.Produto;
import com.macedovingithub.di.notification.Notificador;
import com.macedovingithub.di.notification.NotificadorEmail;
import com.macedovingithub.di.service.AtivacaoClientService;
import com.macedovingithub.di.service.EmissaoNotaFiscalService;

public class Main {

	public static void main(String[] args) {
		
		// Instancia alguns clientes
		Cliente joao = new Cliente("João", "joao@xyzemail.com", "21999998888");
		
		Cliente maria = new Cliente ("Maria", "maria@zzzemail.com", "2299998888");
		
		// Instancia um dos tipos de Notificador existentes
		Notificador notificador = new NotificadorEmail();
	
		// Instancia o serviço de ativação
		AtivacaoClientService ativacaoCliente = new AtivacaoClientService(notificador);
		
		// Ativa os clientes
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		
		// Instancia um produto
		Produto teclado = new Produto("Teclado", new BigDecimal("120.0"));
		
		// Instancia o serviço de emissão de nota fiscal
		EmissaoNotaFiscalService emissaNotaFiscal = new EmissaoNotaFiscalService(notificador);
		
		// Notifica o envio de email
		emissaNotaFiscal.emitir(maria, teclado);
	}
}
