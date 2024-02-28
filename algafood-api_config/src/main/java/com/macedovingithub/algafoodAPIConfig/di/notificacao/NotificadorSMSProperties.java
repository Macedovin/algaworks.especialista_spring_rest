package com.macedovingithub.algafoodAPIConfig.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.sms")
public class NotificadorSMSProperties {
	
	/**
	 * Operadora de telefone utilizada
	 */
	private String operadoraTelefone;
	/**
	 * Número de DDD utilizado para contato 
	 */
	private Integer numeroDDD;
	
	public String getOperadoraTelefone() {
		return operadoraTelefone;
	}
	public void setOperadoraTelefone(String operaTelefone) {
		this.operadoraTelefone = operaTelefone;
	}
	public Integer getNumeroDDD() {
		return numeroDDD;
	}
	public void setNumeroDDD(Integer numeroDDD) {
		this.numeroDDD = numeroDDD;
	}	
	
}
