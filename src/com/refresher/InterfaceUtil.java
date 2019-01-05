package com.refresher;

interface InterfaceUtil {
	String greeting();
}

class USAGreeting implements InterfaceUtil {
	public String greeting() {
		System.out.println("Hello");
		return "Hello";
	}
}

class VietGreeting implements InterfaceUtil {
	public String greeting() {
		System.out.println("Xin chao");
		return "Xin chao";
	}
}

class MexicoGreeting implements InterfaceUtil {
	public String greeting() {
		System.out.println("Hola");
		return "Hola";
	}
}
