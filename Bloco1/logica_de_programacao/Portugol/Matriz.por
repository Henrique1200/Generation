programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][2],somaNumeros=0,linha,coluna
		
		

		para(linha=0;linha<3;linha++){
			para(coluna=0;coluna<2;coluna++){
				escreva("\nEntre com um número: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]
			}
		}
		escreva("\nSomatório dos números foi de: ",somaNumeros)
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */