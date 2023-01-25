package com.hibernate.dto;

import java.util.Calendar;

public class PagosRepostajeDTO {

	private Integer id_repostaje;
	private String md_uuid;
	private Calendar md_date;
	private Integer importe;
	private String dni;
	private String matricula;
	private Calendar fch_repostaje;
	
	//CONSTRUCTORES
	
	//Pago Factura
	
	public PagosRepostajeDTO(String md_uuid, Calendar md_date, Integer importe, String dni,
			String matricula, Calendar fch_repostaje) {
		super();
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
		this.fch_repostaje = fch_repostaje;
	}
	
	//Pago Normal
	
	public PagosRepostajeDTO(String md_uuid, Calendar md_date, Integer importe, Calendar fch_repostaje) {
		super();
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
		this.fch_repostaje = fch_repostaje;
	}
	

	public PagosRepostajeDTO() {
		super();
	}

	//GETTERS Y SETTERS
	
	public Integer getId_repostaje() {
		return id_repostaje;
	}
	public void setId_repostaje(Integer id_repostaje) {
		this.id_repostaje = id_repostaje;
	}
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public Calendar getMd_date() {
		return md_date;
	}
	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}
	public Integer getImporte() {
		return importe;
	}
	public void setImporte(Integer importe) {
		this.importe = importe;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Calendar getFch_repostaje() {
		return fch_repostaje;
	}
	public void setFch_repostaje(Calendar fch_repostaje) {
		this.fch_repostaje = fch_repostaje;
	}


	//TOSTRING
	
	@Override
	public String toString() {
		return "Datos de los repostajes: id_repostaje=" + id_repostaje + "// md_uuid=" + md_uuid + "// md_date="
				+ md_date.getTime() + "// importe=" + importe + "// dni=" + dni + "// matricula=" + matricula + " // fch_repostaje="
				+ fch_repostaje.getTime() + "";
	}

}
