/*COMANDO DE CRIAÇÃO DE BANCO DE DADOS*/
CREATE DATABASE db_escola_generation;

/*seleciona o banco de dados a ser usado*/
USE db_escola_generation;

/*comando para criação de tabelas*/
CREATE TABLE tb_alunos(
    
    id bigint auto_increment primary key,
    nome varchar(250),
    data_nascimento date,
    turma int,
    nota decimal(4,2)
);

/*serve para selecionar os dados gerais*/
SELECT * FROM tb_alunos;

/*Inserir dados na tabela (8 registro)*/
INSERT INTO tb_alunos(nome,data_nascimento,turma,nota)VALUES("Stephanie Marques","1994-05-21",57, 7 );

/*Seleciona todos os dados da tabela de alunos onde a nota for maiotb_rhr que 7*/
SELECT * FROM tb_alunos WHERE nota > 7;

/*Seleciona todos os dados da tabela de alunos onde a nota for menor que 7*/
SELECT * FROM tb_alunos WHERE nota <= 7 ;

/*Para mudar algo na tabela de forma especifica*/
UPDATE tb_alunos SET nota = 5 WHERE id=3;

/*serve para mudar todos de uma vez sem o where*/
/*SET SQL_SAFE_UPDATES = 0;*/