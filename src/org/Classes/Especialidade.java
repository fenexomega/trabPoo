package org.Classes;

import java.io.Serializable;


public class Especialidade implements Serializable {

	public Especialidade(String nome, long codigo)
	{
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	private static final long serialVersionUID = 1L;

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
