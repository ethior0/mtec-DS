CREATE DATABASE bd_amigos;
USE bd_amigos;

CREATE TABLE amigo (
	id_amigo INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(40) DEFAULT NULL,
    apelido VARCHAR(40) DEFAULT NULL,
    telefone VARCHAR(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO amigo VALUES
(1, "Alessandro", "Ale", "11 98347-5055"),
(2, "Vitor", "Vitin", "11 91345-9888"),
(3, "Maria Eduarda", "Doardona", "11 97045-7032");


SELECT * FROM amigo;
