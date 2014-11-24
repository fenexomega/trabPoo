package org.Processos;

import java.util.List;

import org.Classes.Arquivo;
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
		if(listaUsuarios.get(numUser).getPassword() != u.getPassword())
			return STATUS.SENHA_INCORRETA;
		
		return STATUS.VALIDO;
	}
}
