package com.padroes.iterator;

import java.util.Iterator;

public class CanalIterator implements Iterator<Integer> {
	private Integer[] canais;
	private int index;
	
	public CanalIterator(Integer[] canais) {
		this.canais = canais;
	}
	
	
	@Override
	public boolean hasNext() {
		if (canais == null)
			return false;
		return canais[index] != null;
	}

	@Override
	public Integer next() {
		return canais[index++];
	}

}
