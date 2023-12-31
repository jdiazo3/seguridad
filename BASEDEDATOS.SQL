DROP DATABASE  seguridad;
CREATE DATABASE seguridad;
use seguridad;
create table persona (
id bigint not null auto_increment,
tipodoc varchar(15),
numdoc integer (11),
nombre varchar(25),
apeper varchar(15),
correo varchar(255),
primary key (id)) engine=InnoDB;

create table user (
id bigint not null auto_increment,
user varchar(15), 
password varchar(25), 
idper bigint, 
foreign key (idper) references persona (id),
primary key (id)) engine=InnoDB;

create table mensaje (
id bigint not null auto_increment,
mensaje bit,
fecha DATETIME,
sensor int(10),
leido TINYINT,
primary key (id)) engine=InnoDB;

