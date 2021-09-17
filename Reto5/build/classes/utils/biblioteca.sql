CREATE TABLE biblioteca(
bib_id INT NOT NULL PRIMARY KEY,
bib_tag CHAR(40) NOT NULL,
bib_contenido INT NOT NULL,
bib_fecha DATETIME NOT NULL,

foreign key(bib_tag) references cliente(cli_tag),
foreign key(bib_contenido) references contenido(con_id)

);

insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (1,"hoodoo",1,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (2,"hoodoo",7,'2020-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (3,"hoodoo",4,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (4,"andre09",4,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (5,"holy",4,'2018-12-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (6,"holy",5,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (7,"holy",1,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (8,"holy",6,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (9,"jquispe",9,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (10,"jk2929",7,'2018-10-25 20:00:00');
insert into biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha) values (11,"cgallardo",1,'2021-10-25 20:00:00');