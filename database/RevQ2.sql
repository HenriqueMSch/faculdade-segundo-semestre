create table requisicao(
	codigo serial primary key,
	codigoHttp integer(600),
	tempo time
);

create table sessao(
	codigo serial primary key,
	usuario varchar(30),
	ip varchar(15)
		check(ip ~ '^{15}$'),
	codRequisicao int,
	foreign key (codRequisicao) references requisicao(codigo)
);

create table pagina(
	codigo serial primary key,
	codigoHtml text,
	titulo varchar(30),
	url text,
	codRequisicao int,
	foreign key (codRequisicao) references requisicao(codigo)
);

create table log (
	codigo serial primary key,
	conteudo varchar(200),
	codSessao int,
	foreign key (codSessao) references sessao(codigo)
);