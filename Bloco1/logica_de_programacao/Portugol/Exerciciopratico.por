programa
{
	inclua biblioteca Matematica-->mat
	cadeia nome
	funcao inicio()
	{
		cadeia nome = "Mirelle Mota"
		inteiro idade = 27,x=2, op
		real altura = 1.55,nota1,nota2,nota3,media
		escreva("\nNome da participante: ",nome)
		escreva("\nIdade da participante: ", idade , " ano(s) de vida")
		escreva("\nAltura da participante: ",altura, "metro(s)")
		escreva("\nEntre com a primeira nota: ")
		leia(nota1)//já tenho o valor da nota1 
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)
		media = (nota1+nota2+nota3) / 3
		escreva("\nmedia aritimetica da participante ",nome, " foi de: ",media)
         

        
          escreva("\nMenu da sessão de elogios!!!")
          escreva("\n1 - Fámilia da proatividade")
          escreva("\n2 - Nota 10")
          escreva("\n3 - criativos")
          escreva("\n4 - trabalham bem em equipe")
          escreva("\ndigite sua opção: ")
          leia(op)
          escolha (op)
{
          caso 1:
          escreva ("\nFámilia 57 da proatividade")
          pare
          caso 2:
          escreva ("\nFamilia 57 Nota 10") 
          pare
          caso 3:
          escreva ("\nFámilia 57 criativa")
          pare
          caso 4:
          escreva("\nFámilia 57 que trabalha bem em equipe")
          pare
          caso contrario:
          escreva("\nOpção inválida!!!")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */