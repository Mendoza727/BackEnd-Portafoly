create table projects(
        id bigInt not null auto_increment,
        projecto varchar(70) not null,
        descripcion varchar(30) not null,
        img varchar(30) not null,
        repositorio varchar(30) not null,
        link varchar(60) not null,
        lenguage varchar(50) not null,

        primary key(id)
);