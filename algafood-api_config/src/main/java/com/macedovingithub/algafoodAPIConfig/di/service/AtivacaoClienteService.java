package com.macedovingithub.algafoodAPIConfig.di.service;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;
import com.macedovingithub.algafoodAPIConfig.di.notificacao.Notificador;

//@Component
public class AtivacaoClienteService {

// 	Ponto de injeção de dependência pelo atributo/ propriedade
//	@Autowired(required = false)
	private Notificador notificador;
	
	//@Autowired
	// Injetando dependência usando Construtor com argumentos
	// Utilizando uma Interface para redução de acoplamento
	public AtivacaoClienteService(Notificador notificador) {
		
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}
	
//	@PostConstruct -> Com a ANOTAÇÂO Config vai ser chamado de outra forma
	public void init() {
		
		System.out.println("INIT");
	}
	
//	@PreDestroy -> Com a ANOTAÇÂO Config vai ser chamado de outra forma
	public void destroy() {
		
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		
		System.out.println("Cliente ativado.");
		
		cliente.ativar();

// 		Verificando se há ou não um BEAN tipo Notificador
		if (notificador != null) {
			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		} else {
			
			System.out.println("Não existe notificador, mas cliente foi ativado.");
		}
		
// 		Verificando com o uso da classe OPTIONAL
		
//		Optional.ofNullable(notificador)
//			.ifPresentOrElse(n -> n.notificar(cliente, "Seu cadastro no sistema está ativo!"),
//					() -> System.out.println("Não existe notificador, mas cliente foi ativado."));
	}

// 	Ponto de injeção dependência pelo SETTER
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	
	
}
