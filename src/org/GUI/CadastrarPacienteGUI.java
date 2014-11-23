package org.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class CadastrarPacienteGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarPacienteGUI frame = new CadastrarPacienteGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarPacienteGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(CadastrarPacienteGUI.class.getResource("/Images/adicionar-01.png")));
		label_2.setBounds(262, 44, 20, 35);
		panel.add(label_2);
		
		JLabel lblCadastroDePaciente = new JLabel("Cadastro de Paciente");
		lblCadastroDePaciente.setForeground(Color.WHITE);
		lblCadastroDePaciente.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 23));
		lblCadastroDePaciente.setBounds(25, 44, 259, 29);
		panel.add(lblCadastroDePaciente);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastrarPacienteGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(0, 0, 527, 113);
		panel.add(label);
	}
}
