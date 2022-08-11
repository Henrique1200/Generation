package Familia57;

import java.util.Scanner;

public class ExercicioArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int[6];
		int somaPar=0 , quantImpar=0,x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("Entre com um número: ");
			num [x] = leia.nextInt();
			
			if (num [x] %2 ==1);{
			quantImpar++;} 
		
	          
			somaPar += num [x];
			
			
		}
		System.out.println("\nOs números ímpares foram: ");
		for (int y=0;y<6;y++) {
			
			if (num[y]%2==1) {
				System.out.println(num[y]);
			}
		}
		System.out.println("Os números pares foram: ");
		for (int z=0;z<6;z++) {
			if (num[z]%2==0) {
				System.out.println(num[z]);
			}
		}
		
		
		System.out.println("A soma dos números pares é: "+somaPar);
		System.out.println("A quantidade de números ímpares é de: "+quantImpar);
		
		
	
		
	}

}


