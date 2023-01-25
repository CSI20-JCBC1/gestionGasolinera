package com.hibernate.dto;

import java.util.Calendar;

public class ControlCamionesDTO {

	private String id_repostaje;
	private String md_uuid;
	private Calendar md_date;
	private int litros_combustible;
	private String tipo_combustible;
	private int importe;
	
	//CONSTRUCTORES
	
	public ControlCamionesDTO(String md_uuid, Calendar md_date, int litros_combustible,
			String tipo_combustible, int importe) {
		super();
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.litros_combustible = litros_combustible;
		this.tipo_combustible = tipo_combustible;
		this.importe = importe;
	}
	
	//GETTERS Y SETTERS

	public String getId_repostaje() {
		return id_repostaje;
	}

	public void setId_repostaje(String id_repostaje) {
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

	public int getLitros_combustible() {
		return litros_combustible;
	}

	public void setLitros_combustible(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}

	public String getTipo_combustible() {
		return tipo_combustible;
	}

	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	//TOSTRING
	
	@Override
	public String toString() {
		return "Control de camiones: id_repostaje=" + id_repostaje + "// md_uuid=" + md_uuid + "// md_date=" + md_date.getTime()
				+ "// litros_combustible=" + litros_combustible + "// tipo_combustible=" + tipo_combustible + "// importe="
				+ importe + "]";
	}
	
}
