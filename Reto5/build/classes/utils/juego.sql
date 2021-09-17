CREATE TABLE juego(
jug_id INT NOT NULL PRIMARY KEY,
jug_distribuidor INT NOT NULL,
jug_clasificacion CHAR(45) NOT NULL,
jug_categoria CHAR(45) NULL,
foreign key(jug_id) references contenido(con_id),
foreign key(jug_distribuidor) references distribuidora(dis_id)

);

insert into juego(jug_id, jug_distribuidor, jug_clasificacion, jug_categoria) values (1,1,"Todos","Puzles y curiosidades");
insert into juego(jug_id, jug_distribuidor, jug_clasificacion, jug_categoria) values (2,2,"Todos","Deportes");
insert into juego(jug_id, jug_distribuidor, jug_clasificacion, jug_categoria) values (3,3,"Todos +10","Carreras y vuelo");
insert into juego(jug_id, jug_distribuidor, jug_clasificacion, jug_categoria) values (4,3,"Todos +10","Acción y aventura");
insert into juego(jug_id, jug_distribuidor, jug_clasificacion, jug_categoria) values (5,4,"Maduro 17+","Acción y aventura");