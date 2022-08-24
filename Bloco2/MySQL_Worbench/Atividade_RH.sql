CREATE DATABASE db_RH_Generation;
/*atividade para criar uma tabela para gestão do RH*/
USE db_RH_Generation;
 
CREATE TABLE tb_RH (
    
    id bigint auto_increment primary key,
    nome varchar(250),
    data_nascimento date,
    CPF varchar (11),
    Area_de_atuação varchar (250),
    Cargo varchar (250),
    Salario decimal (9,2)

);

SELECT * FROM tb_RH;

INSERT INTO tb_RH(nome,data_nascimento,CPF,Area_de_atuação,Cargo,Salario)VALUES("Pamela Carmo","1994-06-03","54322156722" , "Logistica","Gerente de produção", 8000.40  );

SELECT * FROM tb_RH WHERE Salario > 2000.00;

SELECT * FROM tb_RH WHERE Salario < 2000.00;

UPDATE tb_RH SET Salario = 1550.80 WHERE id=4;

UPDATE tb_RH SET Salario = 1080.80 WHERE id=8;
