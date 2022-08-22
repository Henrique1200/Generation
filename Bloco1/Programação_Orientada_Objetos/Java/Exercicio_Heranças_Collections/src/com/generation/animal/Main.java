package com.generation.animal;

import java.util.ArrayList;

import com.generation.animal.model.*;

public class Main {

	public static void main(String[] args) {
	
		cachorro cachorro = new cachorro("Thor", 3);
		preguica preguica = new preguica("Manhosa", 2);
		cavalo cavalo = new cavalo("Sortudo", 6);
	

		 
		 cachorro.acao();
		 cachorro.emitirSom();
		 preguica.acao();
		 preguica.emitirSom();
		 cavalo.acao();
		 cavalo.emitirSom();
	}

}
