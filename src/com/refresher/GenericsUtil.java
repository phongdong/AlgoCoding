package com.refresher;

public class GenericsUtil<T> {
	T gen;
	public GenericsUtil(T gen) {
		this.gen = gen;
	}
	public T getGen() {
		System.out.println(this.gen);
		return this.gen;
	}
}
