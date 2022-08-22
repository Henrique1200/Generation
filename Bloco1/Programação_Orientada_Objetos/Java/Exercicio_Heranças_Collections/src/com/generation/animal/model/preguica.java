package com.generation.animal.model;

public class preguica extends animal {
	
	public preguica(String nome, int idade) {
	super(nome, idade);
	// TODO Auto-generated constructor stub
}
@Override
public void acao() {
	System.out.println("A preguica esta dormindo!");
}
@Override
public void emitirSom() {
	System.out.println("zzzzzzz");
}
	
	

}
