package br.plataformalancamento.pontoeletronico.test;

import java.io.Serializable;
import java.util.Date;

import br.plataformalancamento.pontoeletronico.entity.PontoEletronicoEntity;
import br.plataformalancamento.pontoeletronico.resource.PontoEletronicoResource;

public class PontoEletronicoResourceTest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		save();
		findOne();
		findAll();
	}
	
	private static void save() {
		PontoEletronicoResource pontoEletronicoResource = new PontoEletronicoResource();
		PontoEletronicoEntity pontoEletronicoEntity = new PontoEletronicoEntity();
			pontoEletronicoEntity.setPrimeiraEntrada(new Date());
			pontoEletronicoEntity.setPrimeiraSaida(new Date());
			pontoEletronicoEntity.setSegundaEntrada(new Date());
			pontoEletronicoEntity.setSegundaSaida(new Date());
			pontoEletronicoEntity.setObservacao("");
			pontoEletronicoResource.persist(pontoEletronicoEntity);
			System.out.println("Cadastro Realizado com Sucesso!");
	}
	
	private static void findOne() {
		PontoEletronicoResource pontoEletronicoResource = new PontoEletronicoResource();
		PontoEletronicoEntity pontoEletronicoEntity = new PontoEletronicoEntity();
			pontoEletronicoEntity.setCodigo(1L);
			pontoEletronicoEntity = pontoEletronicoResource.findOne(pontoEletronicoEntity);
			System.out.println("Data Primeira Entrada: " + pontoEletronicoEntity.getPrimeiraEntrada());
	}
	
	private static void findAll() {
		PontoEletronicoResource pontoEletronicoResource = new PontoEletronicoResource();
		for(PontoEletronicoEntity pontoEletronicoEntityResult : pontoEletronicoResource.findAll()) {
			System.out.println("Data Primeira Entrada: " + pontoEletronicoEntityResult.getPrimeiraEntrada());
		}
	}
	
}
