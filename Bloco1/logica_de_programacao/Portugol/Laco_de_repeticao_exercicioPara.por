programa
{
	
	funcao inicio()
	{
		inteiro salario, filhos, maiorSal =0, salAte100 = 0 ,percentualSal = 0 ,mediaSal = 0, i 
		real mediaFilhos =0.0

		para (i=1;i<=20;i++){
			escreva ("\nEntre com o seu salário: ")
			leia (salario)
			escreva ("\nQuantos filhos você tem? ")
			leia (filhos)
			mediaFilhos += filhos
			mediaSal += salario /20

			se (salario > maiorSal){
				maiorSal = salario
				
			}
			se (salario<=100){
				percentualSal +=5
			}
		}
		mediaFilhos /=20 
		escreva("\nA média de salário da população é de:R$  ", mediaSal, ",00")
		escreva("\nA média de filhos da população é de: ",mediaFilhos)
		escreva("\nA pessoa que ganha mais na cidade recebe:R$ ",maiorSal, ",00")
		escreva("\nO percentual da população que recebe até R$100,00 é de: ", percentualSal, "%") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */