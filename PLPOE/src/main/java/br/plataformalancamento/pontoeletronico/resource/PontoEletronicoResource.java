package br.plataformalancamento.pontoeletronico.resource;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.plataformalancamento.pontoeletronico.model.PontoEletronicoModel;
import br.plataformalancamento.pontoeletronico.service.PontoEletronicoService;
import br.plataformalancamento.pontoeletronico.utility.ConstantesUtility;

@Path("/pontoEletronicoResource")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(MediaType.APPLICATION_JSON)
public class PontoEletronicoResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PontoEletronicoService pontoEletronicoService;
	
	public PontoEletronicoResource() {
		this.pontoEletronicoService = new PontoEletronicoService();
	}
	
	@POST
	public String persist(PontoEletronicoModel pontoEletronicoModel) {
		this.pontoEletronicoService.persist(pontoEletronicoModel);
		return ConstantesUtility.MENSAGEM_SUCESSO;
	}
	
	@GET
	@Path("/findOne")
	public PontoEletronicoModel findOne(PontoEletronicoModel pontoEletronicoModel) {
		return this.pontoEletronicoService.findOne(pontoEletronicoModel);
	}
	
	@GET
	@Path("/findAll")
	public List<PontoEletronicoModel> findAll() {
		return this.pontoEletronicoService.findAll();
	}

	public PontoEletronicoService getPontoEletronicoService() {
		return pontoEletronicoService;
	}

	public void setPontoEletronicoService(PontoEletronicoService pontoEletronicoService) {
		this.pontoEletronicoService = pontoEletronicoService;
	}
	
}
