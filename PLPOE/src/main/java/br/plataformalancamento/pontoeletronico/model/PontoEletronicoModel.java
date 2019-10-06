package br.plataformalancamento.pontoeletronico.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.plataformalancamento.pontoeletronico.utility.ConstantesUtility;

@Entity
@Table(name = ConstantesUtility.TABLE_PONTO_ELETRONICO_NAME)
@XmlRootElement
public class PontoEletronicoModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO")
	private Long codigo;
	
	@Column(name = "HORA_PRIMEIRA_ENTRADA")
	private Date dataHoraPrimeiraEntrada;
	
	@Column(name = "HORA_PRIMEIRA_SAIDA")
	private Date dataHoraPrimeiraSaida;
	
	@Column(name = "HORA_SEGUNDA_ENTRADA")
	private Date dataHoraSegundaEntrada;
	
	@Column(name = "HORA_SEGUNDA_SAIDA")
	private Date dataHoraSegundaSaida;
	
	@Column(name = "EXPEDIENTE_DIARIO_TOTAL")
	private Date expedienteDiarioTotal;
	
	@Column(name = "CREDITO_DIARIO_TOTAL")
	private Date creditoDiarioTotal;
	
	@Column(name = "DEBITO_DIARIO_TOTAL")
	private Date debitoDiarioTotal;
	
	@Column(name = "SALDO_HORA_TOTAL")
	private Date saldoHoraTotal;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	public PontoEletronicoModel() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Date getDataHoraPrimeiraEntrada() {
		return dataHoraPrimeiraEntrada;
	}

	public void setDataHoraPrimeiraEntrada(Date dataHoraPrimeiraEntrada) {
		this.dataHoraPrimeiraEntrada = dataHoraPrimeiraEntrada;
	}

	public Date getDataHoraPrimeiraSaida() {
		return dataHoraPrimeiraSaida;
	}

	public void setDataHoraPrimeiraSaida(Date dataHoraPrimeiraSaida) {
		this.dataHoraPrimeiraSaida = dataHoraPrimeiraSaida;
	}

	public Date getDataHoraSegundaEntrada() {
		return dataHoraSegundaEntrada;
	}

	public void setDataHoraSegundaEntrada(Date dataHoraSegundaEntrada) {
		this.dataHoraSegundaEntrada = dataHoraSegundaEntrada;
	}

	public Date getDataHoraSegundaSaida() {
		return dataHoraSegundaSaida;
	}

	public void setDataHoraSegundaSaida(Date dataHoraSegundaSaida) {
		this.dataHoraSegundaSaida = dataHoraSegundaSaida;
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
		PontoEletronicoModel other = (PontoEletronicoModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PontoEletronicoModel [codigo=" + codigo + "]";
	}
	
}
