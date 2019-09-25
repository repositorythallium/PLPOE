/* 
	@AUTHOR			Thallium
	@TAREFA			PLPOE-20190804030349
	@OBJETIVO		Configurar Banco de Dados db_plpoe_desenvolvimento
	@HOTS			localhost
	@PORT			5432
	@DATABASE		db_plpoe_desenvolvimento
	@USERNAME		postgres
	@PASSWORD		plataforma
*/

-- DESCONECTA TODOS OS USUARIOS DE UM BANCO POSTGRES
SELECT PID, PG_TERMINATE_BACKEND(PID) FROM PG_STAT_ACTIVITY WHERE PID <> PG_BACKEND_PID();

-- EXCLUIR DATABASE "db_plpoe_desenvolvimento"
DROP DATABASE IF EXISTS db_plpoe_desenvolvimento;

﻿-- CRIAR DATABASE db_plpoe_desenvolvimento
CREATE DATABASE db_plpoe_desenvolvimento 
WITH OWNER = postgres
ENCODING = 'UTF8'
TABLESPACE = pg_default
LC_COLLATE = 'pt_BR.UTF-8'
LC_CTYPE = 'pt_BR.UTF-8'
CONNECTION LIMIT = -1;

-- RETORNA TODAS AS TABELAS DE UM DETERMINADO BANCO DE DADOS
SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'public' AND TABLE_CATALOG = 'db_plpoe_desenvolvimento';
