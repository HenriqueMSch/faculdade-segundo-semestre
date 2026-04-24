create table jogadores(
	codigo serial primary key,
	nome varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$'),
	posicao varchar(3)
		check (posicao in('md','gol','mei')),
	dataNasci date not null
		check (dataNasci > '1960-01-01'),
	nascionalidade varchar(20)
);