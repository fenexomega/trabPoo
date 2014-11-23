package org.GUI;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class LoginGUI extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsername;
	private JPasswordField pwdApass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			LoginGUI dialog = new LoginGUI();
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
	public LoginGUI()
	{
		setBounds(100, 100, 811, 538);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		
		JLabel lblLogin = new JLabel("Usu\u00E1rio: ");
		lblLogin.setFont(new Font("Constantia", Font.BOLD, 16));
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(250, 246, 84, 20);
		contentPanel.add(lblLogin);
		
		txtUsername = new JTextField();
		txtUsername.setText("");
		txtUsername.setBounds(332, 243, 212, 23);
		contentPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Constantia", Font.BOLD, 16));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(250, 290, 66, 16);
		contentPanel.add(lblSenha);
		
		pwdApass = new JPasswordField();
		pwdApass.setText("");
		pwdApass.setBounds(332, 287, 212, 23);
		contentPanel.add(pwdApass);
		{
			JButton okButton = new JButton("Entrar");
			okButton.setForeground(new Color(255, 255, 255));
			okButton.setBackground(new Color(0, 139, 139));
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			okButton.setBounds(360, 319, 84, 44);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setForeground(new Color(255, 255, 255));
			cancelButton.setBackground(new Color(0, 139, 139));
			cancelButton.setBounds(460, 319, 84, 44);
			contentPanel.add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					MainGUI gui = MainGUI.getInstance();
					dispose();
					gui.Dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
		}
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(LoginGUI.class.getResource("/Images/logo-01.png")));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Constantia", Font.BOLD, 16));
		label_1.setBounds(238, 71, 306, 137);
		contentPanel.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.LIGHT_GRAY);
		label.setIcon(new ImageIcon(LoginGUI.class.getResource("/Images/security.png")));
		label.setBounds(0, 0, 800, 500);
		contentPanel.add(label);

	}
}
