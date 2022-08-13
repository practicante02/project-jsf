package com.devpredator.projectsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devpredator.projectsf.dto.UsuarioDTO;

/* Clase que permite controlar el funcionamient con la pantalla de logion.xhtmml*/

@ManagedBean
public class LoginController {
	/**
	 * Usuarios que ingresan en el login
	 */

	private String usuario;
	private String password;
	
	
	/**
	 * Bean que mantiene la información en sesión
	 */
	

	@ManagedProperty ("#{sessionController}")
	private SessionController sessionController;
	
	
	/**
	 * @return the password
	 */

	/*
	 * Metodo que sirve para entrar a la pantalla control
	 */

	public void ingresar() {

		System.out.println("Usuario: " + usuario);

		if (usuario.equals("alexander") && password.equals("12345")) {
				
			try {
				
				
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
				
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin: txtusuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));

				
				e.printStackTrace();
			}
			
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin: txtusuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario incorrecto", ""));

		}

	}
	
	
	private void redireccionar(String pagina) throws IOException {
		
		ExternalContext ec= FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
		
		
	}

	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}


	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
