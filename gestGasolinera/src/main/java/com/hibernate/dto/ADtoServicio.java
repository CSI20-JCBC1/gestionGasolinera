package com.hibernate.dto;

import java.util.Calendar;

public interface ADtoServicio {
	
	public PagosRepostajeDTO APagoRepostajeFacturaDTO(String md_uuid, Calendar md_date, Integer importe, String dni, String matricula,
			Calendar fch_repostaje);
	
	public PagosRepostajeDTO APagoRepostajeNormalDTO(String md_uuid, Calendar md_date, Integer importe, Calendar fch_repostaje);
	
	public ControlCamionesDTO AControlCamionesDTO(String md_uuid, Calendar md_date, int litros_combustible,
			String tipo_combustible, int importe);

}
