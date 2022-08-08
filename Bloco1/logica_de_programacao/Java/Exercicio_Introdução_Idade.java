package Familia57;

import java.util.Scanner;
public class Exercicio_Introdução_Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Enunciado:Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		
		int anos, meses, dias;
		int idadeemdias;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("\nDigite sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite sua idade em dias: ");
		dias = leia.nextInt();
		
		idadeemdias = anos * 365 + meses * 30 + dias;
		
		System.out.println("\nIdade em dias: "+idadeemdias);
		

	}

}
