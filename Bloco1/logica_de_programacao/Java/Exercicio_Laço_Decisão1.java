package Familia57;

import java.util.Scanner;
public class Exercicio_Laço_Decisão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enunciado: Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite um número: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite um número: ");
		n3 = leia.nextInt();
		
		if (n1>=n2 && n1>=n3){
			System.out.println("\nO maior número é  "+n1);
		} else if (n2>=n1 && n2>=n3){
			System.out.println("\nO maior número é  "+n2);
		}else {
			System.out.println("\nO maior número é  "+n3);
		}
		
		
		

	}

}
