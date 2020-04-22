package br.testeBNP.Dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produtos_COSIF implements Serializable, IEntityGenerica {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "COD_PRODUTO", length = 4)
	private long codigoProduto;
	
	@Column(name = "COD_COSIF", length = 11)
	private long codigoCOSIF;
	
	@Column(name = "COD_CLASSIFICACAO", length = 6)
	private String codigoClassificacao;
	
	@Column(name = "STA_STATUS", length = 1)
	private char statusRegistro;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public long getCodigoCOSIF() {
		return codigoCOSIF;
	}

	public void setCodigoCOSIF(long codigoCOSIF) {
		this.codigoCOSIF = codigoCOSIF;
	}

	public String getCodigoClassificacao() {
		return codigoClassificacao;
	}

	public void setCodigoClassificacao(String codigoClassificacao) {
		this.codigoClassificacao = codigoClassificacao;
	}

	public char getStatusRegistro() {
		return statusRegistro;
	}

	public void setStatusRegistro(char statusRegistro) {
		this.statusRegistro = statusRegistro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigoCOSIF ^ (codigoCOSIF >>> 32));
		result = prime * result + ((codigoClassificacao == null) ? 0 : codigoClassificacao.hashCode());
		result = prime * result + (int) (codigoProduto ^ (codigoProduto >>> 32));
		result = prime * result + statusRegistro;
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
		Produtos_COSIF other = (Produtos_COSIF) obj;
		if (codigoCOSIF != other.codigoCOSIF)
			return false;
		if (codigoClassificacao == null) {
			if (other.codigoClassificacao != null)
				return false;
		} else if (!codigoClassificacao.equals(other.codigoClassificacao))
			return false;
		if (codigoProduto != other.codigoProduto)
			return false;
		if (statusRegistro != other.statusRegistro)
			return false;
		return true;
	}
	

}
