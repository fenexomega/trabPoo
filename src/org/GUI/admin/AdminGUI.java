package org.GUI.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class AdminGUI
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					AdminGUI window = new AdminGUI();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminGUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrarAtendente = new JButton("Cadastrar Atendente");
		btnCadastrarAtendente.setBounds(12, 22, 210, 26);
		frame.getContentPane().add(btnCadastrarAtendente);
		
		JButton btnCadastrarGerente = new JButton("Cadastrar Gerente");
		btnCadastrarGerente.setBounds(12, 60, 210, 26);
		frame.getContentPane().add(btnCadastrarGerente);
	}
}
