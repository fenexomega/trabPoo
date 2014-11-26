package org.Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Godzila que faz todo o input e output das listas..
// Isso aqui é uma coisa que não me da orgulho :P
public class Arquivo
{
	private static List<Gerente> 	  	 		listaGerente;
	private static List<Usuario> 	 	 		listaUsuarios;
	private static List<Paciente> 	  	 		listaPacientes;
	private static List<Atendente> 	 	 		listaAtendentes;
	private static List<Medico> 	  	 		listaMedicos;
	private static List<Especialidade>   		listaEspecialidades;
	private static List<Consulta_Particular> 	listaConsultasParticulares;
	private static List<Consulta_Plano> 		listaConsultasPlano;
	private static List<Plano_De_Saude>	 		listaPlanos;
	private static String DIR_FILES = "resource/";

	// Método que lê todos os arquivos e coloca nas listas.
	public static void LerArquivos()
	{
		System.out.println("Lendo Arquivos");
		File file = new File(DIR_FILES + "usuarios.ser");
		if(!file.exists())
			GravarArquivo();
		listaAtendentes 			= LerArquivoAtendentes();
		listaConsultasParticulares  = LerArquivoConsulta_Particulares();
		listaConsultasPlano 		= LerArquivoConsulta_Planos();
		listaEspecialidades 		= LerArquivoEspecialidades();
		listaGerente 				= LerArquivoGerentes();
		listaMedicos				= LerArquivoMedicos();
		listaPacientes 				= LerArquivoPacientes();
		listaUsuarios				= LerArquivoUsuarios();
		listaPlanos					= LerArquivoPlano_De_Saudes();
	}
	
	public static void GravarArquivo()
	{	
		try
		{
			System.out.println("Gravando dados");
			File folder = new File(DIR_FILES);
			if(!folder.exists())
			{
				if(!folder.mkdir())
				{
					System.out.println("Foi impossível criar a pasta. Saindo!");
					return;
				}
			}
			FileOutputStream f_out = new FileOutputStream(DIR_FILES + "gerentes.ser");
			ObjectOutputStream o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaGerente);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "usuarios.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaUsuarios);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "pacientes.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaPacientes);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "atendentes.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaAtendentes);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "medicos.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaMedicos);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "especialidades.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaEspecialidades);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "consultaparticular.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaConsultasParticulares);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "consultaplano.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaConsultasPlano);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream(DIR_FILES + "planos.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaPlanos);
			o_out.close();
			f_out.close();
			

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

	
	private static ArrayList<Atendente> LerArquivoAtendentes()
	{
		ArrayList<Atendente> lista = new ArrayList<Atendente>();

		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "atendentes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Atendente>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Consulta_Particular> LerArquivoConsulta_Particulares()
	{
		ArrayList<Consulta_Particular> 	lista = new ArrayList<Consulta_Particular>();
		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "consultaparticular.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Consulta_Particular>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Consulta_Plano> LerArquivoConsulta_Planos()
	{
		ArrayList<Consulta_Plano> lista = new ArrayList<Consulta_Plano>();

		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "consultaplano.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Consulta_Plano>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Especialidade> LerArquivoEspecialidades()
	{
		ArrayList<Especialidade> lista = new ArrayList<Especialidade>();

		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "especialidades.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Especialidade>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Gerente> LerArquivoGerentes()
	{
		ArrayList<Gerente> 	lista = new ArrayList<Gerente>();
;
		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "gerentes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Gerente>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Medico> LerArquivoMedicos()
	{
		ArrayList<Medico>	lista = new ArrayList<Medico>();

		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "medicos.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)	
				lista = (ArrayList<Medico>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Paciente> LerArquivoPacientes()
	{
		ArrayList<Paciente>	lista = new ArrayList<Paciente>();

		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "pacientes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Paciente>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Plano_De_Saude> LerArquivoPlano_De_Saudes()
	{
		ArrayList<Plano_De_Saude> lista = new ArrayList<Plano_De_Saude>();
		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "planos.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Plano_De_Saude>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}
	
	private static ArrayList<Usuario> LerArquivoUsuarios()
	{
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		try
		{
			FileInputStream f_In = new FileInputStream(DIR_FILES + "usuarios.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			Object i = o_In.readObject();
			if(i != null)
				lista = (ArrayList<Usuario>) i;
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
		}
		return lista;	
	}

	public static List<Gerente> getListaGerente()
	{
		return listaGerente;
	}

	public static List<Usuario> getListaUsuarios()
	{
		return listaUsuarios;
	}

	public static List<Paciente> getListaPacientes()
	{
		return listaPacientes;
	}

	public static List<Atendente> getListaAtendentes()
	{
		return listaAtendentes;
	}

	public static List<Medico> getListaMedicos()
	{
		return listaMedicos;
	}

	public static List<Especialidade> getListaEspecialidades()
	{
		return listaEspecialidades;
	}

	public static List<Consulta_Particular> getListaConsultasParticulares()
	{
		return listaConsultasParticulares;
	}

	public static List<Consulta_Plano> getListaConsultasPlano()
	{
		return listaConsultasPlano;
	}

	public static List<Plano_De_Saude> getListaPlanos()
	{
		return listaPlanos;
	}

	public static void setListaGerente(List<Gerente> listaGerente)
	{
		Arquivo.listaGerente = listaGerente;
	}
	
}

class ArquivoTest
{
	public static void main(String[] args)
	{
		 
		//Test Drive
		List<Gerente> listaGerente = new ArrayList<Gerente>();
		Arquivo.setListaGerente(listaGerente);
		listaGerente.add(new Gerente());
		Arquivo.GravarArquivo();
		
		Arquivo.LerArquivos();
		System.out.println(Arquivo.getListaGerente().size());
		
	}
}

