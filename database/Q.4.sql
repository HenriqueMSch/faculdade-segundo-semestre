create table empregado(
	numEmp serial primary key,
	nome varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$'),
	seccao integer not null,
	foreign key (seccao) references seccao(numSec),
	posto varchar(25) not null,
	chefe integer,
	foreign key (chefe) references empregado(numEmp),
	salario integer
		check (salario > 0 and salario < 100000),
	comissao integer
		check (comissao >= 0 and comissao <= 100)
);

create table seccao(
	numSec integer primary key,
	nome varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$'),
	cidade varchar(50) not null
		CHECK (nome ~ '^[A-Za-z ]+$')
);