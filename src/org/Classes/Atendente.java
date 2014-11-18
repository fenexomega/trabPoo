package org.Classes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Atendente implements Serializable {

	private Usuario usuario;

	public boolean Cadastrar(Medico medico) {
		
		List<Medico> listaMedicos = Arquivo.getListaMedicos();

		if(listaMedicos.contains(medico))
			return false;
		
		listaMedicos.add(medico);
		return true;
	}

	public boolean Cadastrar(Paciente paciente) {
		
		List<Paciente> listaPacientes = Arquivo.getListaPacientes();
		for (Paciente m : listaPacientes)
		{
			if(paciente.equals(m))
				return false;
		}
		
		listaPacientes.add(paciente);
		return true;
	}

	public boolean Cadastrar(Consulta_Particular consulta)
	{
		List<Consulta_Particular> listaConsultas = Arquivo.getListaConsultasParticulares();
		for (Consulta c : listaConsultas)
		{
			if(c.getData() == consulta.getData())
				return false;
		}
		
		listaConsultas.add(consulta);
		return true;
	}

	public List<Medico> ConsultarMedicos(Especialidade especialidade) 
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

	public List<Medico> getMedicosPorEspecialidade(Especialidade espec)
	{
		List<Medico> listaMedicoResultado = new ArrayList<Medico>();
		
		for (Medico medico : Arquivo.getListaMedicos())
		{
			if(medico.getEspecialidades().contains(espec))
				listaMedicoResultado.add(medico);
		}
		
		return listaMedicoResultado;
	}
	
	public void ConsultarMedicos(Especialidade especialidade, Date horario) 
	{
		List<Medico> listaMedicosResultado  = new ArrayList<Medico>();
		List<Consulta> listaConsultas 		= new ArrayList<Consulta>();
		for (Consulta c : Arquivo.getListaConsultasParticulares())
		{
			
		}
	}

}

class AtendenteTest
{
	public static void main(String[] args)
	{
		
	}
}