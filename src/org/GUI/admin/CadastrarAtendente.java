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
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 239, 448, 36);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String password = new String(pwdPassword.getPassword());
						Usuario u = new Usuario(txtNome.getText(),password);
						
						if(Logador.UsuarioValido(u) != Logador.STATUS.NAO_VALIDO)
						{
							JOptionPane.showMessageDialog(getContentPane(), "Login já registrado");
							return;
						}
						
						Atendente a = new Atendente();
						a.setUsuario(u);
						Arquivo.getListaAtendentes().add(a);
						Arquivo.getListaUsuarios().add(u);
						Arquivo.GravarArquivo();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 32, 66, 16);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setText("");
		txtNome.setBounds(98, 30, 114, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(12, 80, 66, 16);
		getContentPane().add(lblSenha);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("");
		pwdPassword.setBounds(98, 78, 114, 20);
		getContentPane().add(pwdPassword);
	}
}
