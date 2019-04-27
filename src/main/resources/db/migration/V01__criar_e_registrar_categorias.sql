create table categoria (
	codigo  bigint(20) primary key auto_increment, 
    nome varchar(50) not null
)ENGINE=InnoDB default charset=utf8;

insert into categoria (nome) values ('Lazer'); 
insert into categoria (nome) values ('Alimentação'); 
insert into categoria (nome) values ('SuperMercado'); 
insert into categoria (nome) values ('Farmacia'); 
insert into categoria (nome) values ('Outros'); 
