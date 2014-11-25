package org.GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriarEspecialidadeGUI extends JDialog
{

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			CriarEspecialidadeGUI dialog = new CriarEspecialidadeGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CriarEspecialidadeGUI()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 557, 397);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cardiologia");
		rdbtnNewRadioButton.setBounds(21, 146, 109, 23);
		contentPanel.add(rdbtnNewRadioButton);
		
		JLabel lblEspecialidades = new JLabel("Especialidades");
		lblEspecialidades.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblEspecialidades.setForeground(new Color(255, 255, 255));
		lblEspecialidades.setBounds(21, 38, 170, 23);
		contentPanel.add(lblEspecialidades);
		
		JRadioButton rdbtnCirurgiaVascular = new JRadioButton("Cirurgia Vascular");
		rdbtnCirurgiaVascular.setBounds(21, 185, 109, 23);
		contentPanel.add(rdbtnCirurgiaVascular);
		
		JRadioButton rdbtnEndoscopia = new JRadioButton("Endoscopia");
		rdbtnEndoscopia.setBounds(21, 229, 109, 23);
		contentPanel.add(rdbtnEndoscopia);
		
		JRadioButton rdbtnGenticaMdic = new JRadioButton("Gen\u00E9tica m\u00E9dica");
		rdbtnGenticaMdic.setBounds(150, 146, 135, 23);
		contentPanel.add(rdbtnGenticaMdic);
		
		JRadioButton rdbtnMedicinaDoTrabalho = new JRadioButton("Medicina do Trabalho");
		rdbtnMedicinaDoTrabalho.setBounds(150, 185, 170, 23);
		contentPanel.add(rdbtnMedicinaDoTrabalho);
		
		JRadioButton rdbtnOrtopedia = new JRadioButton("Ortopedia");
		rdbtnOrtopedia.setBounds(150, 229, 109, 23);
		contentPanel.add(rdbtnOrtopedia);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 541, 93);
		label.setIcon(new ImageIcon(CriarEspecialidadeGUI.class.getResource("/Images/inicial_background.png")));
		contentPanel.add(label);
		
		JButton button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(231, 304, 144, 43);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(387, 304, 144, 43);
		contentPanel.add(button_1);
	}
}
