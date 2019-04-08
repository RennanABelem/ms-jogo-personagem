package com.jogo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogo.dto.HabilidadeDto;
import com.jogo.dto.PersonagemDto;
import com.jogo.model.Habilidade;
import com.jogo.model.Personagem;
import com.jogo.model.enuns.Botao;
import com.jogo.repository.PersonagemRepository;
import com.jogo.service.PersonagemService;

@Service
public class PersoangemServiceImpl implements PersonagemService {

	@Autowired
	private PersonagemRepository repository;

	@Override
	public List<PersonagemDto> buscarTodos() {
		List<Personagem> personagens = repository.findAll();
		List<PersonagemDto> responses = new ArrayList<PersonagemDto>();

		for (Personagem pergonagem : personagens) {

			PersonagemDto response = new PersonagemDto(pergonagem);
			responses.add(response);
		}

		return responses;
	}

	@Override
	public PersonagemDto salvar(PersonagemDto personagemDto) {
		repository.save(this.parseDto(personagemDto));
		return personagemDto;
	}

	private Personagem parseDto(PersonagemDto personagemDto) {
		Personagem personagem = new Personagem();
		List<Habilidade> habilidades = new ArrayList<Habilidade>();

		personagem.setNome(personagemDto.getNome());
		personagem.setDescricao(personagemDto.getDescricao());
		personagem.setArmadura(personagemDto.getArmadura());
		personagem.setArmaduraMagica(personagemDto.getArmaduraMagica());
		personagem.setRegenVida(personagemDto.getRegenVida());
		personagem.setVelocidadeAtaque(personagemDto.getVelocidadeAtaque());
		personagem.setVelocidadeMovimento(personagemDto.getVelocidadeMovimento());
		personagem.setVida(personagemDto.getVida());
		personagem.setEnergia(personagemDto.getEnergia());
		personagem.setValorIp(personagemDto.getValorIp());

		for (HabilidadeDto hab : personagemDto.getHabilidades()) {

			Habilidade habilidade = new Habilidade();
			habilidade.setNome(hab.getNome());
			habilidade.setDescricacao(hab.getDescricacao());
			habilidade.setCusto(hab.getCusto());
			habilidade.setAlcance(hab.getAlcance());
			habilidade.setBotao(Botao.buscarPorTipo(hab.getBotao()));
			habilidade.setPersonagem(personagem);
			habilidades.add(habilidade);
		}
		personagem.setHabilidades(habilidades);

		return personagem;
	}

}
