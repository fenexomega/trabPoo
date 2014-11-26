package org.GUI.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.Classes.Arquivo;
import org.Classes.Gerente;
import org.Classes.Usuario;
import org.GUI.util.ErrorGUI;

public class CadastrarGerenteGUI extends JDialog {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarGerenteGUI frame = new CadastrarGerenteGUI();
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
	public CadastrarGerenteGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(CadastrarGerenteGUI.class.getResource("/Images/cancelar-01.png")));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(215, 193, 144, 43);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Salvar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || passwordField.getText().isEmpty())
				{
					ErrorGUI.MostrarErro(getContentPane(), "Formulário Incompleto");
					return ;
				}
				
				Usuario u = new Usuario(textField.getText(), passwordField.getText());
				
				Arquivo.LerArquivos();

				
				if(Arquivo.getListaUsuarios().contains(u))
				{
					ErrorGUI.MostrarErro(getContentPane(), "Usuário Já registrado");
					return;

				}
				
				
				Gerente g = new Gerente();
				g.setUsuario(u);
				Arquivo.getListaUsuarios().add(u);
				Arquivo.getListaGerente().add(g);
				
				Arquivo.GravarArquivo();
				
				ErrorGUI.MostrarErro(getContentPane(), "Usuário Cadastrado com Sucesso");
				
				dispose();
				
				return;

				
				
			}
		});
		button_1.setIcon(new ImageIcon(CadastrarGerenteGUI.class.getResource("/Images/salvar-01.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(59, 193, 144, 43);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("Senha");
		label.setForeground(Color.WHITE);
		label.setBounds(110, 124, 66, 16);
		contentPane.add(label);
		
		passwordField = new JPasswordField();
		passwordField.setText("");
		passwordField.setBounds(196, 122, 114, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		textField.setBounds(196, 74, 114, 20);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Nome");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(110, 76, 66, 16);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(CadastrarGerenteGUI.class.getResource("/Images/security.png")));
		label_1.setBounds(0, 0, 434, 261);
		contentPane.add(label_1);
	}

}
