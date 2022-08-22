package com.generation.optional;


import java.util.*;

public class Optional10 {

	public static void main(String[] args) {
		
		String[] palavras = new String [10];
		palavras[5] = "Turma 57 é top!!";
		
		//criar um optional para não dar erro:
		//Evitar erros NullPointerException.
		//Parar de fazer verificações de valor nulo do tipo

		
		Optional <String> checarNulo = Optional.ofNullable(palavras[5]);
		
		if (checarNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			
			System.out.println(palavra);
		}else {
			System.out.println("\nA palavra é nula");
		}
		System.out.println(checarNulo.isEmpty());
		System.out.println(checarNulo.get());
		System.out.println(checarNulo);
		

	}

}
