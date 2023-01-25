package com.hibernate.dal;

import java.util.List;

public interface PagosRepostajeServicio {
	
	public void insertarRepostaje(PagosRepostaje pagosRepostaje);
	
	
	public List<PagosRepostaje> buscarTodos();

}
