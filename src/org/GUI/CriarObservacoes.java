package org.GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import org.Classes.Arquivo;
import org.Classes.Consulta;
import org.Classes.Consulta_Particular;
import org.GUI.util.ErrorGUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriarObservacoes extends JDialog {

	private JPanel contentPane;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private Consulta consulta;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarObservacoes frame = new CriarObservacoes(new Consulta_Particular());
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
	public CriarObservacoes(Consulta c) {
		this.consulta = c;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 546, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 102));
		panel.setBounds(0, 41, 530, 485);
		contentPane.add(panel);
		
		textPane = new JTextPane();
		textPane.setBounds(10, 30, 506, 117);
		panel.add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 183, 506, 125);
		panel.add(textPane_1);
		
		textPane_2 = new JTextPane();
		textPane_2.setBounds(10, 344, 506, 117);
		panel.add(textPane_2);
		
		textPane.setText(c.getTexto_qxa());
		textPane_1.setText(c.getText_prediscricoes());
		textPane_2.setText(c.getExames_solicitados());
		
		JLabel label = new JLabel("Queixas do paciente:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		label.setBounds(10, 5, 198, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Prescri\u00E7\u00F5es de medicamentos:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		label_1.setBounds(10, 158, 233, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Exames solicitados:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		label_2.setBounds(10, 319, 151, 14);
		panel.add(label_2);
		
		JButton button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				consulta.setTexto_qxa(textPane.getText());
				consulta.setText_prediscricoes(textPane_1.getText());
				consulta.setExames_solicitados(textPane_2.getText());
				
				Arquivo.GravarArquivo();
				
				ErrorGUI.MostrarErro(getContentPane(), "Gravado com sucesso");
				
				dispose();
				
			}
		});
		button.setIcon(new ImageIcon(CriarObservacoes.class.getResource("/Images/salvar-01.png")));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(222, 544, 144, 43);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(CriarObservacoes.class.getResource("/Images/cancelar-01.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(376, 544, 144, 43);
		contentPane.add(button_1);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPaciente.setBounds(21, 16, 335, 14);
		contentPane.add(lblPaciente);
	}
}
