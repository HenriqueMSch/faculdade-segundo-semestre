create table filme(
	idFilme serial primary key,
	nome varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$'),
	descricao text,
	anoLancamento date,
	nota decimal(4,2),
	duracao time,
	genero varchar(20) not null,
	estudio varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$')
);