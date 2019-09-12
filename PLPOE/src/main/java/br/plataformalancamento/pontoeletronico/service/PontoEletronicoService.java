package br.plataformalancamento.pontoeletronico.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import br.plataformalancamento.pontoeletronico.entity.PontoEletronicoEntity;
import br.plataformalancamento.pontoeletronico.repository.PontoEletronicoRepository;

public class PontoEletronicoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PontoEletronicoRepository pontoEletronicoRepository;
	
	public PontoEletronicoService() {
		this.pontoEletronicoRepository = new PontoEletronicoRepository();
	}
	
	public void persist(PontoEletronicoEntity pontoEletronicoEntity) {
		this.pontoEletronicoRepository.persist(pontoEletronicoEntity);
	}
	
	public String merge() {
		return "";
	}
	
	public String remove() {
		return "";
	}
	
	public List<PontoEletronicoEntity> findAll() {
		return pontoEletronicoRepository.findAll();
	}
	
	public PontoEletronicoEntity findOne(PontoEletronicoEntity pontoEletronicoEntity) {
		return pontoEletronicoRepository.findOne(pontoEletronicoEntity.getCodigo());
	}
	
	public PontoEletronicoEntity findOne(Date dataRegistroPontoEletronico) {
		return null;
	}

	public PontoEletronicoRepository getPontoEletronicoRepository() {
		return pontoEletronicoRepository;
	}

	public void setPontoEletronicoRepository(PontoEletronicoRepository pontoEletronicoRepository) {
		this.pontoEletronicoRepository = pontoEletronicoRepository;
	}

}
