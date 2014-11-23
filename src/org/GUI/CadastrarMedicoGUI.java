package org.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class CadastrarMedicoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarMedicoGUI frame = new CadastrarMedicoGUI();
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
	public CadastrarMedicoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 240, 172, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("E-mail: ");
		lblNome.setBounds(19, 165, 71, 14);
		panel.add(lblNome);
		lblNome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNome.setForeground(new Color(102, 102, 102));
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 200, 349, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(19, 205, 85, 14);
		panel.add(lblEndereo);
		lblEndereo.setForeground(new Color(102, 102, 102));
		lblEndereo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(19, 245, 119, 14);
		panel.add(lblComplemento);
		lblComplemento.setForeground(new Color(102, 102, 102));
		lblComplemento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 160, 349, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 115, 349, 29);
		panel.add(textField_3);
		
		JLabel label_1 = new JLabel("Nome: ");
		label_1.setForeground(new Color(102, 102, 102));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		label_1.setBounds(19, 120, 71, 14);
		panel.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 280, 172, 29);
		panel.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/adicionar-01.png")));
		lblNewLabel.setBounds(256, 48, 20, 35);
		panel.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setForeground(new Color(102, 102, 102));
		lblTelefone.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblTelefone.setBounds(19, 285, 119, 14);
		panel.add(lblTelefone);
		
		JLabel lblCadastroDeMdicos = new JLabel("Cadastro de M\u00E9dicos");
		lblCadastroDeMdicos.setForeground(new Color(255, 255, 255));
		lblCadastroDeMdicos.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 23));
		lblCadastroDeMdicos.setBounds(19, 48, 259, 29);
		panel.add(lblCadastroDeMdicos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 320, 507, 187);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDiasDeAtendimento = new JLabel("Dias de atendimento:");
		lblDiasDeAtendimento.setForeground(new Color(102, 102, 102));
		lblDiasDeAtendimento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDiasDeAtendimento.setBounds(10, 11, 202, 14);
		panel_1.add(lblDiasDeAtendimento);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Segunda");
		chckbxNewCheckBox.setBounds(10, 36, 79, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTera = new JCheckBox("Ter\u00E7a");
		chckbxTera.setBounds(102, 36, 65, 23);
		panel_1.add(chckbxTera);
		
		JCheckBox chckbxQuarta = new JCheckBox("Quarta");
		chckbxQuarta.setBounds(179, 36, 81, 23);
		panel_1.add(chckbxQuarta);
		
		JCheckBox chckbxQuinta = new JCheckBox("Quinta");
		chckbxQuinta.setBounds(10, 62, 79, 23);
		panel_1.add(chckbxQuinta);
		
		JCheckBox chckbxSexta = new JCheckBox("Sexta");
		chckbxSexta.setBounds(102, 62, 65, 23);
		panel_1.add(chckbxSexta);
		
		JCheckBox chckbxSbado = new JCheckBox("S\u00E1bado");
		chckbxSbado.setBounds(179, 62, 81, 23);
		panel_1.add(chckbxSbado);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(0, 128, 128));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/cancelar-01.png")));
		btnCancelar.setBounds(353, 518, 144, 43);
		panel.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(0, 128, 128));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/salvar-01.png")));
		btnSalvar.setBounds(197, 518, 144, 43);
		panel.add(btnSalvar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(10, 11, 487, 93);
		panel.add(label);
	}
}
