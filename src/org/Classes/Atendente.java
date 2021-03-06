package org.Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.Classes.Util.ComparadorOrdemAlfabeticaMedico;
import org.Classes.Util.ComparadorOrdemAlfabeticaPaciente;

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
		Arquivo.getListaUsuarios().add(medico.getUsuario());
		Collections.sort(listaMedicos,new ComparadorOrdemAlfabeticaMedico());
		Arquivo.GravarArquivo();


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
		
		if(listaConsultas.contains(consulta))
			return false;
		
		listaConsultas.add(consulta);
		Arquivo.GravarArquivo();

		return true;
	}
	
	static public boolean Cadastrar(Plano_De_Saude p)
	{
		Arquivo.LerArquivos();
		List<Plano_De_Saude> listaPlanos = Arquivo.getListaPlanos();
				
		if(listaPlanos.contains(p))
			return false;
		
		listaPlanos.add(p);
		Arquivo.GravarArquivo();
		
		return true;
	}
	
	static public boolean Cadastrar(Consulta_Plano consulta)
	{
		List<Consulta_Plano> listaConsultas = Arquivo.getListaConsultasPlano();
		
		if(listaConsultas.contains(consulta))
			return false;
		
		listaConsultas.add(consulta);
		Arquivo.GravarArquivo();

		return true;
	}
	
	static public boolean Cadastrar(Especialidade esp)
	{
		List<Especialidade> listaEspecialidades = Arquivo.getListaEspecialidades();
		
		if(listaEspecialidades.contains(esp))
			return false;
		
		listaEspecialidades.add(esp);
		Arquivo.GravarArquivo();

		return true;
	}
	
	static public Medico getMedicoPorString(String nome)
	{
		List<Medico> listaMedicos = Arquivo.getListaMedicos();
		
		for (Medico medico : listaMedicos)
		{
			if(medico.getNome().equals(nome))
				return medico;
		}
		
		return null;

	}
	
	static public Paciente getPacientePorCpf(String string)
	{
		List<Paciente> listPaciente = Arquivo.getListaPacientes();
		for (Paciente paciente : listPaciente)
		{
			if(paciente.getCpf().equals(string))
				return paciente;
		}
		
		return null;
	}
	
	static public Especialidade getEspecialidadePorString(String nome)
	{
		List<Especialidade> list = Arquivo.getListaEspecialidades();
		
		for (Especialidade especialidade : list)
		{
			if(especialidade.getNome().equals(nome))
				return especialidade;
		}
		
		return null;
	}

	static public List<Medico> ConsultarMedicos(Especialidade especialidade) 
	{
		List<Medico> listaMedicosResultado = new ArrayList<Medico>();
		List<Medico> listaMedicos = Arquivo.getListaMedicos();
		
		for (Medico medico : listaMedicos)
		{
			if(medico.getEspecialidades().equals(especialidade))
			{
				listaMedicosResultado.add(medico);
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
			if(medico.getEspecialidades().equals(espec))
				listaMedicoResultado.add(medico);
		}
		
		return listaMedicoResultado;
	}
	
	static public List<Consulta> getConsultasPorPaciente(Paciente p)
	{
		Arquivo.LerArquivos();
		List<Consulta> listResult = new ArrayList<Consulta>();
		
		for (Consulta consulta : Arquivo.getListaConsultasParticulares())
		{
			if(consulta.getPaciente().equals(p))
			{
				listResult.add(consulta);
				
			}
		}
		
		for (Consulta consulta : Arquivo.getListaConsultasPlano())
		{
			if(consulta.getPaciente().equals(p))
			{
				listResult.add(consulta);
				
			}
		}
		
		return listResult;
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
	
	public static List<Consulta> getConsultasPorDia(Calendar c)
	{
		List<Consulta> listConsultaResultado = new ArrayList<Consulta>();
		System.out.println(c.get(Calendar.DAY_OF_YEAR));

		for (Consulta consulta : Arquivo.getListaConsultasParticulares())
		{
			if(consulta.getData().get(Calendar.YEAR) == c.get(Calendar.YEAR) )
				if(consulta.getData().get(Calendar.DAY_OF_YEAR) == c.get(Calendar.DAY_OF_YEAR) )
					listConsultaResultado.add(consulta);
				
		}
		
		for (Consulta consulta : Arquivo.getListaConsultasPlano())
		{
			System.out.println(consulta.getData().get(Calendar.DAY_OF_YEAR) );
			if(consulta.getData().get(Calendar.YEAR) == c.get(Calendar.YEAR) )
				if(consulta.getData().get(Calendar.DAY_OF_YEAR) == c.get(Calendar.DAY_OF_YEAR) )
					listConsultaResultado.add(consulta);
				
		}
		
		return listConsultaResultado;
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

