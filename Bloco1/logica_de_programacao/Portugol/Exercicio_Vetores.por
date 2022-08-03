programa
{
	inclua biblioteca Objetos
	
	funcao inicio()
	{
		real media[5], pont=0.0, maiorPont=0.0
		inteiro x
		
		 para ( x= 1; x <= 5 ; x++){
	 escreva("\nEntre com a ", x, "º pontuação: " )
	 leia(pont)
	
	 se (pont == 1){
	 	maiorPont = pont
	 } senao{
	 	se (x > maiorPont){
	 		maiorPont = pont
	 	}
	 }
	 }
	 escreva("\nA maior pontuação foi de: ",maiorPont)
	}
}

	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media, 7, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */