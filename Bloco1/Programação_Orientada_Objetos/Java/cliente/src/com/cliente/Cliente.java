package com.cliente;

import com.cliente.model.*;


public class Cliente {

	public static void main(String[] args) {
		
		testacliente c1 = new testacliente (1, "50374585655", "Luis Fernandes", "Praia", "fernandes_gen@gmail.com.br", 982736360);
        c1.visualizar();   
        
        testacliente c3 = new testacliente();
	    c3.setCpf("18160726450");
	    c3.setNome("Mariane Medeiros");
	    c3.setEndereco("Moema");
	    c3.visualizar();
        
        
	}

}
