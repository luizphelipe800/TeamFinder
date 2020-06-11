create database aulaSexta;

use aulaSexta;

create table pe_pessoa (
	pe_id int NOT NULL AUTO_INCREMENT,
	pe_nome varchar(50) NOT NULL,
	pe_dt_nascimento DATE NOT NULL,
	pe_rg int(9) NOT NULL,
	pe_cpf int(12) NOT NULL,
	pe_num_contato int(11) NOT NULL,
	PRIMARY KEY (pe_id)
);

create table pe_eq_pessoa_equipe (
    pe_eq_id int not null auto_increment,
    pe_eq_pessoa int not null,
    pe_eq_equipe int not null,
    primary key (pe_eq_id)
);

create table eq_equipe (
	eq_id int NOT NULL AUTO_INCREMENT,
	nome varchar(20) not null,
	PRIMARY KEY (eq_id)
);

create table li_lider (
	li_id int NOT NULL AUTO_INCREMENT,
	li_pessoa_id int NOT NULL,
	li_equipe_id int not null,
	PRIMARY KEY (li_id)
);

create table en_endereco (
	en_id int NOT NULL AUTO_INCREMENT,
	en_cep varchar(8) NOT NULL,
	en_Logradouro varchar(50) NOT NULL,
	en_numero int NOT NULL,
	en_complemento varchar(50),
	PRIMARY KEY (en_id)
);

create table ev_evento (
	ev_id int NOT NULL AUTO_INCREMENT,
	ev_endereco_id int NOT NULL,
	ev_equipe_id int not null,
	PRIMARY KEY (ev_id)
);

alter table pe_eq_pessoa_equipe add constraint pe_eq_pessoa_fk foreign key (pe_eq_pessoa) references pe_pessoa(pe_id);
alter table pe_eq_pessoa_equipe add constraint pe_eq_equipe_fk foreign key (pe_eq_equipe) references eq_equipe(eq_id);
alter table li_lider add constraint li_equipe_fk foreign key (li_equipe_id) references eq_equipe(eq_id);
alter table li_lider add constraint li_pessoa_fk foreign key (li_pessoa_id) references pe_pessoa(pe_id);
alter table ev_evento add constraint ev_endereco_fk foreign key (ev_endereco_id) references en_endereco(en_id);
alter table ev_evento add constraint ev_equipe_fk foreign key (ev_equipe_id) references eq_equipe(eq_id);

insert into pe_pessoa (
    pe_nome,
    pe_dt_nascimento,
    pe_rg,
    pe_cpf,
    pe_num_contato
) values (
    'Joe Doe',
    '1996/05/10',
    111111110,
    233323233,
    11122232
);

insert into eq_equipe (nome) value ('Furacao');

insert into pe_eq_pessoa_equipe (
    pe_eq_pessoa,
    pe_eq_equipe
) values (
    1,
    1
);

insert into li_lider (
    li_pessoa_id,
    li_equipe_id
) values (
    1,
    1
);

insert into en_endereco (
    en_cep,
    en_Logradouro,
    en_numero,
    en_complemento
) values (
    23332122,
    'rua jiripoca',
    '23',
    ''
);

insert into ev_evento (
    ev_endereco_id,
    ev_equipe_id
) values (
    1,
    1
);