package org.Classes;

import java.io.Serializable;


public class Consulta_Particular extends Consulta implements Serializable {

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
