package com.generation.conta.modell;

public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, String agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia,tipo , titular, saldo);
		this.limite = limite;
	}


	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override //informa que o método foi subescrito de algum lugar
	public void sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite() < valor)
			System.out.println("\nSaldo insuficiente!");
		this.setSaldo(this.getSaldo() - valor);
		}
	
	public void depositar(float valor) {

		if (valor > 0)
			this.setSaldo(this.getSaldo() + valor);
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito: "+this.limite);
	}

}
