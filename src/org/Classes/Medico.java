package org.Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private Especialidade especialidades;

	private String CRM;

	private String endereco;

	private List<Plano_De_Saude> planos_de_saude;

	private Usuario usuario;
	
	private boolean[] DiaDaSemana;
	
	private String telefone;

	public String toString()
	{
		return nome;
	}

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

	

	public void setCRM(String CRM){
		this.CRM = CRM;
	}
	public String getCRM()
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

	public boolean[] getDiaDaSemana()
	{
		return DiaDaSemana;
	}

	public void setDiaDaSemana(boolean[] diaDaSemana)
	{
		DiaDaSemana = diaDaSemana;
	}

	public String getTelefone()
	{
		return telefone;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public Medico(String nome, String cRM, String endereco, Usuario usuario,
			String telefone)
	{
		super();
		this.nome = nome;
		CRM = cRM;
		this.endereco = endereco;
		this.usuario = usuario;
		this.telefone = telefone;
	}

	public Especialidade getEspecialidades()
	{
		return especialidades;
	}

	public void setEspecialidades(Especialidade especialidades)
	{
		this.especialidades = especialidades;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
	

}
