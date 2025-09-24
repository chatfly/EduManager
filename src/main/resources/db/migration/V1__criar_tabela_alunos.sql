-- V1__criar_tabela_alunos.sql
CREATE TABLE alunos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL UNIQUE,
    data_nascimento DATE
)