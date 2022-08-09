package Familia57;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor,somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		do 
		{
			
			System.out.println("Entre com um valor:");
			valor = leia.nextInt();
			somaValor += valor;
			
		}while(somaValor<=300);
	
		System.out.println("\nSomatório dos valores: "+somaValor);
	}

}
