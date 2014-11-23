package org.Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;

	
	public Medico(int nome, List<Especialidade> especialidades, int cRM,
			String endereco, List<Plano_De_Saude> planos_de_saude,
			Usuario usuario)
	{
		super();
		this.nome = nome;
		Especialidades = especialidades;
		CRM = cRM;
		this.endereco = endereco;
		this.planos_de_saude = planos_de_saude;
		this.usuario = usuario;
	}

	private int nome;

	private List<Especialidade> Especialidades;

	private int CRM;

	private String endereco;

	private List<Plano_De_Saude> planos_de_saude;

	private Usuario usuario;

	public List<Consulta> ProcurarConsultas(Paciente paciente) 
	{
		List<Consulta> listaConsultaResultados = new ArrayList<Consulta>();
		
		for ( Consulta c : Arquivo.getListaConsultasParticulares() )
		{
			if(c.getPaciente().equals(paciente))
				listaConsultaResultados.add(c);
		}

		for ( Consulta c : Arquivo.getListaConsultasPlano() )
		{
			if(c.getPaciente().equals(paciente))
				listaConsultaResultados.add(c);
		}
		return listaConsultaResultados;
	}

	public void VerConsulta(Consulta consulta) 
	{
		
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Medico))
			return false;
		
		if(this.CRM == ((Medico) obj).getCRM())
			return true;
		
		return false;
	}

	public int getNome()
	{
		return nome;
	}

	public List<Especialidade> getEspecialidades()
	{
		return Especialidades;
	}

	public int getCRM()
	{
		return CRM;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public List<Plano_De_Saude> getPlanos_de_saude()
	{
		return planos_de_saude;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}
}
