package br.testeBNP.Repository;

import br.testeBNP.Dominio.Produto;

public class ProdutoRepository extends AbstractRepository<Produto, Long> {

	public ProdutoRepository() {
		super(Produto.class);
	}

}
