package com.padroes.iterator;

import java.util.Iterator;
import java.util.Random;

public class TV implements Iterable<Integer> {

	private Integer[] canais;

	public TV() {
		this.canais = new Integer[30];
	}

	public void inicializaCanais() {
		Random r = new Random();
		int canaisCount = 0;
		for (int i = 0; i < this.canais.length; i++) {
			if (r.nextInt(2) == 1) {
				canais[canaisCount++] = i;
			}
		}
		System.out.println("Achei" + canaisCount + " canais");
	}

	@Override
	public Iterator<Integer> iterator() {
		return new CanalIterator(canais);
	}

}
