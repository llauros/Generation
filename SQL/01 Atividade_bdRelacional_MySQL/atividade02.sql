CREATE DATABASE db_ecommerce;
USE db_ecommerce;

CREATE TABLE tb_produto(
	idProduto INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(30),
    valor DECIMAL(2),
    quantidade_produto INT NOT NULL,
    idCategoria INT,
    PRIMARY KEY (idPRoduto),
    FOREIGN KEY (idCategoria) REFERENCES tb_categoria(idCategoria)
);
CREATE TABLE tb_categoria(
	idCategoria INT AUTO_INCREMENT NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    PRIMARY KEY (idCategoria)
);

INSERT INTO tb_categoria(descricao) VALUES ("Eletrônico"); #1
INSERT INTO tb_categoria(descricao) VALUES ("Alimentos e Bebidas"); #2
INSERT INTO tb_categoria(descricao) VALUES ("Beleza e Cuidados Pessoais"); #3
INSERT INTO tb_categoria(descricao) VALUES ("Vestuario"); #4
INSERT INTO tb_categoria(descricao) VALUES ("Livros"); #5

INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Xiaomi", 1800, 5, 1);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Camisa", 50, 2, 4);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Sabonete", 2, 10, 3);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Sapato", 180, 3, 4);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Ladrão de raios", 28.5, 4, 5);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Galaxy", 2000, 1, 1);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Coca", 7, 20, 2);
INSERT INTO tb_produto(nome, valor, quantidade_produto, idCategoria) VALUES ("Agua", 1, 5, 3);

ALTER TABLE tb_produto
CHANGE valor valor DECIMAL(10,2);

SELECT * FROM tb_produto;
SELECT * FROM tb_produto WHERE valor > 500;
SELECT * FROM tb_produto WHERE valor < 500;
SELECT * FROM tb_categoria;
SELECT * FROM tb_categoria WHERE descricao LIKE "Vestuario";

UPDATE tb_produto SET nome = "Água de Coco" WHERE idProduto = 8;

#DROP DATABASE db_ecommerce;