package org.Classes;

import java.io.Serializable;


public class Plano_De_Saude implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public boolean equals(Object o)
	{
		if(!(o instanceof Plano_De_Saude))
			return false;
		if(cnpj.equals(((Plano_De_Saude) o).getCnpj()))
			return true;
		
		return false;
	}
	
	

	private String razaoSocial;

	private String cnpj;

	private String endereco;

	private String telefone;
	
	public String toString()
	{
		return razaoSocial;
	}

	public String getRazaoSocial()
	{
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj()
	{
		return cnpj;
	}

	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}

	public String getEndereco()
	{
		return endereco;
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
