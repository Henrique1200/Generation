package Familia57;

import java.util.Scanner;

public class Exemplo_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,somaNumero=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		
		while(numero!=0) {
			
			if(numero % 3 == 0) {
				somaNumero += numero;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		System.out.println("\nSomatório dos números múltiplos de 3: "+somaNumero);
	}

}
