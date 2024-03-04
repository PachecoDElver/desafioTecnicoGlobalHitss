drop database dsfTecGHBD;
create database  dsfTecGHBD;
use dsfTecGHBD;

/*tablas*/
create table if not exists tbl_producto (
  id_producto smallint unsigned auto_increment,
  nombre varchar(100),
  fecha_registro datetime,
  primary key (id_producto)
) engine = innodb;
COMMIT;

/*procedimientos almacenados*/
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_add_productos$$
CREATE PROCEDURE sp_add_productos(IN nombre VARCHAR(100))
BEGIN
  INSERT INTO tbl_producto(nombre, fecha_registro) VALUES(nombre, NOW());
END$$;
DELIMITER ;

DELIMITER $$
DROP PROCEDURE IF EXISTS sp_listar_productos$$
CREATE PROCEDURE sp_listar_productos()
BEGIN
  SELECT * FROM tbl_producto
    WHERE DATE(fecha_registro) = CURDATE();
END$$;
DELIMITER ;
COMMIT;
