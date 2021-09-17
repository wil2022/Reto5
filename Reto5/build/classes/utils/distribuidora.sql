CREATE TABLE distribuidora(
dis_id INT NOT NULL PRIMARY KEY,
dis_nombre CHAR(20) NOT NULL,
dis_pais CHAR(40) NULL default null
);

insert into distribuidora(dis_id,dis_nombre,dis_pais) values (1,"Enhance","USA");
insert into distribuidora(dis_id,dis_nombre,dis_pais) values (2,"Electronic Arts","USA");
insert into distribuidora(dis_id,dis_nombre,dis_pais) values (3,"Activision","USA");
insert into distribuidora(dis_id,dis_nombre,dis_pais) values (4,"Rockstar Games","USA");
insert into distribuidora(dis_id,dis_nombre,dis_pais) values (5,"Bethesda","USA");
insert into distribuidora(dis_id,dis_nombre,dis_pais) values (6,"Konami","Japon");
