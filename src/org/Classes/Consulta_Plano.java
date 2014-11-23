package org.Classes;

import java.io.Serializable;


public class Consulta_Plano extends Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Plano_De_Saude plano;

	public Plano_De_Saude getPlano()
	{
		return plano;
	}

	public void setPlano(Plano_De_Saude plano)
	{
		this.plano = plano;
	}

}
