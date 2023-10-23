package com.padroes.prototype;

public class TestaPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pessoa joao = new Pessoa();
		joao.setNome("joao");
		joao.setEndereco(new Endereco("rua 1"));
		Pessoa cloneDoJoao = (Pessoa) joao.clone();
		cloneDoJoao.setNome("Joaquim");
		if (!joao.getNome().equals(cloneDoJoao.getNome())) {
			System.out.println("Prototype funcionando!@@");
		} else {
			System.out.println("Prototype falhou!@");
		}
		System.out.println(joao.getNome());
		System.out.println(cloneDoJoao.getNome());
	}
}
