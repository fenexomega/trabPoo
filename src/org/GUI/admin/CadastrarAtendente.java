package org.GUI.admin;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.Classes.Arquivo;
import org.Classes.Atendente;
import org.Classes.Usuario;
import org.Processos.Logador;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class CadastrarAtendente extends JDialog
{
	private JTextField txtNome;
	private JPasswordField pwdPassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			CadastrarAtendente dialog = new CadastrarAtendente();
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
	public CadastrarAtendente()
	{
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(110, 76, 66, 16);
		getContentPane().add(lblNome);
		
		JButton button = new JButton("Salvar");
		button.setIcon(new ImageIcon(CadastrarAtendente.class.getResource("/Images/salvar-01.png")));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(59, 193, 144, 43);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setIcon(new ImageIcon(CadastrarAtendente.class.getResource("/Images/cancelar-01.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(215, 193, 144, 43);
		getContentPane().add(button_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(196, 74, 114, 20);
		txtNome.setText("");
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setBounds(110, 124, 66, 16);
		getContentPane().add(lblSenha);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(196, 122, 114, 20);
		pwdPassword.setText("");
		getContentPane().add(pwdPassword);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CadastrarAtendente.class.getResource("/Images/security.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		getContentPane().add(lblNewLabel);
	}
}
