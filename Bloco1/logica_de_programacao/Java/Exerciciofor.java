package Familia57;

import java.util.Scanner;

public class Exerciciofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Enunciado:Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/

		int num;
		
		for(num=1000;num<=1999;num++) {
			
			if(num % 11 == 5) {
				System.out.println("\n Número: "+num);
			}
		}
	}
}

			
			
		
