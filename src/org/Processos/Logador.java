package org.Processos;

import java.util.List;

import org.Classes.Arquivo;
import org.Classes.Atendente;
import org.Classes.Gerente;
import org.Classes.Medico;
import org.Classes.Paciente;
import org.Classes.Usuario;

public abstract class Logador
{
	public static enum STATUS {
		VALIDO,NAO_VALIDO,SENHA_INCORRETA
	}
	public static STATUS UsuarioValido(Usuario u)
	{
		Arquivo.LerArquivos();
		List<Usuario> listaUsuarios = Arquivo.getListaUsuarios();
		
		if(!listaUsuarios.contains(u))
			return STATUS.NAO_VALIDO;
		
		int numUser = listaUsuarios.indexOf(u);
		if(listaUsuarios.get(numUser).getPassword().equals(u.getPassword()) == false)
			return STATUS.SENHA_INCORRETA;
		
		return STATUS.VALIDO;
	}
	
	public static Object PegarDonoDoUsuario(Usuario u)
	{
		Object object = null;
		for (Gerente g : Arquivo.getListaGerente())
		{
			if(g.getUsuario().equals(u))
				object = (Object) g;
		}
		
		if(object == null)
		{
			for (Medico g : Arquivo.getListaMedicos())
			{
				if(g.getUsuario().equals(u))
					object = (Object) g;
			}
		}
		
		if(object == null)
		{
			for (Atendente g : Arquivo.getListaAtendentes())
			{
				if(g.getUsuario().equals(u))
					object = (Object) g;
			}
		}
		
		
		return object;
	}
}
