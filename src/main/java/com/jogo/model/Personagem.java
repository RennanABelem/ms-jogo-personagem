package com.jogo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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

	@OneToMany(mappedBy = "personagem", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Habilidade> habilidades;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

}
