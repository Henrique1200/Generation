programa
{
	inclua biblioteca Objetos
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real media[3],n1,n2,n3,somaMedia=0.0, mediaGeral
		inteiro x

		para (x=0; x<3;x++){
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)
			media[x] = (n1+n2+n3)/3
			escreva("\nMédia aritmética: ",Matematica.arredondar(media[x], 2))
			somaMedia += media[x]
		}
		mediaGeral = somaMedia /3
		escreva("\nMédia geral: ",mediaGeral)
		para(x=0;x<3;x++)
		{
			escreva("\n Média alune ",x+1, "foi de: ", media[x])
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media, 8, 7, 5}-{n1, 8, 16, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */