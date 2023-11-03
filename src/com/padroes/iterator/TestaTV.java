package com.padroes.iterator;

public class TestaTV {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.inicializaCanais();
		for(Integer canal: tv) {
			System.out.println(String.format("To no canal #%d", canal));
		}
	}
}
