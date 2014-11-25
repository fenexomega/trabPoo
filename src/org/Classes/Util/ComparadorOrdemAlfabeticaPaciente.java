package org.Classes.Util;

import java.util.Comparator;

import org.Classes.Paciente;

public class ComparadorOrdemAlfabeticaPaciente implements Comparator<Paciente>
{

	@Override
	public int compare(Paciente o1, Paciente o2)
	{
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
