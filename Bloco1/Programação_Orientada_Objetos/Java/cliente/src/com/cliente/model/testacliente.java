package com.cliente.model;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class testacliente {

	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	
	
	public testacliente(int id, String cpf, String nome, String endereco, String email, int telefone) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}


	public testacliente() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
public void visualizar() {
		
		System.out.println("*****************************************");
		System.out.println("Dados do Cliente");
		System.out.println("*****************************************");
		System.out.println("Código do cliente: "+ this.id);
		System.out.println("CPF do cliente: " + this.cpf);
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Endereço do cliente: " + this.endereco);
		System.out.println("Email de contato do cliente: "+this.email);
		System.out.println("Número para contato: "+this.telefone);
		
	
    }
	

}
