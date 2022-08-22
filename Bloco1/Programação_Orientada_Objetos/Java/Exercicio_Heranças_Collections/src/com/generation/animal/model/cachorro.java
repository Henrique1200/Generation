package com.generation.animal.model;

public class cachorro extends animal {
	
	public cachorro(String nome, int idade) {
		super(nome, idade);
	
	}
	@Override
	public void acao() {
		System.out.println("O cachorro esta correndo!");
	}
	@Override
	public void emitirSom() {
		System.out.println("auau");
	}

}
