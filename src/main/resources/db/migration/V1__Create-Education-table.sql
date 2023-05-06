create table education(
    id bigint not null auto_increment,
    institucion varchar(50) not null,
    titulo varchar(50) not null,
    fechaI varchar(50) not null,
    fechaF varchar(50),
    tipo varchar(60) not null,

    primary key(id)
);