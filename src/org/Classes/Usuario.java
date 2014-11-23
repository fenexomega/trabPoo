package org.Classes;

import java.io.Serializable;

public class Usuario implements Serializable
{
	private String login;
	private String password;
	
	private static final long serialVersionUID = 1L;

	
	@SuppressWarnings("unused")
	private Usuario()
	{
		
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Usuario))
			return false;
		if(((Usuario) obj).login == login)
			return true;
		
		return false;
	}
	
	public Usuario(String login, String password)
	{
		super();
		this.login = login;
		this.password = password;
	}
	
	public String getLogin()
	{
		return login;
	}
	public void setLogin(String login)
	{
		this.login = login;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
