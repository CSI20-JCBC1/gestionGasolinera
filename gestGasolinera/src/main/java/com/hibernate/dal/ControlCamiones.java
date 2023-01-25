package com.hibernate.dal;

import java.util.Calendar;

import javax.persistence.*;



@Entity
@Table(name="gas_tch_combustible_camiones", schema="dlk_gestion_gasolinera")
public class ControlCamiones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_repostaje", unique=true, nullable=false)
	private String id_repostaje;
	@Column(name="md_uuid",nullable=false)
	private String md_uuid;
	@Column(name="md_date",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar md_date;
	@Column
	private int litros_combustible;
	@Column
	private String tipo_combustible;
	@Column
	private int importe;
	
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
		return "Control de camiones:\n id_repostaje=" + id_repostaje + "\n md_uuid=" + md_uuid + "\n md_date=" + md_date.getTime()
				+ "\n litros_combustible=" + litros_combustible + "\n tipo_combustible=" + tipo_combustible + "\n importe="
				+ importe + "\n\n";
	}
	

}
