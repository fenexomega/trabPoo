package org.Classes;

import java.io.Serializable;


public class Consulta_Particular extends Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	private double preco;

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

}
