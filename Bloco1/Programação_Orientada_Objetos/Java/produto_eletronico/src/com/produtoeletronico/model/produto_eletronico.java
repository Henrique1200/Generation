package com.produtoeletronico.model;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class produto_eletronico {


		private String loja;
		private String tipo;
		private String marca;
		private String nome;
		private float preco ;
		
		public produto_eletronico(String loja, String tipo, String marca, String nome, float preco) {
			this.loja = loja;
			this.tipo = tipo;
			this.marca = marca;
			this.nome = nome;
			this.preco = preco;
		}
		

		public produto_eletronico() {
			// TODO Auto-generated constructor stub
		}


		public String getLoja() {
			return loja;
		}

		public void setLoja(String loja) {
			this.loja = loja;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}
		
		 public void visualizar() {
				
				System.out.println("*****************************************");
				System.out.println("Dados do produto:");
				System.out.println("*****************************************");
				System.out.println("Tipo do aparelho eletronico:" + this.tipo);
				System.out.println("Marca: "+this.marca);
				System.out.println("Nome do aparelho: " + this.nome);
				System.out.println("Loja mais próxima: " +this.loja);
				System.out.println("o preço é de R$ "+this.preco);
			
		}
	
		
		
		
		
}
