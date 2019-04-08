package com.jogo.model.enuns;

public enum Botao {

	PASSIVA("passiva"), Q("q"), W("w"), E("e"), R("r");

	private String descricao;

	Botao(String texto) {
		descricao = texto;
	}

	public static Botao buscarPorTipo(String texto) {
		for (Botao botao : values()) {
			if (botao.descricao.equalsIgnoreCase(texto))
				return botao;
		}
		return null;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
