package com.SpringBoot2.SpringBoot2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atividadeboaz2")
public class AtividadeController {

	@GetMapping
	public String atividade() {
		return "Aprender Spring-Boot com Boaz! boladão ";
	}
}
