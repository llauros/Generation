/*
	Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
	trabalhará com as informações dos funcionaries desta empresa.
	Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
	atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
	Popule esta tabela com até 5 dados;
	Faça um select que retorne os funcionaries com o salário maior do que 2000.
	Faça um select que retorne os funcionaries com o salário menor do que 2000.
	Ao término atualize um dado desta tabela através de uma query de atualização.
	salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
	coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

CREATE DATABASE db_rh;
USE db_rh;

CREATE TABLE tb_funcionario (
	idFuncionario INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    cpf CHAR(11), 
    idade INT,
    salaro DECIMAL(2),
    data_contratacao DATE NOT NULL,
	idEndereco INT NOT NULL,
    PRIMARY KEY (idFuncionario),
    FOREIGN KEY (idEndereco) REFERENCES tb_endereco (idEndereco)
);
CREATE TABLE tb_endereco (
	idEndereco INT AUTO_INCREMENT NOT NULL,
    rua VARCHAR(100) NOT NULL,
    numero INT NOT NULL NOT NULL,
    bairro VARCHAR(40) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    minicipio CHAR(2) NOT NULL, 
    complemento VARCHAR(255),
    pais VARCHAR(40) DEFAULT ("Brasil"),
    PRIMARY KEY(idEndereco)
);

INSERT INTO tb_endereco (rua, numero, bairro, cidade, municipio) VALUES ("Ruas dos Bobos", 0, "Vila dos bobos", "Bobocity", "BB");
INSERT INTO tb_endereco (rua, numero, bairro, cidade, municipio) VALUES ("Rua João Xavier", 264, "Guarani", "São Paulo", "SP");

INSERT INTO tb_funcionario (nome, cpf, idade, salario, data_contratacao, idEndereco) 
VALUES ("José", "12345678910", 25, 1100, "2002-02-02", 1);
INSERT INTO tb_funcionario (nome, cpf, idade, salario, data_contratacao, idEndereco) 
VALUES ("Mari", "10987654321", 26, 1400, "2004-08-14", 1);
INSERT INTO tb_funcionario (nome, cpf, idade, salario, data_contratacao, idEndereco) 
VALUES ("João", "12312312312", 32, 900, "2011-12-30", 2);
INSERT INTO tb_funcionario (nome, cpf, idade, salario, data_contratacao, idEndereco) 
VALUES ("Enzo", "99999999999", 19, 2000, "2020-09-14", 2);
INSERT INTO tb_funcionario (nome, cpf, idade, salario, data_contratacao, idEndereco) 
VALUES ("Franklin", "32323232323", 23, 2300, "2003-03-23", 2);

ALTER TABLE tb_endereco
CHANGE minicipio municipio CHAR(2);
ALTER TABLE tb_funcionario
CHANGE salaro salario DECIMAL(10,2);

SELECT * FROM db_rh.tb_funcionario;
SELECT * FROM db_rh.tb_funcionario WHERE salario > 2000;
SELECT * FROM db_rh.tb_funcionario WHERE salario < 2000;

UPDATE tb_funcionario SET nome = "Eduarda" WHERE idFuncionario = 5;

