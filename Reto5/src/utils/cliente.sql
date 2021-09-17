CREATE TABLE cliente(
cli_tag CHAR(20) NOT NULL PRIMARY KEY,
cli_nombre CHAR(20) NOT NULL,
cli_email CHAR(30) NOT NULL,
cli_celular BIGINT NULL DEFAULT NULL,
cli_clave CHAR(20) NULL DEFAULT NULL,
cli_fecha_nto DATE NOT NULL
);

insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) values ("hoodoo","Samary Cardona","samary@ejemplo.com",3101234567,"S4m4r1","1990-12-21");
insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) values ("andre09","Andrea Cardona","andrea@ejemplo.com",3101234568,"4ndr34","1998-10-03");
insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) values ("holy","Carlos Alonso","carlos@ejemplo.com",3101234569,"C4rl0s","2000-01-15");
insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) values ("jquispe","Julian Quispoe","julian@ejemplo.com",3101234560,"J6l14n","2005-08-28");
insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) values ("cgallardo","Camilo Gallardo","camilo@ejemplo.com",3101234561,"C4m1l0","1991-05-19");
insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) values ("jk2929","Juana Camila","juana@ejemplo.com",3101234562,"J64n4","2002-09-30");
