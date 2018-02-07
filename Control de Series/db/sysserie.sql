-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.7.0-alpha
-- PostgreSQL version: 9.3
-- Project Site: pgmodeler.com.br
-- Model Author: ---

SET check_function_bodies = false;
-- ddl-end --


-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: sysserie | type: DATABASE --
-- -- DROP DATABASE sysserie;
-- CREATE DATABASE sysserie
-- ;
-- -- ddl-end --
-- 

-- object: controlseries | type: SCHEMA --
-- DROP SCHEMA controlseries;
CREATE SCHEMA controlseries;
ALTER SCHEMA controlseries OWNER TO postgres;
COMMENT ON SCHEMA controlseries IS 'almacena toda la informacion de las series actuales';
-- ddl-end --

SET search_path TO pg_catalog,public,controlseries;
-- ddl-end --

-- object: controlseries.seire | type: TABLE --
-- DROP TABLE controlseries.seire;
CREATE TABLE controlseries.seire(
	idserie serial NOT NULL,
	nombre varchar(100) NOT NULL,
	descripcion varchar(1250) NOT NULL,
	idcategoria_categira integer NOT NULL,
	estado varchar(20),
	CONSTRAINT pk_serie PRIMARY KEY (idserie),
	CONSTRAINT uk_serie UNIQUE (nombre)

)
TABLESPACE pg_default;
-- ddl-end --
COMMENT ON TABLE controlseries.seire IS 'almacena la informacion de la serie';
COMMENT ON COLUMN controlseries.seire.idserie IS 'pk';
ALTER TABLE controlseries.seire OWNER TO postgres;
-- ddl-end --

-- object: controlseries.categira | type: TABLE --
-- DROP TABLE controlseries.categira;
CREATE TABLE controlseries.categira(
	idcategoria serial NOT NULL,
	catergoria varchar(50) NOT NULL,
	CONSTRAINT pk_categoria PRIMARY KEY (idcategoria),
	CONSTRAINT uk_categorias UNIQUE (catergoria)

);
-- ddl-end --
-- object: categira_fk | type: CONSTRAINT --
-- ALTER TABLE controlseries.seire DROP CONSTRAINT categira_fk;
ALTER TABLE controlseries.seire ADD CONSTRAINT categira_fk FOREIGN KEY (idcategoria_categira)
REFERENCES controlseries.categira (idcategoria) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --


-- object: controlseries.temporada | type: TABLE --
-- DROP TABLE controlseries.temporada;
CREATE TABLE controlseries.temporada(
	idtenporada serial NOT NULL,
	num integer NOT NULL,
	CONSTRAINT pk_temporada PRIMARY KEY (idtenporada)

);
-- ddl-end --
-- object: controlseries.episodio | type: TABLE --
-- DROP TABLE controlseries.episodio;
CREATE TABLE controlseries.episodio(
	idepiesodio serial NOT NULL,
	nombre varchar(100),
	num integer NOT NULL,
	tamano double precision,
	idserie_seire integer NOT NULL,
	idtenporada_temporada integer NOT NULL,
	fecha_emicion date,
	CONSTRAINT pk_episodio PRIMARY KEY (idepiesodio)

);
-- ddl-end --
COMMENT ON COLUMN controlseries.episodio.idserie_seire IS 'pk';
-- ddl-end --

-- object: seire_fk | type: CONSTRAINT --
-- ALTER TABLE controlseries.episodio DROP CONSTRAINT seire_fk;
ALTER TABLE controlseries.episodio ADD CONSTRAINT seire_fk FOREIGN KEY (idserie_seire)
REFERENCES controlseries.seire (idserie) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --


-- object: temporada_fk | type: CONSTRAINT --
-- ALTER TABLE controlseries.episodio DROP CONSTRAINT temporada_fk;
ALTER TABLE controlseries.episodio ADD CONSTRAINT temporada_fk FOREIGN KEY (idtenporada_temporada)
REFERENCES controlseries.temporada (idtenporada) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --



