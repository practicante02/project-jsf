/**
 * 
 */
package com.devpredator.projectsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author alexander Clase que se encarga de cerrar la sesion
 * Clase que se encargar de mantener la información del usuario en sesion
 *
 */

@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {

		System.out.println("Cerrar sesion......");
		
	}

	/**
	 * Metodo que permite cerrar la sesion del usuario para la pantalla principal
	 */

	public void cerrarSession() {

		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		
		try {
			redireccionar("login.xhtml");
		} catch (IOException e) {
		
			
			
			e.printStackTrace();
		}

	}
	
	/**
	 * Metodo que permite redireccionar a una pantalla
	 * @param pagina {@link String} pagina a redirrecionarse
	 * @throws IOException Excepcion en caso de errrr al encontrar la pagina
	 */
	private void redireccionar(String pagina) throws IOException {

		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);

	}

}
