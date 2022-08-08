package Familia57;

import java.util.Scanner;

public class OláMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Primeira aula de java!!!
		
		System.out.println("Olá família 57!");
		
		
	//apresentação da aluna,seus dados e notas!
	
		String nome = "Gabriele ";
		int idade = 30,op; 
		double altura = 1.55,nota1,nota2,nota3,media;;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nVamos apresentar os dados da Gabriele e seua média:");
		System.out.println("\nNome da participante: "+nome);
		System.out.println("\nIdade da participante: "+idade+" ano(s) de vida");
		System.out.println("\nAltura da participante: "+altura);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
	
		System.out.printf("\nMédia aritmética: %.2f ",media);
        
		//a parti da meta vemos se ela esta aprovada,de exame ou reprovada!
		
		if(media>=7 && media<=10) {
			System.out.println("\nAluna aprovada!");
		} else if(media>=5 && media<7) {
			System.out.println("\nAluna de exame!");
		}else {
			System.out.printf("\nAluna reprovada!");
		}
		
		// Aprendendo a como fazer um breve menu
		System.out.println("\nLista de filmes");
		System.out.println("\n1- A procura da felicidade");
		System.out.println("\n2- Os vingadores");
		System.out.println("\n3- Prenda-me se for capaz");
		System.out.println("\n4- A ilha do medo");
		System.out.println("\n5- Velozes e furiosos");
	    System.out.println("\nDigite sua opção");
	    op = leia.nextInt();
	    switch(op) {
	    case 1:
	    	System.out.println("\nA procura da felicidade");
	    	break;
	    case 2:
	    	System.out.println("\nOs vingadores");
	    	break;
	    case 3:
	    	System.out.println("\nPrenda-me se for capaz");
	    	break;
	    case 4:
	    	System.out.println("\nA ilha do medo");
	    	break;
	    case 5:
	    	System.out.println("\nVelozes e Furiosos");
	    	break;
	    	default:
	    		System.out.println("\nOpção inválida!");
	    	
	    }
	    
	    //Aprendendo funções matematicas simples  
	    nota1 = Math.sqrt(nota2);
	    nota2 = Math.pow(nota3,3);
	
	}

}