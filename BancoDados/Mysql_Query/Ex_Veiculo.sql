create table Veiculo (
	nr_placa char(7),
    id_proprietario int,
    id_modelo int,
    nr_ano_fab int,
    nr_ano_mod int,
    qt_km_rodado int,
    qt_porta int,
    ds_observacao varchar(200)
    );
    
-- adicionar chave estrangeira do Modelo no Veículo    
ALTER TABLE Veiculo ADD FOREIGN KEY(id_modelo) REFERENCES Modelo(id_modelo);
-- adicionar chave estrangeira do Proprietário no Veículo 
ALTER TABLE Veiculo ADD FOREIGN KEY(id_proprietario) REFERENCES Proprietario(id_proprietario);

-- modificar o atributo nr_placa para char(7) primary key
ALTER TABLE Veiculo MODIFY COLUMN nr_placa char(7) primary key;

create table Marca (
	id_marca int primary key auto_increment,
    ds_marca varchar(30)
    );

create table Modelo (
	id_modelo int primary key auto_increment,
    id_marca int,
    ds_modelo varchar(50)
    );

-- adicionar chave estrangeira da Marca no Modelo    
ALTER TABLE Modelo ADD FOREIGN KEY(id_marca) REFERENCES Marca(id_marca);

create table Proprietario (
	id_proprietario int primary key auto_increment,
    id_localidade int,
    nm_proprietario varchar(50),
    ds_logradouro varchar(50),
    ds_complemento varchar(50),
    ds_bairro varchar(50),
    nr_telefone varchar(15),
    ds_email varchar(50),
    uf char(2)
    );

-- adicionar chave estrangeira da Localidade no Proprietário
ALTER TABLE Proprietario ADD FOREIGN KEY(id_localidade) REFERENCES Localidade(id_localidade);

create table localidade (
	id_localidade int primary key auto_increment,
    nm_localidade varchar(50)
    );

-- renomear tabela 
RENAME TABLE Localidades TO Localidade;

create table Combustivel (
		id_combustivel int primary key auto_increment,
        nr_placa char(30)
	);
    
create table Veiculo_Combustivel (
	id_combustivel int,
    nr_placa char(7)
    );

-- adicionar cahve estrangeira
ALTER TABLE veiculo_Combustivel ADD FOREIGN KEY(id_combustivel) REFERENCES Combustivel(id_localidade);