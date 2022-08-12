package com.generation.conta;

import com.generation.conta.modell.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.50f );
         c1.visualizar();
		
         Conta c2 = new Conta(123457, "123", "CC", "Amanda", 50400.50f );
		c2.visualizar();
		
		System.out.println("\nSaldo da Conta c1: " + c1.getSaldo());
	    c1.setSaldo(3500.0f);
	    //System.out.println("\nSaldo atualizado da conta c1: "+ c1.getSaldo());
	    c1.visualizar();
	    
	    c2.setTitular("Amanda Giacometti");
	    //System.out.println("\nDados atualizado da conta C2: "+c2.getTitular());
	    c2.visualizar();
	    
	    Conta c3 = new Conta();
	    c3.setNumero(876543);
	    c3.setTitular("Gabrieli Santos");
	    c3.setSaldo(4000.5f);
	    c3.visualizar();
	 
	    if (c2.sacar(100000.0f) == true)
	    c2.visualizar();
	   // else
	    //	System.out.println("\nSaldo Insuficiente!");
	    
	}

}
