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
	
	public boolean equals(Object o)
	{
		if(o instanceof Consulta_Plano)
			return false;
		if(getMedico().equals( ((Consulta_Plano) o).getMedico() ) && getData().equals( ((Consulta_Plano) o).getData() ) )
			return true;
		return false;
	}

}
