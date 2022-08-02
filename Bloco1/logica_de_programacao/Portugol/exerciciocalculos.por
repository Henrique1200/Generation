programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	inteiro a,b,c
	real d
	
		escreva("\nEntre com o valor de a: ")
		leia(a)
		escreva("\nEntre com o valor de b: ")
		leia(b)
		escreva("\nEntre com o valor de c: ")
		leia(c)

		d = (mat.potencia((a+b), 2.0)+ mat.potencia((b+c), 2.0))/2

          escreva("\nO valor de D é: ",d)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */