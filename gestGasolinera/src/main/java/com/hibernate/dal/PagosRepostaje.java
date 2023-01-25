package com.hibernate.dal;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="gas_tch_gasolinera", schema="dlk_gestion_gasolinera")
public class PagosRepostaje {
	//COLUMNAS
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id_repostaje", unique=true, nullable=false)
		private Integer id_repostaje;
		@Column(name="md_uuid",nullable=false)
		private String md_uuid;
		@Column(name="md_date",nullable=false)
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar md_date;
		@Column(name="importe",nullable=false)
		private Integer importe;
		@Column(name="dni",nullable=true)
		private String dni;
		@Column(name="matricula",nullable=true)
		private String matricula;
		@Column(name="fch_repostaje",nullable=false)
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar fch_repostaje;
			
		//GETTERS AND SETTERS
		
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
			return "Datos de los repostajes:\n id_repostaje=" + id_repostaje + "\n md_uuid=" + md_uuid + "\n md_date="
					+ md_date.getTime() + "\n importe=" + importe + "\n dni=" + dni + "\n matricula=" + matricula + " \n fch_repostaje="
					+ fch_repostaje.getTime() + "\n\n";
		}
		

}
