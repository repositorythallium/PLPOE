package br.plataformalancamento.pontoeletronico.repository;

import java.io.Serializable;
import java.util.List;

import br.plataformalancamento.pontoeletronico.entity.PontoEletronicoEntity;

public class PontoEletronicoRepository implements Serializable, BaseInterfaceRepository<PontoEletronicoEntity> {

	private static final long serialVersionUID = 1L;
	
	public PontoEletronicoRepository() { }

	@Override
	public PontoEletronicoEntity persist(PontoEletronicoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PontoEletronicoEntity delete(PontoEletronicoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PontoEletronicoEntity update(PontoEletronicoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PontoEletronicoEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PontoEletronicoEntity findOne(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PontoEletronicoEntity findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
