package org.Classes;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public abstract class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Paciente paciente;

	private Medico medico;

	private Calendar calendario;

	private String texto_qxa;

	private String text_prediscricoes;

	private String exames_solicitados;

	
	
	public Paciente getPaciente()
	{
		return paciente;
	}

	public Medico getMedico()
	{
		return medico;
	}

	public Calendar getData()
	{
		return calendario;
	}

	public String getTexto_qxa()
	{
		return texto_qxa;
	}

	public String getText_prediscricoes()
	{
		return text_prediscricoes;
	}

	public String getExames_solicitados()
	{
		return exames_solicitados;
	}

	public void setPaciente(Paciente paciente)
	{
		this.paciente = paciente;
	}

	public void setMedico(Medico medico)
	{
		this.medico = medico;
	}

	public void setData(Calendar data)
	{
		this.calendario = data;
	}

	public void setTexto_qxa(String texto_qxa)
	{
		this.texto_qxa = texto_qxa;
	}

	public void setText_prediscricoes(String text_prediscricoes)
	{
		this.text_prediscricoes = text_prediscricoes;
	}

	public void setExames_solicitados(String exames_solicitados)
	{
		this.exames_solicitados = exames_solicitados;
	}

}
