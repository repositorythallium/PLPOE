package br.plataformalancamento.pontoeletronico.repository;

import java.io.Serializable;
import java.util.List;

import br.plataformalancamento.pontoeletronico.entity.PontoEletronicoEntity;

public class PontoEletronicoRepository implements Serializable, BaseInterfaceRepository<PontoEletronicoEntity> {

	private static final long serialVersionUID = 1L;
	
	private BaseRepository<PontoEletronicoEntity> baseRepositoryPontoEletronicoEntity;
	
	public PontoEletronicoRepository() { 
		baseRepositoryPontoEletronicoEntity = new BaseRepository<PontoEletronicoEntity>();
	}

	@Override
	public PontoEletronicoEntity persist(PontoEletronicoEntity entity) {
		return this.baseRepositoryPontoEletronicoEntity.persist(entity);
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

	public List<PontoEletronicoEntity> findAll() {
		return baseRepositoryPontoEletronicoEntity.findAll(PontoEletronicoEntity.class);
	}

	@Override
	public PontoEletronicoEntity findOne(Long codigoPontoEletronico) {
		return baseRepositoryPontoEletronicoEntity.findOne(codigoPontoEletronico);
	}

	@Override
	public PontoEletronicoEntity findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
