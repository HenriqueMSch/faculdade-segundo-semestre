create table pesquisador(
	codigo serial primary key,
	nome varchar(50) not null,
	codProjeto int not null,
	foreign key (codProjeto) references projeto(codigo)
);

create table projeto(
	codigo serial primary key,
	titulo varchar(90)
);

create table trabalha(
	codPesquisador int primary key,
	codProjeto int primary key,
	foreign key (codPesquisador) references pesquisador(codigo),
	foreign key (codProjeto) references projeto(codigo)
); 