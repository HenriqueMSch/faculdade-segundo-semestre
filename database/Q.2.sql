create table alunos(
	codigo serial primary key,
	nome varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$'),
	dataNasci date,
	email varchar(50) unique,
	anoEntrada date
);