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
import javax.swing.JTextField;
import java.awt.Label;

public class CriarEspecialidadeGUI extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(100, 100, 557, 397);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblEspecialidades = new JLabel("Especialidades");
		lblEspecialidades.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblEspecialidades.setForeground(new Color(255, 255, 255));
		lblEspecialidades.setBounds(21, 38, 170, 23);
		contentPanel.add(lblEspecialidades);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 541, 93);
		label.setIcon(new ImageIcon(CriarEspecialidadeGUI.class.getResource("/Images/inicial_background.png")));
		contentPanel.add(label);
		
		JButton button = new JButton("Salvar");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(231, 304, 144, 43);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(387, 304, 144, 43);
		contentPanel.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 104, 521, 191);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(172, 36, 214, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		Label label_1 = new Label("Nome: ");
		label_1.setBounds(10, 36, 62, 22);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 76, 214, 20);
		panel.add(textField_1);
		
		Label label_2 = new Label("C\u00F3digo Identificador:");
		label_2.setBounds(10, 76, 138, 22);
		panel.add(label_2);
	}
}
