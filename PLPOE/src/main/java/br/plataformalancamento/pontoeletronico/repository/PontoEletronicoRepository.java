package br.plataformalancamento.pontoeletronico.repository;

import java.io.Serializable;
import java.util.List;

import br.plataformalancamento.pontoeletronico.model.PontoEletronicoModel;

public class PontoEletronicoRepository implements Serializable, BaseInterfaceRepository<PontoEletronicoModel> {

	private static final long serialVersionUID = 1L;
	
	private BaseRepository<PontoEletronicoModel> baseRepositoryPontoEletronicoEntity;
	
	public PontoEletronicoRepository() { 
		baseRepositoryPontoEletronicoEntity = new BaseRepository<PontoEletronicoModel>();
	}

	@Override
	public PontoEletronicoModel persist(PontoEletronicoModel entity) {
		return this.baseRepositoryPontoEletronicoEntity.persist(entity);
	}

	@Override
	public PontoEletronicoModel delete(PontoEletronicoModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PontoEletronicoModel update(PontoEletronicoModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PontoEletronicoModel> findAll() {
		return baseRepositoryPontoEletronicoEntity.findAll(PontoEletronicoModel.class);
	}

	@Override
	public PontoEletronicoModel findOne(Long codigoPontoEletronico) {
		return baseRepositoryPontoEletronicoEntity.findOne(codigoPontoEletronico);
	}

	@Override
	public PontoEletronicoModel findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
