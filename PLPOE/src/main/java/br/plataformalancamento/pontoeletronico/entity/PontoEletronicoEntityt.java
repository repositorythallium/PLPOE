package br.plataformalancamento.pontoeletronico.entity;

import java.io.Serializable;

public class PontoEletronicoEntityt implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private String primeiraEntrada;
	
	private String primeiraSaida;
	
	private String segundaEntrada;
	
	private String segundaSaida;
	
	public PontoEletronicoEntityt() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getPrimeiraEntrada() {
		return primeiraEntrada;
	}

	public void setPrimeiraEntrada(String primeiraEntrada) {
		this.primeiraEntrada = primeiraEntrada;
	}

	public String getPrimeiraSaida() {
		return primeiraSaida;
	}

	public void setPrimeiraSaida(String primeiraSaida) {
		this.primeiraSaida = primeiraSaida;
	}

	public String getSegundaEntrada() {
		return segundaEntrada;
	}

	public void setSegundaEntrada(String segundaEntrada) {
		this.segundaEntrada = segundaEntrada;
	}

	public String getSegundaSaida() {
		return segundaSaida;
	}

	public void setSegundaSaida(String segundaSaida) {
		this.segundaSaida = segundaSaida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
