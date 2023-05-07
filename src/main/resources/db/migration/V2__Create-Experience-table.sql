create table experience(
        id bigint not null auto_increment,
        empresa varchar(50) not null,
        cargo varchar(50) not null,
        fechaI DATE not null,
        fechaF DATE,
        ciudad varchar(60) not null,
        descripcion varchar(60) not null,
        tecnologias varchar(60),

        primary key(id)
)