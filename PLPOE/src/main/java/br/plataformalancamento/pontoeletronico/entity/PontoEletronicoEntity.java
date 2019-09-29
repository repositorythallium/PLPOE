package br.plataformalancamento.pontoeletronico.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.plataformalancamento.pontoeletronico.utility.ConstantesUtility;

@Entity
@Table(name = ConstantesUtility.TABLE_PONTO_ELETRONICO_NAME)
public class PontoEletronicoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO")
	private Long codigo;
	
	@Column(name = "PRIMEIRA_ENTRADA")
	private Date primeiraEntrada;
	
	@Column(name = "PRIMEIRA_SAIDA")
	private Date primeiraSaida;
	
	@Column(name = "SEGUNDA_ENTRADA")
	private Date segundaEntrada;
	
	@Column(name = "SEGUNDA_SAIDA")
	private Date segundaSaida;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	public PontoEletronicoEntity() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Date getPrimeiraEntrada() {
		return primeiraEntrada;
	}

	public void setPrimeiraEntrada(Date primeiraEntrada) {
		this.primeiraEntrada = primeiraEntrada;
	}

	public Date getPrimeiraSaida() {
		return primeiraSaida;
	}

	public void setPrimeiraSaida(Date primeiraSaida) {
		this.primeiraSaida = primeiraSaida;
	}

	public Date getSegundaEntrada() {
		return segundaEntrada;
	}

	public void setSegundaEntrada(Date segundaEntrada) {
		this.segundaEntrada = segundaEntrada;
	}

	public Date getSegundaSaida() {
		return segundaSaida;
	}

	public void setSegundaSaida(Date segundaSaida) {
		this.segundaSaida = segundaSaida;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PontoEletronicoEntity other = (PontoEletronicoEntity) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PontoEletronicoEntity [codigo=" + codigo + "]";
	}
	
}
