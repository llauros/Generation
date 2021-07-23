package com.generationhalloworld.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atvum")
public class HabilMentAtvUmController {
	@GetMapping
	public String atividade1() {
		return "<h1 align='center'>Atividade 01</h1>"
				+ "<div><h3 align='center'>Habilidades:</h3>"
				+ "<p align='center'>Atenção aos detalhes !</p>"
				+ "<h3 align='center'>Mentalidades:</h3>"
				+ "<p align='center'>Persistencia</p>"
				+ "</div>";
	}
}
