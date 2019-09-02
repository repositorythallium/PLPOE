package br.plataformalancamento.pontoeletronico.resource;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pontoEletronicoResource")
public class PontoEletronicoResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GET
	public String save() {
		return "Cadastro Realizado com Sucesso!";
	}
	
}
