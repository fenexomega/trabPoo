package org.GUI;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.Classes.Arquivo;
import org.Classes.Atendente;
import org.Classes.Paciente;
import org.GUI.util.ErrorGUI;

import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

public class CriarPacienteGUI extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEndereo;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			CriarPacienteGUI dialog = new CriarPacienteGUI();
			dialog.setVisible(true);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CriarPacienteGUI()
	{
		setBounds(100, 100, 465, 433);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		contentPanel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.GRAY);
		lblNome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNome.setBounds(10, 132, 66, 16);
		contentPanel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(Color.GRAY);
		lblCpf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblCpf.setBounds(10, 176, 66, 16);
		contentPanel.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setForeground(Color.GRAY);
		lblEndereo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblEndereo.setBounds(10, 224, 114, 16);
		contentPanel.add(lblEndereo);
		
		txtNome = new JTextField();
		txtNome.setBounds(114, 128, 320, 29);
		contentPanel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(114, 172, 320, 29);
		contentPanel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEndereo = new JTextField();
		txtEndereo.setBounds(114, 220, 320, 29);
		contentPanel.add(txtEndereo);
		txtEndereo.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(114, 274, 320, 29);
		txtTelefone.setColumns(10);
		contentPanel.add(txtTelefone);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 449, 109);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(CriarPacienteGUI.class.getResource("/Images/adicionar-01.png")));
		label_1.setBounds(281, 43, 20, 35);
		panel.add(label_1);
		
		JLabel lblCadastroDePaciente = new JLabel("Cadastro de Paciente");
		lblCadastroDePaciente.setBounds(10, 43, 259, 29);
		panel.add(lblCadastroDePaciente);
		lblCadastroDePaciente.setForeground(Color.WHITE);
		lblCadastroDePaciente.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 23));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CriarPacienteGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(0, 0, 449, 109);
		panel.add(label);
		
		JButton button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paciente p = new Paciente();
				List<Paciente> listaPacientes = Arquivo.getListaPacientes();
				p.setCpf(txtCpf.getText());
				p.setNome(txtNome.getText());
				p.setEndereco(txtEndereo.getText());
				p.setTelefone(txtTelefone.getText());
				
				if(txtNome.getText().isEmpty() || txtEndereo.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtCpf.getText().isEmpty())
				{
					ErrorGUI.MostrarErro(getContentPane(), "Preencha todos os dados.");
					return;

				}
					
				if(!Atendente.Cadastrar(p))
				{
					ErrorGUI.MostrarErro(getContentPane(), "CPF já cadastrado.");
					return;
				}
				
				ErrorGUI.MostrarErro(getContentPane(), "Paciente cadastrado com sucesso");
				

				AtendenteGUI.GetInstance().AtualizarTabelaPacientes();
				
				dispose();
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(114, 340, 144, 43);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(287, 340, 144, 43);
		contentPanel.add(button_1);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.GRAY);
		lblTelefone.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblTelefone.setBounds(10, 278, 99, 16);
		contentPanel.add(lblTelefone);
		setTitle("Criar Paciente");
		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
	}
}
