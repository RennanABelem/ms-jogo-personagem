package com.jogo.service;

import java.util.List;

import com.jogo.dto.PersonagemDto;
import com.jogo.model.Personagem;

public interface PersonagemService {

	public List<PersonagemDto> buscarTodos();
	public PersonagemDto salvar(PersonagemDto personagemDto);
}
