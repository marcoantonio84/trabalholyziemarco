CREATE TABLE cidade (
    id SERIAL PRIMARY KEY,
    estado VARCHAR(50) NOT NULL,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE endereco (
    id SERIAL PRIMARY KEY,
    rua VARCHAR(255) NOT NULL,
    cidade_id INT NOT NULL,
    FOREIGN KEY (cidade_id) REFERENCES cidade(id)
);

CREATE TABLE funcao (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL
);

CREATE TABLE login (
    id SERIAL PRIMARY KEY,
    senha VARCHAR(255) NOT NULL,
    usuario VARCHAR(100) NOT NULL UNIQUE,
    funcao_id INT NOT NULL,
    FOREIGN KEY (funcao_id) REFERENCES funcao(id)
);

CREATE TABLE funcionario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    registro VARCHAR(50) NOT NULL UNIQUE,
    login_id INT NOT NULL,
    FOREIGN KEY (login_id) REFERENCES login(id)
);

CREATE TABLE paciente (
    id SERIAL PRIMARY KEY,
    data_nascimento DATE NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    numero_casa VARCHAR(10),
    endereco_id INT NOT NULL,
    responsavel_id INT,
    FOREIGN KEY (endereco_id) REFERENCES endereco(id),
    FOREIGN KEY (responsavel_id) REFERENCES paciente(id)
);

CREATE TABLE contato (
    id SERIAL PRIMARY KEY,
    informacao VARCHAR(255) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    paciente_id INT NOT NULL,
    FOREIGN KEY (paciente_id) REFERENCES paciente(id)
);

CREATE TABLE agendamento (
    id SERIAL PRIMARY KEY,
    data DATE NOT NULL,
    hora TIME NOT NULL,
    dentista_id INT NOT NULL,
    recepcionista_id INT NOT NULL,
    FOREIGN KEY (dentista_id) REFERENCES funcionario(id),
    FOREIGN KEY (recepcionista_id) REFERENCES funcionario(id)
);

CREATE TABLE consulta (
    id SERIAL PRIMARY KEY,
    observacao TEXT,
    anexos_id INT,
    dentista_id INT NOT NULL,
    paciente_id INT NOT NULL,
    FOREIGN KEY (dentista_id) REFERENCES funcionario(id),
    FOREIGN KEY (paciente_id) REFERENCES paciente(id)
);

CREATE TABLE arquivos (
    id SERIAL PRIMARY KEY,
    caminho_arquivo VARCHAR(255) NOT NULL,
    consulta_id INT NOT NULL,
    FOREIGN KEY (consulta_id) REFERENCES consulta(id)
);

CREATE TABLE formapagament (
    id SERIAL PRIMARY KEY,
    tipo_pagamento VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    consulta_id INT NOT NULL,
    FOREIGN KEY (consulta_id) REFERENCES consulta(id)
);

CREATE TABLE prontuario (
    id SERIAL PRIMARY KEY,
    descricao TEXT,
    consulta_id INT NOT NULL,
    FOREIGN KEY (consulta_id) REFERENCES consulta(id)
);

CREATE TABLE prontuarios (
    id SERIAL PRIMARY KEY,
    prontuario_id INT NOT NULL,
    paciente_id INT NOT NULL,
    FOREIGN KEY (prontuario_id) REFERENCES prontuario(id),
    FOREIGN KEY (paciente_id) REFERENCES paciente(id)
);

CREATE TABLE material (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    qtdminima INT NOT NULL,
    usuariocadastro_id INT NOT NULL,
    FOREIGN KEY (usuariocadastro_id) REFERENCES funcionario(id)
);
