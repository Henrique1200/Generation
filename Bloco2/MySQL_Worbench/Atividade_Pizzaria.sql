CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(

    id bigint auto_increment primary key,
    descricao varchar(250),
    tamanho varchar (250),
    borda_recheada boolean
);

CREATE TABLE tb_pizzas(
     
	id bigint auto_increment primary key,
    sabor varchar (250),
    preco decimal(6,2),
    massa varchar(250),
    quantidade int,
	categoria_id bigint,
    
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

SELECT * FROM tb_categorias;

INSERT INTO tb_categorias (descricao,tamanho,borda_recheada)VALUES("Salgada","Brotinho",true);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Brotinho",false);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Medio",true);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Medio",false);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Grande",true);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Salgada","Grande",false);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Doce","Brotinho",true);

INSERT INTO tb_categorias(descricao, tamanho, borda_recheada)VALUES("Doce","Grande",true);

INSERT INTO tb_categorias (descricao,tamanho,borda_recheada)VALUES("Vegetariana","Brotinho",true);

INSERT INTO tb_categorias (descricao,tamanho,borda_recheada)VALUES("Vegana","Brotinho",false);

SELECT * FROM tb_pizzas;

INSERT INTO tb_pizzas (sabor,preco, massa, quantidade, categoria_id)
VALUES("Frango c/ Catupiry",30.00,"tradicional",5,1);

INSERT INTO tb_pizzas (sabor,preco, massa, quantidade, categoria_id)
VALUES("Mussarela",40.50,"tradicional",5,2);

INSERT INTO tb_pizzas (sabor,preco, massa, quantidade, categoria_id)
VALUES("Prestígio",50.99,"tradicional",2,8);

INSERT INTO tb_pizzas (sabor,preco, massa, quantidade, categoria_id)
VALUES("Lombo c/ Catupiry",60.00,"tradicional",3,6);

INSERT INTO tb_pizzas (sabor,preco, massa, quantidade, categoria_id)
VALUES("Brocolis c/ Catupiry",40.00,"tradicional",4,9);

INSERT INTO tb_pizzas (sabor,preco, massa, quantidade, categoria_id)
VALUES("Calabresa",45.99,"tradicional",5,1);

/*ORDER BY ASC COLOCA EM ORDEM ALFABETA a consulta // E ORDER BY DESC a consulta vem em ordem decrescente*/
SELECT * FROM tb_pizzas WHERE preco > 45.00 ORDER BY sabor ASC;

/*FAÇA UM SELECT QUE RETORNE TODAS AS PIZZAS COM VALORES ENTRE  50 E 100*/
SELECT * FROM tb_pizzas WHERE preco >= 50 AND preco <=100;

/*FAÇA UM SELECT QUE RETORNE TODAS AS PIZZAS COM VALORES ENTRE  50 E 100*/
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50 AND 100;

/*assim seleciona qual letra tem que ter para me retornar */
SELECT * FROM tb_pizzas WHERE sabor LIKE "%m%";

SELECT * FROM tb_pizzas INNER JOIN tb_categorias
ON tb_categorias.id = tb_pizzas.categoria_id;