/**
 * 
 */
package com.devpredator.projectsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.devpredator.projectsf.entity.Empleado;
import com.devpredator.projectsf.services.EmpleadoService;

/**
 * @author alexander Clase controller que se encarga de procesar la indomracion
 *         para la pantalla prinmcipal.xhtml
 * 
 *
 */
@ManagedBean
@ViewScoped
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla
	 */

	private List<Empleado> empleados;
	
	/**
	 *  Lista de empleados filtrados
	 * 
	 */
	
	
	private List<Empleado> empleadosFiltrados;

	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados
	 */

	private EmpleadoService empleadoService = new EmpleadoService();

	
	/**
	 * metodo que se encarga de inicialiazar la información de la pantalla principal
	 */
	
	
	@PostConstruct
	public void init() {
		
		
		this.consultarEmpleados();
		
	}
	
	

	public void consultarEmpleados() {

		this.empleados = this.empleadoService.consultarEmpleados();

	}
	

	

	/**
	 * @return the empleados
	 */
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}



	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}



	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

}
