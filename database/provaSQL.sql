create table pessoa(
	cpf varchar(13) check(cpf ~ '^[0-9]{13}$') primary key,
	rg varchar(9) check(rg ~ '^[0-9]{9}$'),
	nome varchar(50) check(nome ~ '^[a-zA-Z ]+$'),
	telefone1 varchar(13) check(telefone1 ~ '^[0-9]{13}$') ,
	telefone2 varchar(13) check(telefone2 ~ '^[0-9]{13}$') ,
	email1 text,
	email2 text,
	rua varchar(50) check(rua ~ '^[a-zA-Z ]+$'),
	numero integer check(numero > 0 or numero < 10000),
	bairro varchar(50) check(bairro ~ '^[a-zA-Z ]+$'),
	cidade varchar(50) check(cidade ~ '^[a-zA-Z ]+$'),
	uf char(2)
);

create table cidadaos(
	cpf varchar(13) check(cpf ~ '^[0-9]{13}$') primary key,
	nomeMae varchar(50) check(nomeMae ~ '^[a-zA-Z ]+$'),
	foreign key (cpf) references pessoa(cpf)
);

create table medicos(
	cpf varchar(13) check(cpf ~ '^[0-9]{13}$') primary key,
	crm char(8) check(crm ~ '^[0-9]{6}[a-zA-Z]{2}$'),
	especialidade1 varchar(50) check(especialidade1 ~ '^[a-zA-Z ]+$'),
	especialidade2 varchar(50) check(especialidade2 ~ '^[a-zA-Z ]+$'),
	foreign key (cpf) references pessoa(cpf)
);

create table funcionarios(
	cpf varchar(13) check(cpf ~ '^[0-9]{13}$') primary key,
	carteiraProfissional varchar(11) check(cpf ~ '^[0-9]{11}$'),
	foreign key (cpf) references pessoa(cpf)
);

create table unidade(
	codigo serial primary key,
	bairro varchar(50) check(bairro ~ '^[a-zA-Z ]+$'),
	telefone1 varchar(13) check(telefone1 ~ '^[0-9]{13}$'),
	telefone2 varchar(13) check(telefone2 ~ '^[0-9]{13}$'),
	responsavel varchar(13) check(responsavel ~ '^[0-9]{13}$'),
	foreign key (responsavel) references pessoa(cpf)
);

create table consultas(
	codigo serial primary key,
	data timestamp,
	comparecimento varchar(10) check(comparecimento in ('Compareceu','Faltou')),
	especialidade1 varchar(50) check(especialidade1 ~ '^[a-zA-Z ]+$'),
	especialidade2 varchar(50) check(especialidade2 ~ '^[a-zA-Z ]+$'),
	atendido varchar(13) check(atendido ~ '^[0-9]{13}$'),
	realiza varchar(13) check(realiza ~ '^[0-9]{13}$'),
	cadastra varchar(13) check(cadastra ~ '^[0-9]{13}$'),
	foreign key(atendido) references pessoa(cpf),
	foreign key(realiza) references pessoa(cpf),
	foreign key(cadastra) references pessoa(cpf)
);

create table escalado(
	codigo integer,
	cpf varchar(13) check(cpf ~ '^[0-9]{13}$'),
	diaDaSemanda varchar(3) check(diaDaSemanda in ('Seg','Ter','Qua','Qui','Sex','Sab','Dom')),
	foreign key (codigo) references unidade(codigo),
	foreign key (cpf) references pessoa(cpf),
	primary key (codigo,cpf)
);
