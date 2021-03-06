package org.Classes;

import java.io.Serializable;


public class Paciente  implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private String nome;
	private String telefone;
	
	public Paciente(String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}

	public Paciente()
	{
		
	}

	

	private String cpf;

	private String endereco;
	
	public String toString()
	{
		return nome;
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof Paciente))
			return false;
		if(((Paciente)o).getCpf().equals(cpf))
			return true;
		return false;
	}

	public String getNome()
	{
		return nome;
	}



	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}



	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getTelefone()
	{
		return telefone;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	

}

class PacienteTest
{
	public static void main(String[] args)
	{
	}
}
