package br.testeBNP.Service;

import java.util.List;

import br.testeBNP.Dominio.Movimento_Manual;
import br.testeBNP.Repository.Movimento_ManualRepository;

public class Movimento_ManualService {

	Movimento_ManualRepository movManual = new Movimento_ManualRepository();
	
	public void createOrUpdate(Movimento_Manual movimentoManual) {
		this.movManual.createOrUpdate(movimentoManual);
	}
	
	public Movimento_Manual read(Long id){
		return this.movManual.read(id);
	}
	
	public void delete(Movimento_Manual movimentoManual) {
		this.movManual.delete(movimentoManual);
	}
	
	public List<Movimento_Manual> findAll() {
		return this.movManual.findAll();
	}
	
}
