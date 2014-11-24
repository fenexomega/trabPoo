package org.Classes;

import java.io.Serializable;


public class Paciente  implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private String nome;

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
	
	public boolean equals(Paciente p)
	{
		if(p.getCpf().equals(cpf))
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

class PacienteTest
{
	public static void main(String[] args)
	{
		Paciente p1 = new Paciente("Jordy", "123123");
		Paciente p2 = new Paciente("Daniel", "123123");
		Paciente p3 = new Paciente("Zodd","333333");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
