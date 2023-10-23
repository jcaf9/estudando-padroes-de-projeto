package com.padroes.prototype;
public class Endereco implements Cloneable{
	private String rua;

	public Endereco(String rua) {
		this.rua = rua;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
