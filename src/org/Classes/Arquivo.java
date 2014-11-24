package org.Classes;

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

	// Método que lê todos os arquivos e coloca nas listas.
	public static void LerArquivos()
	{
		System.out.println("Lendo Arquivos");
		listaAtendentes 			= LerArquivoAtendentes();
		listaConsultasParticulares  = LerArquivoConsulta_Particulares();
		listaConsultasPlano 		= LerArquivoConsulta_Planos();
		listaEspecialidades 		= LerArquivoEspecialidades();
		listaGerente 				= LerArquivoGerentes();
		listaMedicos				= LerArquivoMedicos();
		listaPacientes 				= LerArquivoPacientes();
		listaUsuarios				= LerArquivoUsuarios();
	}
	
	public static void GravarArquivo()
	{	
		try
		{
			System.out.println("Gravando dados");
			FileOutputStream f_out = new FileOutputStream("gerentes.ser");
			ObjectOutputStream o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaGerente);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("usuarios.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaUsuarios);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("pacientes.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaPacientes);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("atendentes.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaAtendentes);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("medicos.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaMedicos);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("especialidades.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaEspecialidades);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("consultaparticular.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaConsultasParticulares);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("consultaplano.ser");
			o_out = new ObjectOutputStream(f_out);
			o_out.writeObject(listaConsultasParticulares);
			o_out.close();
			f_out.close();
			
			f_out = new FileOutputStream("planos.ser");
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
		ArrayList<Atendente> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("atendentes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Atendente>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Consulta_Particular> LerArquivoConsulta_Particulares()
	{
		ArrayList<Consulta_Particular> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("consultaparticular.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Consulta_Particular>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Consulta_Plano> LerArquivoConsulta_Planos()
	{
		ArrayList<Consulta_Plano> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("consultaplano.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Consulta_Plano>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Especialidade> LerArquivoEspecialidades()
	{
		ArrayList<Especialidade> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("especialidades.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Especialidade>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Gerente> LerArquivoGerentes()
	{
		ArrayList<Gerente> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("gerentes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Gerente>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Medico> LerArquivoMedicos()
	{
		ArrayList<Medico> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("medicos.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Medico>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Paciente> LerArquivoPacientes()
	{
		ArrayList<Paciente> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("pacientes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Paciente>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Plano_De_Saude> LerArquivoPlano_De_Saudes()
	{
		ArrayList<Plano_De_Saude> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("plano_De_Saudes.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Plano_De_Saude>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
		}
		return lista;	
	}
	
	private static ArrayList<Usuario> LerArquivoUsuarios()
	{
		ArrayList<Usuario> lista = null;
		try
		{
			FileInputStream f_In = new FileInputStream("usuarios.ser");
			ObjectInputStream o_In = new ObjectInputStream(f_In);
			lista = (ArrayList<Usuario>) o_In.readObject();
			o_In.close();
			f_In.close();

		} catch (IOException | ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Erro");
			e.printStackTrace();
			lista = new ArrayList<>();
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

