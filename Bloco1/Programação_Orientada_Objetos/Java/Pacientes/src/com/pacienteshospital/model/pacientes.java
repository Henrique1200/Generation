package com.pacienteshospital.model;
/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

import java.util.Scanner ;

public class pacientes {

	private int carteirinha ;
	private String convênio;
	private String tipo;
	private String titular;
	private String sintomas ;
	
	
	Scanner leia = new Scanner(System.in);
	
	public pacientes(int carteirinha, String convênio, String tipo, String titular, String sintomas) {
		this.carteirinha = carteirinha;
		this.convênio = convênio;
		this.tipo = tipo;
		this.titular = titular;
		this.sintomas = sintomas;
		
	}

	public pacientes() {
		// TODO Auto-generated constructor stub
	}

	public int getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(int carteirinha) {
		this.carteirinha = carteirinha;
	}

	public String getConvênio() {
		return convênio;
	}

	public void setConvênio(String convênio) {
		this.convênio = convênio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
    public void visualizar() {
		
		System.out.println("*****************************************");
		System.out.println("Dados da Paciente:");
		System.out.println("*****************************************");
		System.out.println("Número da carteirinha: "+ this.carteirinha);
		System.out.println("Nome do convênio: " + this.convênio);
		System.out.println("Tipo de convênio:" + this.tipo);
		System.out.println("Nome do titular do convênio: " + this.titular);
		System.out.println("Tipo de sintoma: "+this.sintomas);
	
}
	
	
}
