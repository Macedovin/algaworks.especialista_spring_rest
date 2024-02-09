package com.macedovingithub.algafoodAPI.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
// -> Cria uma Anotação que vai ser reconhecida pelo Spring permanecendo em TEMPO DE EXECUÇÃO
public @interface TipoDoNotificador {

	NivelUrgencia value();
}
