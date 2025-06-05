CREATE DATABASE bancodeimagem;

USE bancodeimagem;

CREATE Table imagem (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    url TEXT NOT NULL
);