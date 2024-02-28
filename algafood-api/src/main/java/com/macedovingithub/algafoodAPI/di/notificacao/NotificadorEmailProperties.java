package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// -> Define a classe como sendo de CONFIGURAÇÃO
@ConfigurationProperties("notificador.email")
public class NotificadorEmailProperties {
	
	/**
	 * Host do servidor de email
	 */
	private String hostServer;
	/**
	 * Porta do servidor de email
	 */
	private Integer portaServidor = 25;
	
	public String getHostServer() {
		return hostServer;
	}
	public void setHostServer(String hostServer) {
		this.hostServer = hostServer;
	}
	public Integer getPortaServidor() {
		return portaServidor;
	}
	public void setPortaServidor(Integer portaServidor) {
		this.portaServidor = portaServidor;
	}	
	
}
