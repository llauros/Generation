package com.generationhalloworld.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atvdois")
public class ObjetivosAprendAtvDois {
	@GetMapping
	public String atividade2() {
		return "<h1 align='center'>Atividade</h1><p align='center'>Desejo Ser Dev Back End Java Senior com Esteroides</p>";
	}
}
