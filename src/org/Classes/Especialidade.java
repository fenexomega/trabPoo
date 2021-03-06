package org.Classes;

import java.io.Serializable;


public class Especialidade implements Serializable {

	public Especialidade(String nome, String codigo)
	{
		this.nome = nome;
		this.codigo = codigo;
	}

	private static final long serialVersionUID = 1L;

	private String nome;

	private String codigo;

	public String toString()
	{
		return nome;
	}
	
	public boolean equals(Object obj)
	{	
		if(!(obj instanceof Especialidade))
			return false;
		return ((Especialidade) obj).codigo.equals(codigo);
	}
	
	public String getNome()
	{
		return nome;
	}

	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCodigo()
	{
		return codigo;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}


}
