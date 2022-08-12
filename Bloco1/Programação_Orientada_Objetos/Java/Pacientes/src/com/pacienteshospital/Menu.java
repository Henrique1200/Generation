package com.pacienteshospital;
/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


import com.pacienteshospital.model.*;

public class Menu {

	public static void main(String[] args) {
		
		
		
		pacientes p1 = new pacientes(28149521, "Cruz Azul", "Ouro", "Yasmin Santos", "Dor de cabeça" );
        
		p1.visualizar();
		
        pacientes p2 = new pacientes(26902543, "NotreDame", "Prata", "Beatriz Fernandes", "Covid19");
		
        p2.visualizar();

        pacientes p3 = new pacientes();
        p3.setCarteirinha(19485672);
        p3.setConvênio("Albert Einstein");
        p3.setTipo("Bronze");
        p3.setTitular("Josefa Maria");
        p3.setSintomas("Febre e dor muscular");
        p3.visualizar();
        

        
	}

}
