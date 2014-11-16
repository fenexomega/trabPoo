package org.Classes;

public class Usuario 
{
	private String login;
	private String password;
	
	@SuppressWarnings("unused")
	private Usuario()
	{
		
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
