create table Marca (
	id_marca int not null auto_increment,
    Primary Key(id_marca),
    ds_marca varchar(30) not null
);

create table Localidade (
	id_localidade int not null auto_increment,
    Primary Key(id_localidade),
    nm_localidade varchar(50) not null
);
    
create table Combustivel (
	id_combustivel int not null auto_increment,
	Primary Key(id_combustivel),
	ds_combustivel char(30) not null
);
    
create table Cor (
	id_cor int not null auto_increment,
    Primary Key(id_cor),
    ds_cor varchar(30)
);

create table Acessorio (
	id_acessorio int not null auto_increment,
    Primary Key(id_acessorio),
    ds_acessorio varchar(50)
);

create table Modelo (
	id_modelo int not null auto_increment,
    Primary Key(id_modelo),
    id_marca int not null,
    Foreign Key (id_marca) references Marca (id_marca),
    ds_modelo varchar(50) not null
);

create table Proprietario (
	id_proprietario int not null auto_increment,
    Primary Key(id_proprietario),
    id_localidade int not null,
    Foreign Key (id_localidade) references Localidade (id_localidade), 
    nm_proprietario varchar(50) not null,
    ds_logradouro varchar(50) not null,
    ds_complemento varchar(50) not null,
    ds_bairro varchar(50) not null,
    nr_telefone varchar(15) not null,
    ds_email varchar(50) not null,
    uf char(2) not null
);
    
create table Veiculo (
	nr_placa char(7) not null,
    Primary Key(nr_placa),
    id_proprietario int not null,
    Foreign Key (id_proprietario) references Proprietario (id_proprietario),
    id_modelo int not null,
    Foreign Key (id_modelo) references Modelo (id_modelo),
    id_cor int auto_increment not null,
    Foreign Key (id_cor) references Cor (id_cor),
    nr_ano_fab int not null,
    nr_ano_mod int not null,
    qt_km_rodado int not null,
    qt_porta int not null,
    ds_observacao varchar(100) not null
);

create table Veiculo_Combustivel (
	id_combustivel int not null,
    nr_placa char(7) not null,
    Primary Key(nr_placa, id_combustivel),
    Foreign Key (nr_placa) references Veiculo (nr_placa),
    Foreign Key (id_combustivel) references Combustivel (id_combustivel)
);

create table Veiculo_Acessorio (
	nr_placa char(7) not null,
    id_acessorio int not null,
    Primary Key(nr_placa, id_acessorio),
    Foreign Key (nr_placa) references Veiculo (nr_placa),
    Foreign Key (id_acessorio) references Acessorio (id_acessorio)
);

-- Marca
INSERT INTO Marca (ds_marca) VALUES
('Toyota'), ('Ford'), ('Chevrolet'), ('Volkswagen'),
('Honda'), ('Fiat'), ('Renault'), ('Hyundai');

-- Localidade
INSERT INTO Localidade (nm_localidade) VALUES
('Blumenau'), ('Gaspar'), ('Indaial'), ('Pomerode'),
('Itajaí'), ('Joinville'), ('Florianópolis'), ('Brusque');

-- Combustivel
INSERT INTO Combustivel (ds_combustivel) VALUES
('Gasolina'), ('Álcool'), ('Diesel'), ('GNV'),
('Elétrico'), ('Flex'), ('Híbrido'), ('Etanol');

-- Cor
INSERT INTO Cor (ds_cor) VALUES
('Preto'), ('Branco'), ('Vermelho'), ('Prata'),
('Cinza'), ('Azul'), ('Verde'), ('Amarelo');

-- Acessorio
INSERT INTO Acessorio (ds_acessorio) VALUES
('Ar-condicionado'), ('Direção hidráulica'), ('Vidro elétrico'), ('Airbag'),
('Freio ABS'), ('Multimídia'), ('Rodas de liga leve'), ('Câmera de ré');

-- Tabelas com FK
-- Modelo
INSERT INTO Modelo (id_marca, ds_modelo) VALUES
(1, 'Corolla'), (2, 'Ka'), (3, 'Onix'), (4, 'Gol'),
(5, 'Civic'), (6, 'Uno'), (7, 'Sandero'), (8, 'HB20');

-- Proprietario
INSERT INTO Proprietario (id_localidade, nm_proprietario, ds_logradouro, ds_complemento, ds_bairro, nr_telefone, ds_email, uf) VALUES
(1, 'João Silva', 'Rua das Flores', 'Casa 1', 'Centro', '99999-1111', 'joao@email.com', 'SC'),
(2, 'Maria Souza', 'Av. Brasil', 'Ap 302', 'Vila Nova', '99999-2222', 'maria@email.com', 'SC'),
(3, 'Carlos Lima', 'Rua 15 de Novembro', 'Casa 2', 'Itoupava', '99999-3333', 'carlos@email.com', 'SC'),
(4, 'Ana Oliveira', 'Rua Bahia', 'Fundos', 'Garcia', '99999-4444', 'ana@email.com', 'SC'),
(5, 'Pedro Santos', 'Rua Amazonas', 'Bloco B', 'Fortaleza', '99999-5555', 'pedro@email.com', 'SC'),
(6, 'Julia Costa', 'Rua Indaial', 'Ap 101', 'Salto', '99999-6666', 'julia@email.com', 'SC'),
(7, 'Felipe Martins', 'Rua Timbó', 'Casa 5', 'Velha', '99999-7777', 'felipe@email.com', 'SC'),
(8, 'Larissa Ramos', 'Rua Itajaí', 'Casa 9', 'Água Verde', '99999-8888', 'larissa@email.com', 'SC');

-- Veiculo
INSERT INTO Veiculo (nr_placa, id_proprietario, id_modelo, id_cor, nr_ano_fab, nr_ano_mod, qt_km_rodado, qt_porta, ds_observacao) VALUES
('ABC1234', 1, 1, 1, 2015, 2016, 75000, 4, 'Revisado'),
('DEF5678', 2, 2, 2, 2017, 2018, 60000, 2, 'Sem avarias'),
('GHI9012', 3, 3, 3, 2020, 2021, 30000, 4, 'Único dono'),
('JKL3456', 4, 4, 4, 2019, 2020, 45000, 4, 'IPVA pago'),
('MNO7890', 5, 5, 5, 2018, 2019, 52000, 2, 'Ótimo estado'),
('PQR1234', 6, 6, 6, 2021, 2022, 15000, 4, 'Novo'),
('STU5678', 7, 7, 7, 2016, 2017, 80000, 2, 'Completo'),
('VWX9012', 8, 8, 8, 2022, 2023, 5000, 4, 'Semi-novo');

-- Tabelas de associacao
-- Veiculo_Combustivel
INSERT INTO Veiculo_Combustivel (nr_placa, id_combustivel) VALUES
('ABC1234', 1), ('DEF5678', 2), ('GHI9012', 6), ('JKL3456', 3),
('MNO7890', 1), ('PQR1234', 5), ('STU5678', 6), ('VWX9012', 7);

-- Veiculo_Acessorio
INSERT INTO Veiculo_Acessorio (nr_placa, id_acessorio) VALUES
('ABC1234', 1), ('ABC1234', 2),
('DEF5678', 3), ('DEF5678', 4),
('GHI9012', 5), ('JKL3456', 6),
('MNO7890', 7), ('PQR1234', 8);

-- Atualize a cor do veículo com placa 'ABC1234' para 'Azul'
Update Veiculo Set id_cor = 6 Where nr_placa = 'ABC1234';

-- Atualize o número de telefone do proprietário com código 8 para 47123456789
Update Proprietario Set nr_telefone = '47123456789' Where id_proprietario = 8;

-- Exclua os veículos com mais de 200 mil KM rodados produzidos antes de 2010
Delete From Veiculo Where qt_km_rodado > 200000 AND nr_ano_fab < 2010;
-- exercicio acima não está mais na lista. 

-- Desafio: Exclua todos os veículos em que a placa termine em “0”. Dica: Use o comando LIKE