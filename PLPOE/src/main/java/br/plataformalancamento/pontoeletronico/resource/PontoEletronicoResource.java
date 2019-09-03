package br.plataformalancamento.pontoeletronico.resource;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.plataformalancamento.pontoeletronico.utility.ConstantesUtility;

@Path("/pontoEletronicoResource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PontoEletronicoResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GET
	public String save() {
		return ConstantesUtility.MENSAGEM_SUCESSO;
	}
	
}
