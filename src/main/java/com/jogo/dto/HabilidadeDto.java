package com.jogo.dto;

import com.jogo.model.Habilidade;

public class HabilidadeDto {

	private String botao;
	private String nome;
	private String descricacao;
	private String custo;
	private double alcance;

	public HabilidadeDto() {
		super();
	}

	public HabilidadeDto(Habilidade hab) {

		this.botao = hab.getBotao().getDescricao();
		this.nome = hab.getNome();
		this.descricacao = hab.getDescricacao();
		this.custo = hab.getCusto();
		this.alcance = hab.getAlcance();
	}

	public String getBotao() {
		return botao;
	}

	public void setBotao(String botao) {
		this.botao = botao;
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

}
