CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	idCategoria INT AUTO_INCREMENT NOT NULL,
    nome_categoria VARCHAR(45) NOT NULL UNIQUE, #Normal, Especialidade, Premium
    preparo VARCHAR(45) NOT NULL UNIQUE, #Lenha, Forno, Micro-ondas
    tempo_de_entrega INT NOT NULL UNIQUE, #Premium < 10 - Especialidade < 20 - Normal < 40
    PRIMARY KEY(idCategoria)
);

CREATE TABLE tb_pizza(
	idPizza INT AUTO_INCREMENT NOT NULL,
    sabor VARCHAR(45) NOT NULL,
    valor DECIMAL(10,2),
    ingredientes VARCHAR(100),
    idCategoria INT,
    PRIMARY KEY(idPizza),
    FOREIGN KEY (idCategoria) REFERENCES tb_categoria(idCategoria)
);

INSERT INTO tb_categoria(nome_categoria, preparo, tempo_de_entrega) VALUES ("Normal", "Micro-ondas", 40);
INSERT INTO tb_categoria(nome_categoria, preparo, tempo_de_entrega) VALUES ("Especialidade", "Forno", 20);
INSERT INTO tb_categoria(nome_categoria, preparo, tempo_de_entrega) VALUES ("Premium", "Lenha", 10);
INSERT INTO tb_categoria(nome_categoria, preparo, tempo_de_entrega) VALUES ("Luxo", "Lenha do Olimpo", 3);

SELECT * FROM tb_categoria;
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Mussarela", 24, "Mussarela-Cebola", 1);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Bauro", 80, "Tomate-Queijo", 4);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Catuperoni", 30, "Catupiry-Peperoni", 2);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Calabresa", 28, "Calabresa-Queijo", 1);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("America", 34, "Pimentão-Champignon", 3);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Mussarela", 34, "Cream Cheese-Cebola", 4);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Pão de alho", 34, "Azeitona-Alho", 3);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Napolitana", 92, "Oregano-Cebola", 4);
INSERT INTO tb_pizza(sabor, valor, ingredientes, idCategoria) VALUES ("Frango com requeijão", 40, "Frango-Requeijão", 2);

SELECT * FROM tb_pizza WHERE tb_pizza.valor > 45;
SELECT * FROM tb_pizza WHERE tb_pizza.valor BETWEEN 29 AND 60;
SELECT * FROM tb_pizza WHERE tb_pizza.valor >= 29 AND tb_pizza.valor <= 60;
SELECT * FROM tb_pizza WHERE tb_pizza.sabor LIKE "%c%";

SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_pizza.idCategoria = tb_categoria.idCategoria;
    
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_pizza.idCategoria = tb_categoria.idCategoria
    WHERE tb_categoria.nome_categoria = "Normal";