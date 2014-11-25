package org.GUI.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

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
		frame.setBounds(100, 100, 628, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AdminGUI.class.getResource("/Images/logo-01.png")));
		lblNewLabel_1.setBounds(150, 0, 320, 154);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnCadastrarAtendente = new JButton("Cadastrar Atendente");
		btnCadastrarAtendente.setForeground(new Color(255, 255, 255));
		btnCadastrarAtendente.setBackground(new Color(0, 128, 128));
		btnCadastrarAtendente.setBounds(362, 187, 210, 119);
		frame.getContentPane().add(btnCadastrarAtendente);
		
		JButton btnCadastrarGerente = new JButton("Cadastrar Gerente");
		btnCadastrarGerente.setForeground(new Color(255, 255, 255));
		btnCadastrarGerente.setBackground(new Color(0, 128, 128));
		btnCadastrarGerente.setBounds(54, 185, 210, 123);
		frame.getContentPane().add(btnCadastrarGerente);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AdminGUI.class.getResource("/Images/security.png")));
		lblNewLabel.setBounds(0, 0, 612, 357);
		frame.getContentPane().add(lblNewLabel);
	}
}
