package org.Classes;


import java.io.Serializable;
import java.util.Date;

public abstract class Consulta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Paciente paciente;

	private Medico medico;

	private Date data;

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

	public Date getData()
	{
		return data;
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

	public void setData(Date data)
	{
		this.data = data;
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
