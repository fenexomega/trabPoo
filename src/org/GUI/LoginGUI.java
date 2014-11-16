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
		setBounds(100, 100, 441, 209);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(12, 54, 66, 16);
		contentPanel.add(lblLogin);
		
		txtUsername = new JTextField();
		txtUsername.setText("");
		txtUsername.setBounds(114, 52, 212, 20);
		contentPanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(12, 96, 66, 16);
		contentPanel.add(lblSenha);
		
		pwdApass = new JPasswordField();
		pwdApass.setText("");
		pwdApass.setBounds(114, 94, 212, 20);
		contentPanel.add(pwdApass);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						MainGUI gui = MainGUI.getInstance();
						dispose();
						gui.Dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

	}
}
