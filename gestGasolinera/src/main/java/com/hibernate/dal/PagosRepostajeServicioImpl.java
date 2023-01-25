package com.hibernate.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;


@Component
public class PagosRepostajeServicioImpl {
	@PersistenceContext
	private EntityManager em;
	
	public void insertarRepostaje(PagosRepostaje pagosRepostaje) {
		em.persist(pagosRepostaje);
		em.clear();
		em.close();
	}

	public List<PagosRepostaje> buscarTodos() {
		return em.createQuery("SELECT repost FROM PagosRepostaje repost").getResultList();
	}

}
