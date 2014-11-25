package org.Classes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.Classes.Util.ComparadorOrdemAlfabeticaPaciente;
import org.Classes.Util.CopyOfComparadorOrdemAlfabeticaMedico;

public class Atendente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario;

	static public boolean Cadastrar(Medico medico) {
		
		List<Medico> listaMedicos = Arquivo.getListaMedicos();
		
		if(listaMedicos.contains(medico))
			return false;
		
		listaMedicos.add(medico);
		Collections.sort(listaMedicos,new CopyOfComparadorOrdemAlfabeticaMedico());

		return true;
	}

	static public boolean Cadastrar(Paciente paciente) {
		
		List<Paciente> listaPacientes = Arquivo.getListaPacientes();
		
		
		if(listaPacientes.contains(paciente))
			return false;
		
		listaPacientes.add(paciente);
		Collections.sort(listaPacientes,new ComparadorOrdemAlfabeticaPaciente());
		Arquivo.GravarArquivo();
		return true;
	}

	static public boolean Cadastrar(Consulta_Particular consulta)
	{
		List<Consulta_Particular> listaConsultas = Arquivo.getListaConsultasParticulares();
		for (Consulta c : listaConsultas)
		{
			if(c.getData() == consulta.getData())
				return false;
		}
		
		listaConsultas.add(consulta);
		Arquivo.GravarArquivo();

		return true;
	}

	static public List<Medico> ConsultarMedicos(Especialidade especialidade) 
	{
		List<Medico> listaMedicosResultado = new ArrayList<Medico>();
		List<Medico> listaMedicos = Arquivo.getListaMedicos();
		
		for (Medico medico : listaMedicos)
		{
			for(Especialidade e : medico.getEspecialidades())
			{
				if(e.equals(especialidade))
				{
					listaMedicosResultado.add(medico);
					break;
				}
			}
		}
		
		//Essas linhas são para remover os elementos repetidos da lista.
		HashSet<Medico> hs = new HashSet<Medico>();
		hs.addAll(listaMedicosResultado);
		listaMedicosResultado.clear();
		listaMedicosResultado.addAll(hs);
		//Fim
		
		return listaMedicosResultado;
	}

	static public List<Medico> getMedicosPorEspecialidade(Especialidade espec)
	{
		List<Medico> listaMedicoResultado = new ArrayList<Medico>();
		
		for (Medico medico : Arquivo.getListaMedicos())
		{
			if(medico.getEspecialidades().contains(espec))
				listaMedicoResultado.add(medico);
		}
		
		return listaMedicoResultado;
	}
	
	static public List<Medico> ConsultarMedicosDisponiveisNoHorario(Especialidade especialidade, Date horario) 
	{
		List<Medico> listaMedicosResultado  = getMedicosPorEspecialidade(especialidade);
		List<Consulta> listaConsultas = new ArrayList<Consulta>();
		
		for (Consulta c : Arquivo.getListaConsultasParticulares())
		{
			if(c.getData().equals(horario))
				listaConsultas.add(c);
			
		}
		
		for (Consulta c : Arquivo.getListaConsultasPlano())
		{
			if(c.getData().equals(horario))
				listaConsultas.add(c);
			
		}
		
		for (Consulta consulta : listaConsultas)
		{
			if(listaMedicosResultado.contains(consulta.getMedico()))
				listaMedicosResultado.remove(consulta.getMedico());
		}
		
		return listaMedicosResultado;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

}

