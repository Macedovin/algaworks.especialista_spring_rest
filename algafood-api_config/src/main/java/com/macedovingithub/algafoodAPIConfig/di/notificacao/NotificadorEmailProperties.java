package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// -> Define a classe como sendo de CONFIGURAÇÃO
@ConfigurationProperties("notificador.email")
public class NotificadorEmailProperties {

	/**
	 * Host do servidor de email
	 */
	private String serverHost;
	/**
	 * Porta do servidor de email
	 */
	private Integer serverPort;
	public String getServerHost() {
		return serverHost;
	}
	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}
	public Integer getServerPort() {
		return serverPort;
	}
	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}	
			
}
