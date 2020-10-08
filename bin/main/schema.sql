DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	cargo varchar(250),
	salario int (11)	
);