package com.jogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogo.dto.PersonagemDto;
import com.jogo.service.PersonagemService;

@RestController
@RequestMapping("personagem")
public class PersonagemController {

	@Autowired
	private PersonagemService service;

	@GetMapping("buscarTodos")
	public ResponseEntity<List<PersonagemDto>> buscarTodos() {
		return new ResponseEntity<List<PersonagemDto>>(service.buscarTodos(), HttpStatus.OK);
	}

	@PostMapping("salvar")
	public ResponseEntity<PersonagemDto> salvar(@RequestBody PersonagemDto personagemDto) {
		return new ResponseEntity<PersonagemDto>(service.salvar(personagemDto), HttpStatus.CREATED);
	}

}
