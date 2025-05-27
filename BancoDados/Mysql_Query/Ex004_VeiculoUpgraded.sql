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