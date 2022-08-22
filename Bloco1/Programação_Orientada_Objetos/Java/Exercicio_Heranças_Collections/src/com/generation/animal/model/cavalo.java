package com.generation.animal.model;

public class cavalo extends animal {

	public cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void acao() {
		System.out.println("O cavalo esta correndo!");
	}
	@Override
	public void emitirSom() {
		System.out.println("relinchando");
	}
}
