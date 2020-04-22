package br.testeBNP.Dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movimento_Manual implements Serializable, IEntityGenerica {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "DAT_MES")
	private int mesMovimento;
	
	@Column(name = "DAT_ANO")
	private int anoMovimento;
	
	@Column(name = "NUM_LANCAMENTO", length = 18)
	private long numeroLancamento;
	
	@Column(name = "COD_PRODUTO", length = 4)
	private int codigoProduto;
	
	@Column(name = "COD_COSIF", length = 11)
	private long codigoCOSIF;
	
	@Column(name = "VAL_VALOR", length = 18, precision = 2)
	private double valorMovimento;
	
	@Column(name = "DESC_DESCRICAO", length = 50)
	private String descricaoMovimento;
	
	@Column(name = "DAT_MOVIMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataMovimento;
	
	@Column(name = "COD_USUARIO")
	private String codigoUsuario;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMesMovimento() {
		return mesMovimento;
	}

	public void setMesMovimento(int mesMovimento) {
		this.mesMovimento = mesMovimento;
	}

	public int getAnoMovimento() {
		return anoMovimento;
	}

	public void setAnoMovimento(int anoMovimento) {
		this.anoMovimento = anoMovimento;
	}

	public long getNumeroLancamento() {
		return numeroLancamento;
	}

	public void setNumeroLancamento(long numeroLancamento) {
		this.numeroLancamento = numeroLancamento;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public long getCodigoCOSIF() {
		return codigoCOSIF;
	}

	public void setCodigoCOSIF(long codigoCOSIF) {
		this.codigoCOSIF = codigoCOSIF;
	}

	public double getValorMovimento() {
		return valorMovimento;
	}

	public void setValorMovimento(double valorMovimento) {
		this.valorMovimento = valorMovimento;
	}

	public String getDescricaoMovimento() {
		return descricaoMovimento;
	}

	public void setDescricaoMovimento(String descricaoMovimento) {
		this.descricaoMovimento = descricaoMovimento;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoMovimento;
		result = prime * result + ((dataMovimento == null) ? 0 : dataMovimento.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + mesMovimento;
		long temp;
		temp = Double.doubleToLongBits(valorMovimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Movimento_Manual other = (Movimento_Manual) obj;
		if (anoMovimento != other.anoMovimento)
			return false;
		if (dataMovimento == null) {
			if (other.dataMovimento != null)
				return false;
		} else if (!dataMovimento.equals(other.dataMovimento))
			return false;
		if (id != other.id)
			return false;
		if (mesMovimento != other.mesMovimento)
			return false;
		if (Double.doubleToLongBits(valorMovimento) != Double.doubleToLongBits(other.valorMovimento))
			return false;
		return true;
	}
	

}
