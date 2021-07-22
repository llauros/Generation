CREATE DATABASE db_generation_game_online DEFAULT CHARACTER utf8;
USE db_generation_game_online;

CREATE TABLE tb_personagem(
	idPersonagem INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(45) NOT NULL,
    ataque DECIMAL(10,2),
    defesa DECIMAL(10,2),
    nivel INT NOT NULL,
    guilda VARCHAR(45),
    dinheiro DECIMAL(10.2) DEFAULT(100),
    idClasse INT,
    PRIMARY KEY(idPersonagem),
    FOREIGN KEY (idClasse) REFERENCES tb_classe(idClasse)
);
CREATE TABLE tb_classe(
	idClasse INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(45) NOT NULL,
    arma VARCHAR(45) NOT NULL,
    armadura VARCHAR(45) NOT NULL,
    cidade_natal VARCHAR(45),
    PRIMARY KEY(idClasse)
);

INSERT INTO tb_classe(nome, arma, armadura, cidade_natal) VALUES ("Guerreiro", "Espada/Lança", "leve", "Cidade do Dragão");			 # WARRIOR
INSERT INTO tb_classe(nome, arma, armadura, cidade_natal) VALUES ("Mago", "Instrumento Místico", "magica", "Cidades das Plumas"); # Mage
INSERT INTO tb_classe(nome, arma, armadura, cidade_natal) VALUES ("Arqueiro", "Arco e Flecha", "tunica", "Cidade da Maré Indomável");# Archer
INSERT INTO tb_classe(nome, arma, armadura, cidade_natal) VALUES ("Sacerdote", "Cajado", "alada", "Tellus");						# Sacer
INSERT INTO tb_classe(nome, arma, armadura, cidade_natal) VALUES ("Barbaro", "Machado/Garras", "pesada", "Cidade Perdida");			# barbarian
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Aragorn", 5003, 7000, 45, "Sociedade do Anel",  1);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Legolas", 8000, 3000, 35, "Sociedade do Anel",  3);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Bilbo Bolseiro", 1500, 2200, 20, "Sociedade do Anel", 4);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Gandalf", 10000, 9000, 89, "Sociedade do Anel",  2);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Frodo", 1800, 1900, 18, "Sociedade do Anel", 1);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Boromir", 4300, 2300, 40, "Annatar", 3);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Balrog", 13000, 12000, 99, "Valinor",  5);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Saruman", 11000, 6000, 90, "Orodroin", 2);
INSERT INTO tb_personagem(nome, ataque, defesa, nivel, guilda, idClasse) VALUES ("Sauron", 15000, 17000, 110, "Os Nove", 5);

# SELECT

SELECT * FROM tb_personagem WHERE tb_personagem.ataque > 3000;
SELECT * FROM tb_personagem WHERE tb_personagem.defesa >= 1000 AND tb_personagem.defesa <= 4000; 
SELECT * FROM tb_personagem WHERE tb_personagem.nome LIKE "%a%";

# ESTES SELECT'S ESTÃO RETORNANDO UMA CONSULTA ERRADA
SELECT * FROM tb_personagem 
	INNER JOIN tb_classe ON tb_classe.idClasse = tb_personagem.idPersonagem;
    
SELECT * FROM tb_personagem
	INNER JOIN tb_classe ON tb_personagem.id = 1;

/*
*
  --------- TESTANDO OUTROS COMANDO
*
*/

# -- WHERE ORDER BY ASC (Ascendente) DESC (Descendente)
SELECT nome, ataque, defesa FROM tb_personagem ORDER BY tb_personagem.ataque DESC;

# -- LIMIT - Limitando OFFSET - Quero pular os primeiros 'n' registros / a partir do registro 'n'
SELECT * FROM tb_personagem ORDER BY tb_personagem.ataque LIMIT 3;
SELECT * FROM tb_personagem LIMIT 3 OFFSET 4 ;

# -- BETWEEN - Valores que estejam entre 'n' e 'n' 
SELECT * FROM tb_personagem WHERE nivel BETWEEN 20 AND 60;

# -- Alterando valores nas consultas | AS - renomeia nome
SELECT nome, nivel + 10 AS level_up FROM tb_personagem;

# -- JOIN LEFT(da preferência a tabela da esquerda) RIGHT 
SELECT tb_personagem.nome, tb_personagem.guilda, tb_classe.nome, tb_classe.cidade_natal
	FROM tb_personagem INNER JOIN tb_classe
    ON tb_personagem.idPersonagem = tb_classe.idClasse; 

# % é um curinga que representa que representa zero, um ou varios caracters
/*
* ALTERANDO A TABELA 
*/
# ALTERANDO TABELA (SCHEMA)
ALTER TABLE tb_personagem
	ADD origem VARCHAR(30) DEFAULT ("Terra-média"); # ADICIONANDO COLUNA
	#MODIFY origem VARCHAR(40) UNSIGNED NOT NULL; # MODIFICANDO COLUNA
    #DROP origem;

# ATUALIZANDO DADO DA TABELA (INFORMAÇÃO)
UPDATE tb_personagem 
	SET nome = "Arwen", tb_personagem.idClasse = 3 WHERE tb_personagem.idPersonagem = 7;
    
# DELETANDO DADOS
DELETE FROM tb_personagem WHERE idPersonagem = 8;
