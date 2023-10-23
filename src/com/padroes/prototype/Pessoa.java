package com.padroes.prototype;

public class Pessoa implements Cloneable {
	private String nome;
	private String sobrenome;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Pessoa pessoaClone = (Pessoa) super.clone();
		pessoaClone.endereco = (Endereco) endereco.clone();
		return super.clone();
	}
}
