package com.hibernate.dal;

import java.util.List;

public interface ControlCamionesServicio {

	public void insertarCombustible(ControlCamiones controlCamiones);

	public List<ControlCamiones> buscarCamiones();
	
	public void eliminarCombustible();


}
