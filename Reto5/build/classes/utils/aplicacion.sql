CREATE TABLE aplicacion(
app_id INT NOT NULL PRIMARY KEY,
app_tipo CHAR(50) NOT NULL,
FOREIGN KEY(app_id) REFERENCES contenido(con_id)

);

insert into aplicacion(app_id, app_tipo) values (6,"Entretenimiento");
insert into aplicacion(app_id, app_tipo) values (7,"Música");
insert into aplicacion(app_id, app_tipo) values (8,"Entretenimiento");
insert into aplicacion(app_id, app_tipo) values (9,"Música");
