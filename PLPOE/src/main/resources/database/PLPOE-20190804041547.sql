/* 
	@AUTHOR			Thallium
	@TAREFA			PLPOE-20190804041547
	@OBJETIVO		Criar estrutura da tabela "TB_PONTO_ELETRONICO"
	@SEQUENCE		Criar sequence "SEQUENCE_TB_PONTO_ELETRONICO" da tabela
	@TABLE			Criar tabela "TB_PONTO_ELETRONICO"
*/

-- CRIAR SEQUENCE "SEQUENCE_TB_PONTO_ELETRONICO"
CREATE SEQUENCE SEQUENCE_TB_PONTO_ELETRONICO;

-- CRIAR TABLE "TB_PONTO_ELETRONICO"
CREATE TABLE PUBLIC.TB_PONTO_ELETRONICO(
  CODIGO 						INTEGER 							NOT NULL DEFAULT NEXTVAL('SEQUENCE_TB_PONTO_ELETRONICO'::REGCLASS), 		-- INDENTIFICADOR ÚNICO DA TABELA
  HORA_PRIMEIRA_ENTRADA 		TIMESTAMP WITHOUT TIME ZONE, 																   					-- REPRESENTA O REGISTRO DE PONTO ELETRÔNICO PARA A PRIMEIRA ENTRADA NA JORNADA DE TRABALHO
  HORA_PRIMEIRA_SAIDA 			TIMESTAMP WITHOUT TIME ZONE, 																					-- REPRESENTA O REGISTRO DE PONTO ELETRÔNICO PARA A PRIMEIRA SAÍDA (ALMOÇO) PARA NA JORNADA DE TRABALHO.
  HORA_SEGUNDA_ENTRADA 			TIMESTAMP WITHOUT TIME ZONE,
  HORA_SEGUNDA_SAIDA 			TIMESTAMP WITHOUT TIME ZONE,
  EXPEDIENTE_DIARIO_TOTAL 		TIMESTAMP WITHOUT TIME ZONE,
  CREDITO_DIARIO_TOTAL 			TIMESTAMP WITHOUT TIME ZONE,
  DEBITO_DIARIO_TOTAL 			TIMESTAMP WITHOUT TIME ZONE,
  SALDO_HORA_TOTAL 				TIME WITHOUT TIME ZONE,
  OBSERVAOCAO_REGISTRO 			CHARACTER(200)
) WITH ( OIDS = FALSE );

-- EXCLUIR TABELA "TB_PONTO_ELETRONICO"
DROP TABLE PUBLIC.TB_PONTO_ELETRONICO;

-- ALTERAR TABELA "TB_PONTO_ELETRONICO"
ALTER TABLE PUBLIC.TB_PONTO_ELETRONICO OWNER TO POSTGRES;

-- COMENTARIO DA TABELA
COMMENT ON TABLE PUBLIC.TB_PONTO_ELETRONICO 						IS 'RESPONSÁVEL POR ARMAZENAR OS DADOS REFERENTES A REGISTRO DIÁRIO DE PONTO ELETRÔNICO (REP)';

-- COMENTARIO DAS COLUNAS
COMMENT ON COLUMN PUBLIC.TB_PONTO_ELETRONICO.CODIGO 				IS 'INDENTIFICADOR ÚNICO DA TABELA';
COMMENT ON COLUMN PUBLIC.TB_PONTO_ELETRONICO.HORA_PRIMEIRA_ENTRADA 	IS 'REPRESENTA O REGISTRO DE PONTO ELETRÔNICO PARA A PRIMEIRA ENTRADA NA JORNADA DE TRABALHO';
COMMENT ON COLUMN PUBLIC.TB_PONTO_ELETRONICO.HORA_PRIMEIRA_SAIDA 	IS 'REPRESENTA O REGISTRO DE PONTO ELETRÔNICO PARA A PRIMEIRA SAÍDA (ALMOÇO) PARA NA JORNADA DE TRABALHO';

-- EXCLUIR COLUNA "OBSERVACAO_REGISTRO"
ALTER TABLE public.TB_PONTO_ELETRONICO DROP COLUMN OBSERVACAO_REGISTRO;

-- INSERIR COLUNA "OBSERVACAO_REGISTRO"
ALTER TABLE public.TB_PONTO_ELETRONICO ADD COLUMN OBSERVACAO_REGISTRO character(200);

-- RETORNA OS TIPOS DE DADOS DE UMA DETERMINADA TABELA
SELECT COLUMN_NAME, DATA_TYPE, CHARACTER_MAXIMUM_LENGTH FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'TB_PONTO_ELETRONICO';

-- CODIGO GERADO AUTOMATICAMENTE
/*
-- Table: public.tb_ponto_eletronico

-- DROP TABLE public.tb_ponto_eletronico;

CREATE TABLE public.tb_ponto_eletronico
(
  codigo integer NOT NULL DEFAULT nextval('sequence_tb_ponto_eletronico'::regclass),
  hora_primeira_entrada timestamp without time zone,
  hora_primeira_saida timestamp without time zone,
  hora_segunda_entrada timestamp without time zone,
  hora_segunda_saida timestamp without time zone,
  expediente_diario_total timestamp without time zone,
  credito_diario_total timestamp without time zone,
  debito_diario_total timestamp without time zone,
  saldo_hora_total time without time zone,
  observaocao_registro character(200)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.tb_ponto_eletronico
  OWNER TO postgres;

*/