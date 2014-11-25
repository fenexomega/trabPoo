package org.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgendarConsultaGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendarConsultaGUI frame = new AgendarConsultaGUI();
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
	public AgendarConsultaGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 792, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/logo-01.png")));
		label_3.setBounds(431, 11, 304, 138);
		panel.add(label_3);
		
		JLabel lblAgendarConsulta = new JLabel("Agendar Consulta");
		lblAgendarConsulta.setForeground(Color.WHITE);
		lblAgendarConsulta.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 23));
		lblAgendarConsulta.setBounds(20, 75, 217, 29);
		panel.add(lblAgendarConsulta);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/adicionar-01.png")));
		label_2.setBounds(232, 75, 20, 35);
		panel.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(0, 0, 766, 176);
		panel.add(label);
		
		JLabel lblCpfDoPaciente = new JLabel("CPF do paciente:");
		lblCpfDoPaciente.setForeground(Color.GRAY);
		lblCpfDoPaciente.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		lblCpfDoPaciente.setBounds(20, 191, 148, 29);
		panel.add(lblCpfDoPaciente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 187, 746, 268);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(166, 10, 292, 22);
		panel_1.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(10, 151, 134, 22);
		panel_1.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(166, 151, 134, 22);
		panel_1.add(textField_2);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setForeground(Color.GRAY);
		lblHora.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		lblHora.setBounds(166, 119, 55, 29);
		panel_1.add(lblHora);
		
		JButton btnVerificarCpf = new JButton("Verificar CPF");
		btnVerificarCpf.setBounds(464, 9, 134, 23);
		panel_1.add(btnVerificarCpf);
		
		JLabel lblMdicos = new JLabel("M\u00E9dicos");
		lblMdicos.setBounds(10, 53, 217, 29);
		panel_1.add(lblMdicos);
		lblMdicos.setForeground(Color.GRAY);
		lblMdicos.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 81, 128, 20);
		panel_1.add(comboBox);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(10, 119, 55, 29);
		panel_1.add(lblData);
		lblData.setForeground(Color.GRAY);
		lblData.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		
		JButton button_1 = new JButton("Salvar");
		button_1.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/salvar-01.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(436, 214, 144, 43);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/cancelar-01.png")));
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(new Color(0, 128, 128));
		button_2.setBounds(592, 214, 144, 43);
		panel_1.add(button_2);
		
		JLabel lblPlanoDeSade = new JLabel("Plano de sa\u00FAde");
		lblPlanoDeSade.setForeground(Color.GRAY);
		lblPlanoDeSade.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		lblPlanoDeSade.setBounds(10, 190, 217, 29);
		panel_1.add(lblPlanoDeSade);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 218, 128, 20);
		panel_1.add(comboBox_1);
	}
}
