package com.macedovingithub.algafoodAPIConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.macedovingithub.algafoodAPIConfig.di.modelo.Cliente;
import com.macedovingithub.algafoodAPIConfig.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		
		this.ativacaoClienteService = ativacaoClienteService;
	
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		System.out.println("--Teste:");
		
		Cliente joao = new Cliente("João", "joao@xyzemail.com", "21999998888");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
}