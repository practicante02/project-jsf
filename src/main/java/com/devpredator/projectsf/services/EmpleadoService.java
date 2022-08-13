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
		
		Empleado empleadoNetflix= new Empleado();
		Empleado empleadoAmazon= new Empleado();
		Empleado empleadoHP= new Empleado();
		
		Empleado empleadoORACLE = new Empleado();
		Empleado empleadoDeloitte= new Empleado();
		Empleado empleadoDisney= new Empleado();
		
		
		//:::::::::::::::::::::::::::::::::::
		
		
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
		
		
		
		empleadoNetflix.setNombre("Luis Jesús");
		empleadoNetflix.setPrimerApellido("Lopez");
		empleadoNetflix.setSegundoApellido("Romero");
		empleadoNetflix.setPuesto("CEO");
		empleadoNetflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Luis Jesús");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("CEO");
		empleadoAmazon.setEstatus(true);
		
		
		empleadoHP.setNombre("Luis Jesús");
		empleadoHP.setPrimerApellido("Lopez");
		empleadoHP.setSegundoApellido("Romero");
		empleadoHP.setPuesto("CEO");
		empleadoHP.setEstatus(true);
		
		
		
		empleadoORACLE.setNombre("Luis Jesús");
		empleadoORACLE.setPrimerApellido("Lopez");
		empleadoORACLE.setSegundoApellido("Romero");
		empleadoORACLE.setPuesto("CEO");
		empleadoORACLE.setEstatus(true);
		
	
		
		
		empleadoDeloitte.setNombre("Luis Jesús");
		empleadoDeloitte.setPrimerApellido("Lopez");
		empleadoDeloitte.setSegundoApellido("Romero");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setEstatus(true);
		
		empleadoDisney.setNombre("Luis Jesús");
		empleadoDisney.setPrimerApellido("Lopez");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("CEO");
		empleadoDisney.setEstatus(true);
		
		//--------------------------------------------------------
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
	
		//:::::::::::::::::::::::::::::::::::
		
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
	
	
		
		empleados.add(empleadoORACLE);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
	
		//-------------------------------------------
	
		
		return empleados;
		
	}
	
	

}
