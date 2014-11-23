package org.GUI;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.Classes.Arquivo;
import org.Classes.Paciente;

public class CriarPacienteGUI extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEndereo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			CriarPacienteGUI dialog = new CriarPacienteGUI();
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
	public CriarPacienteGUI()
	{
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(24, 30, 66, 16);
		contentPanel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(24, 74, 66, 16);
		contentPanel.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(24, 122, 66, 16);
		contentPanel.add(lblEndereo);
		
		txtNome = new JTextField();
		txtNome.setBounds(108, 28, 320, 20);
		contentPanel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(108, 72, 320, 20);
		contentPanel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEndereo = new JTextField();
		txtEndereo.setBounds(108, 120, 320, 20);
		contentPanel.add(txtEndereo);
		txtEndereo.setColumns(10);
		setTitle("Criar Paciente");
		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Paciente p = new Paciente();
						p.setNome(txtNome.getText());
						p.setCpf(txtCpf.getText());
						p.setEndereco(txtEndereo.getText());
						
						Arquivo.LerArquivos();
						List<Paciente> pacientes = Arquivo.getListaPacientes();
						
						if(pacientes.contains(p))
							//TODO Error!
							;
						else
						{
							//Foi adicionado o Paciente
							
							Arquivo.getListaPacientes().add(p);
							Arquivo.GravarArquivo();
							dispose();

						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
