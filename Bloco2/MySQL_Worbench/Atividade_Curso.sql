CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;
CREATE TABLE tb_cursos(

    id bigint auto_increment primary key,
    nome_do_curso varchar(250),
    duracao varchar (250)
);

CREATE TABLE tb_categorias(
     
	id bigint auto_increment primary key,
    periodo varchar(50),
	modelo varchar(150),
    nivel varchar(100),
	valor decimal (9,2),
    forma_de_pagamento varchar (250),
	classe_id bigint,
    
    FOREIGN KEY(classe_id) REFERENCES tb_cursos(id)
);

SELECT * FROM tb_cursos;

INSERT INTO tb_cursos (nome_do_curso,duracao)VALUES("Inglês" , "1 ano" );

INSERT INTO tb_cursos (nome_do_curso,duracao)VALUES("Italiano" , "2 anos");

INSERT INTO tb_cursos (nome_do_curso,duracao)VALUES("francês" , "2 anos");

INSERT INTO tb_cursos (nome_do_curso,duracao)VALUES("Mandarim" , "3 anos" );

INSERT INTO tb_cursos (nome_do_curso,duracao)VALUES("português" , "6 meses" );


SELECT * FROM tb_categorias;

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("manhã","hibrido","intermediario", 2000.00,"mensal",1);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("tarde","presencial","iniciante", 3500.00,"trimestral",2);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("noite","online","avançado", 5400.00,"semestral",3);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("tarde","hibrido","intermediario", 2000.00,"mensal",4);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("manhã","hibrido","intermediario", 1200.00,"mensal",5);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("manhã","online","avançado", 3000.00,"mensal",2);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("manhã","presencial","iniciante", 5000.00,"mensal",3);

INSERT INTO tb_categorias (periodo,modelo,nivel,valor,forma_de_pagamento, classe_id)
VALUES("noite","online","avançado", 1000.00,"mensal",5);

SELECT * FROM tb_categorias WHERE valor > 2000.00; 

SELECT * FROM tb_categorias WHERE valor BETWEEN 1000 AND 2000;

SELECT * FROM tb_cursos WHERE nome_do_curso LIKE "%i%";


SELECT * FROM tb_categorias INNER JOIN tb_cursos ON tb_curso.id = tb_categorias.classe_id;

SELECT * FROM tb_categorias INNER JOIN tb_cursos WHERE tb_cursos.id = 5 AND tb_categorias.classe_id = 5;