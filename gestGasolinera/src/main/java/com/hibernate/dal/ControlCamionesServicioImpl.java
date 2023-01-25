package com.hibernate.dal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class ControlCamionesServicioImpl implements ControlCamionesServicio{

	@PersistenceContext
	private EntityManager emCamiones;
	
	public void insertarCombustible(ControlCamiones controlCamiones){
		emCamiones.persist(controlCamiones);
		emCamiones.clear();
		emCamiones.close();
	}
	
	public void eliminarCombustible(ControlCamiones controlCamiones){
		List<ControlCamiones> lista= new ArrayList<ControlCamiones>();
		lista=emCamiones.createQuery("SELECT combustible FROM ControlCamiones combustible").getResultList();
		int ultimoReg=lista.size();
	}

	public List<ControlCamiones> buscarCamiones() {
		return emCamiones.createQuery("SELECT combustible FROM ControlCamiones combustible").getResultList();
	}

}
