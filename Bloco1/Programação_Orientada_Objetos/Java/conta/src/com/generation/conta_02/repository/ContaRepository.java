package com.generation.conta_02.repository;

import com.generation.conta.modell.Conta;

public interface ContaRepository {

	void inserir (Conta conta);
	int procurar (int numero);
	void visualizar (int posicao);
	void sacar (int posicao, float valor);

}


