package org.Classes;

import java.io.Serializable;


public class Paciente  implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private String nome;

	private String cpf;

	private String endereco;
	
	public boolean equals(Paciente p)
	{
		if(p.cpf == cpf)
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

}
