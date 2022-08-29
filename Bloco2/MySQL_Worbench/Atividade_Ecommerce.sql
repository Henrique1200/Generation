CREATE DATABASE db_ecommerce;
/*atividade para criar uma tabela para gestão do ecommerce*/
USE db_ecommerce;
 
CREATE TABLE tb_carros (
    
    id bigint auto_increment primary key,
    Nome varchar (250),
    Marca varchar(250),
    Ano varchar (4),
    Cor varchar (250),
    Valor decimal (9,2)

);

SELECT * FROM tb_carros;

INSERT INTO tb_carros(Nome,Marca,Ano,Cor,Valor)VALUES("Cruze", "Chevrolet", 2022, "branco" , 139000.00  );

SELECT * FROM tb_carros WHERE Valor > 50000.00;

SELECT * FROM tb_carros WHERE Valor < 50000.00;

UPDATE tb_carros SET Valor = 15500.00 WHERE id=3;


