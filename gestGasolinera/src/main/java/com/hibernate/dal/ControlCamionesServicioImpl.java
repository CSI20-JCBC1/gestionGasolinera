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
	
	public void eliminarCombustible(){
		List<ControlCamiones> listaCamiones = buscarCamiones();
		emCamiones.remove(listaCamiones.get(listaCamiones.size()-1));
		emCamiones.clear();
		emCamiones.close();
	}

	public List<ControlCamiones> buscarCamiones() {
		return emCamiones.createQuery("SELECT combustible FROM ControlCamiones combustible").getResultList();
	}
	
	

}
