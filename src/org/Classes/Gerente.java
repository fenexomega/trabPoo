package org.Classes;

import java.io.Serializable;


public class Gerente implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	public void gerarTabelas() {

	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

}
