package br.plataformalancamento.pontoeletronico.resource;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.plataformalancamento.pontoeletronico.entity.PontoEletronicoEntity;
import br.plataformalancamento.pontoeletronico.service.PontoEletronicoService;
import br.plataformalancamento.pontoeletronico.utility.ConstantesUtility;

@Path("/pontoEletronicoResource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PontoEletronicoResource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PontoEletronicoService pontoEletronicoService;
	
	public PontoEletronicoResource() {
		this.pontoEletronicoService = new PontoEletronicoService();
	}
	
	@POST
	public String persist(PontoEletronicoEntity pontoEletronicoEntity) {
		this.pontoEletronicoService.persist(pontoEletronicoEntity);
		return ConstantesUtility.MENSAGEM_SUCESSO;
	}
	
	public PontoEletronicoEntity findOne(PontoEletronicoEntity pontoEletronicoEntity) {
		return this.pontoEletronicoService.findOne(pontoEletronicoEntity);
	}
	
	@GET
	public List<PontoEletronicoEntity> findAll() {
		return this.pontoEletronicoService.findAll();
	}

	public PontoEletronicoService getPontoEletronicoService() {
		return pontoEletronicoService;
	}

	public void setPontoEletronicoService(PontoEletronicoService pontoEletronicoService) {
		this.pontoEletronicoService = pontoEletronicoService;
	}
	
}
