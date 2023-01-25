package com.hibernate.dto;

import com.hibernate.dal.ControlCamiones;
import com.hibernate.dal.PagosRepostaje;

public interface ADaoServicio {
	
public PagosRepostaje PagoRepostajeDTOADAO(PagosRepostajeDTO pagoRepostajeDTO);
	
	public ControlCamiones ControlCamionesDTOADAO(ControlCamionesDTO controlCamionesDTO);

}
