package com.jogo.dto;

import java.util.ArrayList;
import java.util.List;

import com.jogo.model.Habilidade;
import com.jogo.model.Personagem;

public class PersonagemDto {

	private String nome;
	private String descricao;
	private String regenVida;
	private String armadura;
	private String armaduraMagica;
	private String velocidadeAtaque;
	private String velocidadeMovimento;
	private String vida;
	private String energia;
	private int valorIp;
	private List<HabilidadeDto> habilidades;

	public PersonagemDto(Personagem personagem) {
		this.habilidades = new ArrayList<HabilidadeDto>();
		this.nome = personagem.getNome();
		this.descricao = personagem.getDescricao();
		this.regenVida = personagem.getRegenVida();
		this.armadura = personagem.getArmadura();
		this.armaduraMagica = personagem.getArmaduraMagica();
		this.velocidadeAtaque = personagem.getVelocidadeAtaque();
		this.velocidadeMovimento = personagem.getVelocidadeMovimento();
		this.vida = personagem.getVida();
		this.energia = personagem.getEnergia();
		this.valorIp = personagem.getValorIp();

		for (Habilidade hab : personagem.getHabilidades()) {

			HabilidadeDto habilidade = new HabilidadeDto(hab);
			this.habilidades.add(habilidade);
		}
	}

	public PersonagemDto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRegenVida() {
		return regenVida;
	}

	public void setRegenVida(String regenVida) {
		this.regenVida = regenVida;
	}

	public String getArmadura() {
		return armadura;
	}

	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}

	public String getArmaduraMagica() {
		return armaduraMagica;
	}

	public void setArmaduraMagica(String armaduraMagica) {
		this.armaduraMagica = armaduraMagica;
	}

	public String getVelocidadeAtaque() {
		return velocidadeAtaque;
	}

	public void setVelocidadeAtaque(String velocidadeAtaque) {
		this.velocidadeAtaque = velocidadeAtaque;
	}

	public String getVelocidadeMovimento() {
		return velocidadeMovimento;
	}

	public void setVelocidadeMovimento(String velocidadeMovimento) {
		this.velocidadeMovimento = velocidadeMovimento;
	}

	public String getVida() {
		return vida;
	}

	public void setVida(String vida) {
		this.vida = vida;
	}

	public String getEnergia() {
		return energia;
	}

	public void setEnergia(String energia) {
		this.energia = energia;
	}

	public int getValorIp() {
		return valorIp;
	}

	public void setValorIp(int valorIp) {
		this.valorIp = valorIp;
	}

	public List<HabilidadeDto> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<HabilidadeDto> habilidades) {
		this.habilidades = habilidades;
	}

}
