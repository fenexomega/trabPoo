package org.Classes;

import java.io.Serializable;


public class Especialidade implements Serializable {

	private String nome;

	private long codigo;

	public boolean equals(Object obj)
	{	
		if(!(obj instanceof Especialidade))
			return false;
		return ((Especialidade) obj).codigo == codigo;
	}
	
	public String getNome()
	{
		return nome;
	}

	public long getCodigo()
	{
		return codigo;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setCodigo(long codigo)
	{
		this.codigo = codigo;
	}

}
