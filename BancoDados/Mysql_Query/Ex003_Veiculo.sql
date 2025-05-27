create table Marca (
	id_marca int not null,
    ds_marca varchar(30) not null
    );

create table Localidade (
	id_localidade int not null,
    nm_localidade varchar(50) not null
    );
    
create table Combustivel (
		id_combustivel int not null,
        ds_combustivel char(30) not null
	);

create table Modelo (
	id_modelo int not null,
    id_marca int not null,
    ds_modelo varchar(50) not null
    );

create table Proprietario (
	id_proprietario int not null,
    id_localidade int not null,
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
    id_proprietario int not null,
    id_modelo int not null,
    nr_ano_fab int not null,
    nr_ano_mod int not null,
    qt_km_rodado int not null,
    qt_porta int not null,
    ds_observacao varchar(200) not null
    );
    
create table Veiculo_Combustivel (
	id_combustivel int not null,
    nr_placa char(7) not null
    );
    
-- Adicione ds_cor VARCHAR(25) no Veiculo 
alter table Veiculo
 add column ds_cor VARCHAR(25);

-- Modifique nr_telefone do Proprietario para CHAR(11)
alter table Proprietario 
modify column nr_telefone CHAR(11);

-- Renomeie ds_email do Proprietario para email_proprietario
alter table Proprietario 
change column ds_email email_proprietario VARCHAR(50);

-- Renomeie Localidade para Cidade
rename table Localidade to Cidade;

-- Remova ds_complemento do Proprietario
alter table Proprietario
drop column ds_complemento;