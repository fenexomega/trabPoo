package org.Classes;

import java.io.Serializable;


public class Plano_De_Saude implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String getRazaoSocial()
	{
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}

	public long getCnpj()
	{
		return cnpj;
	}

	public void setCnpj(long cnpj)
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

	public long getTelefone()
	{
		return telefone;
	}

	public void setTelefone(long telefone)
	{
		this.telefone = telefone;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	private String razaoSocial;

	private long cnpj;

	private String endereco;

	private long telefone;

}
