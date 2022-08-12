/**
 * 
 */
package com.devpredator.projectsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectsf.entity.Empleado;

/**
 * @author Alexnader
 * clase de logica de negocio para empleados
 *
 */
public class EmpleadoService {
	
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI
	 * @return {@link Empleado} lista de Empleados.
	 */
	public List<Empleado> consultarEmpleados() {
		 
		
		List<Empleado>  empleados=new ArrayList<Empleado>();
		
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft= new Empleado();
		Empleado empleadoApple= new Empleado();
		
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		
		empleadoMicrosoft.setNombre("Luis Jesús");
		empleadoMicrosoft.setPrimerApellido("Lopez");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
	
		
		return empleados;
		
	}
	
	

}
