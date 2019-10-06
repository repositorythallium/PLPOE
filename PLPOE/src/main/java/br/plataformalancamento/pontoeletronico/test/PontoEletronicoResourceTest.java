package br.plataformalancamento.pontoeletronico.test;

import java.io.Serializable;
import java.util.Date;

import br.plataformalancamento.pontoeletronico.model.PontoEletronicoModel;
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
		PontoEletronicoModel pontoEletronicoModel = new PontoEletronicoModel();
			pontoEletronicoModel.setDataHoraPrimeiraEntrada(new Date());
			pontoEletronicoModel.setDataHoraSegundaEntrada(new Date());
			pontoEletronicoModel.setDataHoraPrimeiraSaida(new Date());
			pontoEletronicoModel.setDataHoraSegundaSaida(new Date());
			pontoEletronicoModel.setObservacao("");
			pontoEletronicoResource.persist(pontoEletronicoModel);
			System.out.println("Cadastro Realizado com Sucesso!");
	}
	
	private static void findOne() {
		PontoEletronicoResource pontoEletronicoResource = new PontoEletronicoResource();
		PontoEletronicoModel pontoEletronicoModel = new PontoEletronicoModel();
			pontoEletronicoModel.setCodigo(1L);
			pontoEletronicoModel = pontoEletronicoResource.findOne(pontoEletronicoModel);
			System.out.println("Data Primeira Entrada: " + pontoEletronicoModel.getDataHoraPrimeiraEntrada());
	}
	
	private static void findAll() {
		PontoEletronicoResource pontoEletronicoResource = new PontoEletronicoResource();
		for(PontoEletronicoModel pontoEletronicoEntityResult : pontoEletronicoResource.findAll()) {
			System.out.println("Data Primeira Entrada: " + pontoEletronicoEntityResult.getDataHoraPrimeiraEntrada());
		}
	}
	
}
