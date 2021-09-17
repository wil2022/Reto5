Select 'Consulta 1';
select con_titulo from contenido order by con_titulo desc;
Select 'Consulta 2';
select con_titulo from contenido join juego on con_id=jug_id where jug_clasificacion like "%+%";
Select 'Consulta 3';
select con_titulo, jug_clasificacion, jug_categoria from contenido join juego on con_id=jug_id 
where jug_distribuidor = 3;
Select 'Consulta 4';
select con_titulo from contenido join biblioteca on con_id = bib_contenido where bib_tag = "hoodoo";
Select 'Consulta 5';
select cli_nombre from cliente join biblioteca on cli_tag = bib_tag where bib_contenido = 4 order by cli_nombre asc;
Select 'Consulta 6';
select count(app_tipo) from aplicacion where app_tipo = "Música";
Select 'Consulta 7';
select cli_email from cliente where cli_tag = "andre09";