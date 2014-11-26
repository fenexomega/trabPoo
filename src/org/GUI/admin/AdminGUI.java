package org.GUI.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.GUI.GerenteGUI;

public class AdminGUI extends JFrame
{


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
					window.setVisible(true);
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
		this.setBounds(100, 100, 628, 396);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AdminGUI.class.getResource("/Images/logo-01.png")));
		lblNewLabel_1.setBounds(150, 0, 320, 154);
		this.getContentPane().add(lblNewLabel_1);
		
		JButton btnCadastrarAtendente = new JButton("Cadastrar Atendente");
		btnCadastrarAtendente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarAtendenteGUI ca = new CadastrarAtendenteGUI();
				ca.setVisible(true);
			}
		});
		btnCadastrarAtendente.setForeground(new Color(255, 255, 255));
		btnCadastrarAtendente.setBackground(new Color(0, 128, 128));
		btnCadastrarAtendente.setBounds(362, 187, 210, 119);
		this.getContentPane().add(btnCadastrarAtendente);
		
		JButton btnCadastrarGerente = new JButton("Cadastrar Gerente");
		btnCadastrarGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarGerenteGUI gui = new CadastrarGerenteGUI();
				gui.setVisible(true);
			}
		});
		btnCadastrarGerente.setForeground(new Color(255, 255, 255));
		btnCadastrarGerente.setBackground(new Color(0, 128, 128));
		btnCadastrarGerente.setBounds(54, 185, 210, 123);
		this.getContentPane().add(btnCadastrarGerente);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AdminGUI.class.getResource("/Images/security.png")));
		lblNewLabel.setBounds(0, 0, 612, 357);
		this.getContentPane().add(lblNewLabel);
	}
}
