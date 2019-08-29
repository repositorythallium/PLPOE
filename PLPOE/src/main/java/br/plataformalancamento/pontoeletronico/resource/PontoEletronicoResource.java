package br.plataformalancamento.pontoeletronico.resource;

import java.io.Serializable;

import javax.ws.rs.GET;

public class PontoEletronicoResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GET
	public String save() {
		return "Registro Realizado com Sucesso!";
	}
}
