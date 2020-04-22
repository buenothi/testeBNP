package br.testeBNP.Repository;

public interface IAbstractRepository <T, PK> {
	
		void createOrUpdate(T t);
		
		T read(PK id);
		
		void delete (T t);

}
