package br.testeBNP.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.testeBNP.Dominio.IEntityGenerica;

public abstract class AbstractRepository<T extends IEntityGenerica, PK> implements IAbstractRepository<T, PK> {

	private static EntityManager manager = ConnectionFactory.getEntityManager();

	private Class<T> persistentClass;

	public AbstractRepository(Class<T> entityClass) {
		this.persistentClass = entityClass;
	}

	@Override
	public void createOrUpdate(T t) {
		try {
			manager.getTransaction().begin();
			if (t.getId() == null) {
				manager.persist(t);
			} else {
				manager.merge(t);
			}
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		}
	}

	@Override
	public T read(PK id) {
		return (T) manager.find(persistentClass, id);
	}

	@Override
	public void delete(T t) {
		Object c = manager.merge(t);
		try {
			manager.getTransaction().begin();
			manager.remove(c);
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<T> findAll() {
		CriteriaQuery cq = manager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(persistentClass));
		return manager.createQuery(cq).getResultList();
	}

}
