package org.Classes;

import java.io.Serializable;


public class Consulta_Plano extends Consulta implements Serializable {

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
