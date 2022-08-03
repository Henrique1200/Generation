programa
{
	
	funcao inicio()
	{
		inteiro lin,col, mat[3][3],somaMat=0, somaDiag=0

		para (lin=0;lin<3;lin++){
			para (col=0;col<3;col++)
			{
				escreva ("\nEntre com valores para preencher a tabela: ")
				leia (mat[lin][col])
				somaMat+=mat[lin][col]

				se (lin == col)
				somaDiag+=mat[lin][col]
				
			}

		}
		escreva("\n A soma de todos os valores da matriz é de: ", somaMat)
		escreva("\n A soma da diagonal principal da matriz é de: " ,somaDiag)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 19, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */