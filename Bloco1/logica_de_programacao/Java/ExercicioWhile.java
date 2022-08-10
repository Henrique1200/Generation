package Familia57;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Enunciado:Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

		int idade,genero,fp,contpc=0,contmn=0,contha=0,contbc=0,contpn40=0,contpc18=0,p=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(p<=5) {
			
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nEntre com o seu gênero:\n1-Feminino\n2-Masculino\n3-Binário ");
			genero = leia.nextInt();
			System.out.println("\nEntre com o fator psicológico:\n1- Calma\n2-Nervosa\n3-Agressiva");
			fp = leia.nextInt();
			
			if(fp==1) {
				contpc++;
			}
			
			if(genero == 1 && fp == 2) {
				contmn++;
			}
			
			if(genero == 2 && fp == 3) {
				contha++;
			}
			
			if(genero == 3 && fp == 1) {
				contbc++;
			}
			
			if(fp == 2 && idade>40) {
				contpn40++;
			}
			
			if(fp == 1 && idade <18) {
				contpc18++;
			}
			p++;
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+contpc);
		System.out.println("\nNúmero de mulheres nervosas: "+contmn);
		System.out.println("\nNúmero de homens agressivos: "+contha);
		System.out.println("\nNúmero de pessoas binárias calmas: "+contbc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contpc18);

	}

}
