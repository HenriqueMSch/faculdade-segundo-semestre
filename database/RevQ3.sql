create table autenticacao(
	login char(50) primary key,
	email varchar(25)
		check (email ~ '^[a-zA-Z0-9]{1,25}mail.com'),
	senha varchar(30),
	permissoes varchar(7) check(permissoes in ('Admin', 'Gerente', 'Usuário'),
	id_pessoa int,
	foreign key id_pessoa references pessoa(id_pessoa)
);

create table pessoa(
	id_pessoa serial primary key,
	nome varchar(50)
		check(nome ~ '^[a-zA-Z ]$'),
	cpf int(11),
	data date
		check (data >= 1950-01-01),
	telefone varchar(20)
		check(telefone '^(0-9)$'),
);

create table funcionario(
	id_funcionario serial primary key,
	turno varchar(5)
		check (turno in ('Manhã','Tarde','Noite')),
	id_pessoa int,
	foreign key id_pessoa references pessoa(id_pessoa)
);

create table funcionario(
	id_funcionario serial primary key,
	rua varchar(12),
	id_pessoa int,
	foreign key id_pessoa references pessoa(id_pessoa)
);
