package com.jogo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.jogo.model.enuns.Botao;

@Entity
public class Habilidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private Botao botao;
	private String nome;
	private String descricacao;
	private String custo;
	private double alcance;

	@ManyToOne(cascade = CascadeType.ALL)
	private Personagem personagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public String getCusto() {
		return custo;
	}

	public void setCusto(String custo) {
		this.custo = custo;
	}

	public double getAlcance() {
		return alcance;
	}

	public void setAlcance(double alcance) {
		this.alcance = alcance;
	}

	public Botao getBotao() {
		return botao;
	}

	public void setBotao(Botao botao) {
		this.botao = botao;
	}

}
