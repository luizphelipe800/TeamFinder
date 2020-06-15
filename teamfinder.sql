create database aulaSexta;

use aulaSexta;

create table pe_pessoa (
	pe_id int auto_increment,
	pe_nome varchar(50) not null ,
	pe_dt_nascimento date not null ,
	pe_rg int(9) not null ,
	pe_cpf int(12) not null ,
	pe_num_contato int(11) not null,
	primary key (pe_id)
);

create table pe_eq_pessoa_equipe (
    pe_eq_id int not null auto_increment,
    pe_eq_pessoa int not null,
    pe_eq_equipe int not null,
    primary key (pe_eq_id)
);

create table eq_equipe (
	eq_id int auto_increment,
	eq_nome varchar(20) not null,
	eq_pessoa_id int not null,
	primary key (eq_id)
);

create table en_endereco (
	en_id int auto_increment,
	en_cep varchar(8) not null ,
	en_Logradouro varchar(50) not null ,
	en_numero int not null ,
	en_complemento varchar(50),
	primary key (en_id)
);

create table ev_evento (
	ev_id int auto_increment,
	ev_nome varchar(20) not null,
	ev_endereco_id int not null,
	ev_pessoa_id int not null,
	primary key (ev_id)
);

create table ev_eq_evento_equipe (
    ev_eq_id int auto_increment,
    ev_eq_evento_id int,
    ev_eq_equipe_id int,
    primary key (ev_eq_id)
);

alter table pe_eq_pessoa_equipe add constraint pe_eq_pessoa_fk foreign key (pe_eq_pessoa) references pe_pessoa(pe_id);
alter table pe_eq_pessoa_equipe add constraint pe_eq_equipe_fk foreign key (pe_eq_equipe) references eq_equipe(eq_id);
alter table ev_evento add constraint ev_endereco_fk foreign key (ev_endereco_id) references en_endereco(en_id);
alter table ev_evento add constraint  ev_pessoa_fk foreign key (ev_pessoa_id) references pe_pessoa(pe_id);
alter table eq_equipe add constraint  eq_pessoa_fk foreign key (eq_pessoa_id) references pe_pessoa(pe_id);
alter table ev_eq_evento_equipe add constraint ev_eq_evento_fk foreign key (ev_eq_evento_id) references ev_evento(ev_id);
alter table ev_eq_evento_equipe add constraint ev_eq_equipe_fk foreign key (ev_eq_equipe_id) references eq_equipe(eq_id);