package com.macedovingithub.algafoodAPI.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.macedovingithub.algafoodAPI.di.modelo.Cliente;

@Component
// Implementa interfaces que controlam o ciclo de vida dos Beans -> NÃO RECOMENDADO
public class AtivacaoClienteService /*implements InitializingBean, DisposableBean */{
	
// 	-> Injetando Interface que permite a publicação de um EVENTO
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
//	@Autowired(required = false)
//  Injetando dependência usando Atributo
//	private Notificador notificador;
	
//	@Qualifier("urgente")  // Indentificando o bean a ser utilizado 
//	@TipoDoNotificador(NivelUrgencia.NORMAL)  // Utiliza a ANOTAÇÃO CUSTOMIZADA
//	@Autowired
//	private Notificador notificador;
	
//  RESOLVENDO DESAMBIGUAÇÃO -> Lista
//	private List<Notificador> notificadores;
	
//	@Autowired
//	// Injetando dependência usando Construtor com argumentos
//	// Utilizando uma Interface para redução de acoplamento
//	public AtivacaoClienteService(Notificador notificador) {
//		
//		this.notificador = notificador;
//		
//		System.out.println("AtivacaoClienteService: " + notificador);
//	}

//  Segundo CONSTRUTOR como exemplo -> Vai "confundir" o Spring
//	public AtivacaoClienteService(String qualquer) {
//		
//	}	

// 	ANOTAÇÃO que define o momento de chamada do método contido no BEAN como sendo no início do seu ciclo de vida
//	@PostConstruct
/*	public void init() {
		
		System.out.println("INIT " + notificador);
	}
*/

// 	ANOTAÇÃO que define o momento de chamada do método contido no BEAN como sendo no fim do seu ciclo vida	
// 	-> A interface DisposableBean possui método de mesmo nome -> NÃO RECOMENDADO
//	@PreDestroy
/*	@Override
	public void destroy() {
		
		System.out.println("DESTROY");
	}
*/
	
	public void ativar(Cliente cliente) {

		System.out.println("Cliente ativado.");
		
		cliente.ativar();

// 		Desambiguação com LISTA DE BEANS
// 		ENHANCED FOR -> Para cada notificador da Lista de Notificadores, notificar cliente 
//		for (Notificador notificador : notificadores) {
//			
//	 		Verifica a existência de um objeto notificador
//			if (notificador != null) {
//				notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
//			} else {
//				System.out.println("Não existe notificador, mas cliente foi ativado.");
//			}
//		}
		
//     	Sintaxe com uso do "Optional"
//		Optional.ofNullable(notificador)       // Verifica se é nulo o objeto com a classe Optional 
//	    .ifPresentOrElse(n -> n.notificar(cliente, "Seu cadastro no sistema está ativo!"),
//	         () -> System.out.println("Nemhum notificador encontrado, mas cliente foi ativado com sucesso.!"));

		// -------  Dizer para o container que o cliente está ativo no momento ----
//		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	
// 		-> Dipsarando e disponibilizando um EVENTO para toda a aplicação
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
	
// 	Adiciona um método requerido pela interface InitializingBean com nome predefinido
// -> NÃO RECOMENDADO
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		
//		System.out.println("INIT " + notificador);
//	}
	
//	@Autowired
//	// Injetando dependência refrenciando um dos SETTERS
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}

	
}
