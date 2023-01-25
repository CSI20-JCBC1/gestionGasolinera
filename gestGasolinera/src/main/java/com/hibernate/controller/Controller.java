package com.hibernate.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.dal.ControlCamiones;
import com.hibernate.dal.PagosRepostaje;
import com.hibernate.dto.ADaoServicio;
import com.hibernate.dto.ADaoServicioImpl;
import com.hibernate.dto.ADtoServicio;
import com.hibernate.dto.ADtoServicioImpl;
import com.hibernate.dto.ControlCamionesDTO;
import com.hibernate.dto.PagosRepostajeDTO;
import com.hibernate.impl.Consultas;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		Consultas consulta = (Consultas) context.getBean(Consultas.class);

		Integer opcion1;
		ADtoServicio aDto = new ADtoServicioImpl();
		ADaoServicio aDao = new ADaoServicioImpl();
		do {
			System.out.println("Escriba el valor a uno de los asignados");
			System.out.println("1.-Repostaje normal");
			System.out.println("2.-Repostaje factura");
			System.out.println("3.-Ver todos los repostajes.");
			System.out.println("4.-Importe total combustible vendido.");
			System.out.println("5.-Llenado de deposito.");
			System.out.println("6.-Eliminar ultimo llenado de deposito.");
			System.out.println("7.-Ver todos los llenados de deposito.");

			System.out.println();
			System.out.print("Introduzca una opcion: ");
			Scanner scan = new Scanner(System.in);
			opcion1 = scan.nextInt();
			Calendar fecha = Calendar.getInstance();

			// DTO para el pago repostaje
			PagosRepostajeDTO DTO;
			PagosRepostaje pagosRepostaje;

			// DTO para el control camiones
			ControlCamionesDTO DTOCamiones;
			ControlCamiones controlCamiones;

			switch (opcion1) {
			case 1:
				System.out.println("Has escogido la opción de repostaje con pago normal");
				DTO = aDto.APagoRepostajeNormalDTO("ydwuiydiui23", fecha, 23, fecha);
				pagosRepostaje = aDao.PagoRepostajeDTOADAO(DTO);
				consulta.insertarUnRepostaje(pagosRepostaje);
				break;
			case 2:
				System.out.println("Has escogido la opción de repostaje con pago con factura");
				DTO = aDto.APagoRepostajeFacturaDTO("rvhfy1asgtdkkuhgu3", fecha, 32, "77922038N", "9345AFX", fecha);
				pagosRepostaje = aDao.PagoRepostajeDTOADAO(DTO);
				consulta.insertarUnRepostaje(pagosRepostaje);
				break;
			case 3:
				System.out.println("Has escogido la opción de ver todos los repostajes");
				System.out.print("Repostaje: " + consulta.buscarTodos());
				break;
			case 4:
				List<PagosRepostaje> repostajes = new ArrayList<PagosRepostaje>();
				repostajes = consulta.buscarTodos();
				int suma = 0;
				for (PagosRepostaje pagos : repostajes) {
					suma += pagos.getImporte();
				}
				System.out.println("La suma total de los repostajes es de: " + suma + " euros");
				break;
			case 5:
				System.out.println("Has escogido la opción de llenar el depósito");
				DTOCamiones = aDto.AControlCamionesDTO("rvhqer5dkkuhgu3", fecha, 28, "Gasolina95", 87);
				controlCamiones = aDao.ControlCamionesDTOADAO(DTOCamiones);
				consulta.insertarELCombustible(controlCamiones);
				break;
			case 6:

				break;
			case 7:
				System.out.println("Has escogido la opción de ver todos los llenados de depósito");
				System.out.print("Llenado: " + consulta.buscarCamiones());
				break;
			default:

			}

		} while (opcion1 != 0);
	}
}
