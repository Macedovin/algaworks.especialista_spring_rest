package com.macedovingithub.algafoodAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "Hello!";
	}
}