CREATE TABLE sla(
	id serial primary key,
	nome varchar(50) not null,
	idade integer check(Idade >= 0)
);
