CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_estudantes(
	idEstudante INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(30),
    idade INT,
    RA INT NOT NULL UNIQUE,
    nota FLOAT (10,2),
    idTurma INT,
    PRIMARY KEY (idEstudante),
    FOREIGN KEY (idTurma) REFERENCES tb_turma(idTurma)
);
CREATE TABLE tb_turma(
	idTurma INT AUTO_INCREMENT NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    PRIMARY KEY (idTurma)
);

INSERT INTO tb_turma(descricao) VALUES ("Turma 23"); #1
INSERT INTO tb_turma(descricao) VALUES ("Turma 24"); #2
INSERT INTO tb_turma(descricao) VALUES ("Turma 25"); #3

INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Zé", 23, 123, 9.5,1);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Jozé", 29, 124, 4.5, 2);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Zézé", 24, 125, 8.2,3);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Du", 19, 126, 2,1);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Dudu", 18, 127, 6,2);
INSERT INTO tb_estudantes(nome, idade, RA, nota,idTurma) VALUES ("Edu", 30, 128, 5,3);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Eduardo", 58, 129, 3,2);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Edu Zé", 45, 130, 10,3);
INSERT INTO tb_estudantes(nome, idade, RA, nota, idTurma) VALUES ("Teste", 0, 130, 0,3);

SELECT * FROM tb_estudantes;
SELECT * FROM tb_estudantes WHERE valor > 500;
SELECT * FROM tb_estudantes WHERE valor < 500;
SELECT * FROM tb_turma;
SELECT * FROM tb_turma WHERE descricao LIKE "%23%";

UPDATE tb_estudantes SET nome = "Zé dudu" WHERE idEstudante = 2;

#DROP DATABASE db_ecommerce;