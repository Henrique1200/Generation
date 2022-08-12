package com.produtoeletronico;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

import com.produtoeletronico.model.*;

public class Menu {

	public static void main(String[] args) {
		
		produto_eletronico p1 = new produto_eletronico ("Notebook" , "DELL", "Dell i15-3576-A70 " , "Magazine Luiza" , 5040.7f);
        p1.visualizar();
        
        produto_eletronico p2 = new produto_eletronico ("Notebook" , "Apple", "Macbook Air 15 " , "Americanas" , 10100.7f);
        p2.visualizar();
	
        produto_eletronico p3 = new produto_eletronico ("Celular" , "Samsung", " S20 " , "Casas Bahia" , 7349.9f);
        p3.visualizar();
        
	
	
        produto_eletronico p4 = new produto_eletronico ();
        p4.setLoja("Iphone X");
        p4.setLoja("Apple");
        p4.setPreco(3499.0f);
        
        
	
	}

}
