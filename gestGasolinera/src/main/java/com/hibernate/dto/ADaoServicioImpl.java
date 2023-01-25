package com.hibernate.dto;

import com.hibernate.dal.ControlCamiones;
import com.hibernate.dal.PagosRepostaje;

public class ADaoServicioImpl implements ADaoServicio{
	
	@Override
	public PagosRepostaje PagoRepostajeDTOADAO(PagosRepostajeDTO pagoRepostajeDTO) {
		PagosRepostaje pagosRepostaje = new PagosRepostaje();
		if(pagoRepostajeDTO != null) {
			pagosRepostaje.setImporte(pagoRepostajeDTO.getImporte());
			pagosRepostaje.setFch_repostaje(pagoRepostajeDTO.getFch_repostaje());
			pagosRepostaje.setMd_uuid(pagoRepostajeDTO.getMd_uuid());
			pagosRepostaje.setMd_date(pagoRepostajeDTO.getMd_date());
			pagosRepostaje.setDni(pagoRepostajeDTO.getDni());
			pagosRepostaje.setMatricula(pagoRepostajeDTO.getMatricula());
		}
		return pagosRepostaje;
	}

	@Override
	public ControlCamiones ControlCamionesDTOADAO(ControlCamionesDTO controlCamionesDTO){
		ControlCamiones controlCamiones = new ControlCamiones();
		if(controlCamionesDTO != null) {
			controlCamiones.setMd_uuid(controlCamionesDTO.getMd_uuid());
			controlCamiones.setMd_date(controlCamionesDTO.getMd_date());
			controlCamiones.setLitros_combustible(controlCamionesDTO.getLitros_combustible());
			controlCamiones.setTipo_combustible(controlCamionesDTO.getTipo_combustible());
			controlCamiones.setImporte(controlCamionesDTO.getImporte());
		}
		return controlCamiones;
	}

}
