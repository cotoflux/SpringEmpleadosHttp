DROP table IF EXISTS empleados;

create table empleados(
  id int auto_increment,
  name varchar(25) not null,
  surname varchar(25) not null,
  cargo varchar(25) DEFAULT null,
  sueldo long(25) DEFAULT null,
);
