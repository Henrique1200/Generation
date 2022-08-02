programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real custof , percentagemd , percentagemi , custot
		escreva("\nEntre com o custo de fabrica do veiculo:")
	     leia (custof)
	    percentagemd = 0.28*custof
	    percentagemi = 0.45*custof
	    custot = custof+percentagemd+percentagemi
	    escreva("\nCusto do distribuidor: " , percentagemd)
	    escreva("\nValor dos impostos: " , percentagemi)
	    escreva("\nCusto ao consumidor: ",custot)
	
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */