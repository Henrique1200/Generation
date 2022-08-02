programa
{
	
	funcao inicio()
	{
      inteiro c,n,excesso
	 real salTotal, salExc
	 
		escreva("\nEntre com o seu código: ")
		leia(c) 
		escreva("\nEntre com o número de horas trabalhadas: ")
		leia(n)

		se (n>50)
		{
			excesso = n - 50
			salExc = excesso * 20
			salTotal = 500 + salExc
		}
		senao {
			excesso = 0 
			salExc = 0
			salTotal = n * 10
			
		}
		escreva("\nSalário total: " , salTotal)
		escreva("\nSalário excedente: ",salExc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */