package com.SpringBoot1.SpringBoot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atividadeboaz")
public class AtividadeController {

	@GetMapping
	public String atividade() {
		return "Persistencia e atenção aos detalhes!";
	}
}
