package com.hibernate.impl;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.dal.ControlCamiones;
import com.hibernate.dal.ControlCamionesServicioImpl;
import com.hibernate.dal.PagosRepostaje;
import com.hibernate.dal.PagosRepostajeServicioImpl;

@Service
public class Consultas{
	
		@Autowired
		private PagosRepostajeServicioImpl pri;
		@Autowired
		private ControlCamionesServicioImpl cci;
		
		//CONSULTAS DEL PAGO DEL REPOSTAJE
		
		@Transactional
		public void insertarUnRepostaje(PagosRepostaje pagosRepostaje) {
			pri.insertarRepostaje(pagosRepostaje);
		}
		
		@Transactional
		public void insertarListaRepostajes(Collection<PagosRepostaje> colRepostaje){
			for (PagosRepostaje pagosRepostaje : colRepostaje) {
				pri.insertarRepostaje(pagosRepostaje);
			}
		}
		
		@Transactional
		public List<PagosRepostaje> buscarTodos() {
			return pri.buscarTodos();
		}
		
		//CONSULTAS DEL CONTROL DE CAMIONES
		
		@Transactional
		public void insertarELCombustible(ControlCamiones controlCamiones) {
			cci.insertarCombustible(controlCamiones);
		}
		
		@Transactional
		public void insertarListaCombustibles(Collection<ControlCamiones> colCombustible){
			for (ControlCamiones controlCamiones : colCombustible) {
				cci.insertarCombustible(controlCamiones);
			}
		}
		
		@Transactional
		public List<ControlCamiones> buscarCamiones() {
			return cci.buscarCamiones();
		}
		
		@Transactional
		public void eliminarCombustible() {
			cci.eliminarCombustible();
		}
}