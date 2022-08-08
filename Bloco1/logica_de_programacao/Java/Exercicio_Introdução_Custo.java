package Familia57;

import java.util.Scanner;

public class Exercicio_Introdução_Custo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Exercicio introdução ao algoritmo
		/*Enunciado:O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.*/
		
		double custof  , percentagemd , percentagemi , custot;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o custo de fabrica do veiculo:");
		custof = leia.nextDouble();
		percentagemd = (0.28*custof) ;
		percentagemi = (0.45*custof ); 

	    custot = (custof+percentagemd+percentagemi);
		
	    System.out.println("\nCusto do distribuidor: "+percentagemd);
	    System.out.println("\nValor dos impostos: "+percentagemi);
	    System.out.println("\nCusto do distribuidor: "+custot);
		
	}

}
