package org.Classes.Util;

import java.util.Comparator;

import org.Classes.Medico;

public class CopyOfComparadorOrdemAlfabeticaMedico implements Comparator<Medico>
{

	@Override
	public int compare(Medico o1, Medico o2)
	{
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
