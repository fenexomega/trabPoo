package org.Classes;

import java.io.Serializable;


public class Gerente implements Serializable {

	
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
