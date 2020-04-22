package br.testeBNP.Dominio;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Produto implements Serializable, IEntityGenerica {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "COD_PRODUTO", length = 4)
	private int codigoProduto;

	@Column(name = "DESC_PRODUTO", length = 4)
	private String descricaoProduto;
	
	@Column(name = "STA_STATUS", length = 1)
	private char statusRegistro;
	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
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
		result = prime * result + codigoProduto;
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
		Produto other = (Produto) obj;
		if (codigoProduto != other.codigoProduto)
			return false;
		return true;
	}
	
}
