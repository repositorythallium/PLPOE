package br.plataformalancamento.pontoeletronico.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import br.plataformalancamento.pontoeletronico.model.PontoEletronicoModel;
import br.plataformalancamento.pontoeletronico.repository.PontoEletronicoRepository;

public class PontoEletronicoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PontoEletronicoRepository pontoEletronicoRepository;
	
	public PontoEletronicoService() {
		this.pontoEletronicoRepository = new PontoEletronicoRepository();
	}
	
	public void persist(PontoEletronicoModel pontoEletronicoModel) {
		this.pontoEletronicoRepository.persist(pontoEletronicoModel);
	}
	
	public String merge() {
		return "";
	}
	
	public String remove() {
		return "";
	}
	
	public List<PontoEletronicoModel> findAll() {
		return pontoEletronicoRepository.findAll();
	}
	
	public PontoEletronicoModel findOne(PontoEletronicoModel pontoEletronicoModel) {
		return pontoEletronicoRepository.findOne(pontoEletronicoModel.getCodigo());
	}
	
	public PontoEletronicoModel findOne(Date dataRegistroPontoEletronico) {
		return null;
	}

	public PontoEletronicoRepository getPontoEletronicoRepository() {
		return pontoEletronicoRepository;
	}

	public void setPontoEletronicoRepository(PontoEletronicoRepository pontoEletronicoRepository) {
		this.pontoEletronicoRepository = pontoEletronicoRepository;
	}

}
