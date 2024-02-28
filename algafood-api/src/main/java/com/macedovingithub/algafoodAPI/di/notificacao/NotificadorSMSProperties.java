package com.macedovingithub.algafoodAPI.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// -> Define a classe como sendo de CONFIGURAÇÃO
@ConfigurationProperties("notificador.sms")
public class NotificadorSMSProperties {
	
	/**
	 * Host do servidor de SMS
	 */
	private String hostServidor;
	/**
	 * Porta do servidor de SMS
	 */
	private Integer portaServidor;
	/**
	 * Número de prefixo DDD do telefone
	 */
	private Integer numeroDDD = 21;
	
	public String getHostServidor() {
		return hostServidor;
	}
	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}
	public Integer getPortaServidor() {
		return portaServidor;
	}
	public void setPortaServidor(int portaServidor) {
		this.portaServidor = portaServidor;
	}
	public Integer getNumeroDDD() {
		return numeroDDD;
	}
	public void setNumeroDDD(Integer numeroDDD) {
		this.numeroDDD = numeroDDD;
	}
	
}
