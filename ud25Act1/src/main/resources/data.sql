DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

CREATE TABLE fabricantes (
	codigo int auto_increment PRIMARY KEY,
	nombre nvarchar(100)
);

CREATE TABLE articulos (
	codigo int auto_increment PRIMARY KEY,
	nombre nvarchar(100),
	precio int,
	fabricante_id int,
	CONSTRAINT fabricante_fk FOREIGN KEY (fabricante_id) REFERENCES fabricantes (codigo)
);

INSERT INTO fabricantes (nombre) VALUES(('pepe'));
INSERT INTO fabricantes (nombre) VALUES(('juan'));
INSERT INTO fabricantes (nombre) VALUES(('diego'));

INSERT INTO articulos (nombre,precio,fabricante_id) VALUES ('perico',200, 1);
INSERT INTO articulos (nombre,precio,fabricante_id) VALUES ('juan',1000, 1);
INSERT INTO articulos (nombre,precio,fabricante_id) VALUES ('juan',600, 3);