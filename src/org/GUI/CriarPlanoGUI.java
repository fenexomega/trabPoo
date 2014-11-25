package org.GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.Classes.Atendente;
import org.Classes.Plano_De_Saude;
import org.GUI.util.ErrorGUI;

public class CriarPlanoGUI extends JDialog {

	private JPanel contentPane;
	private JTextField txtRazao;
	private JTextField txtCNPJ;
	private JTextField txtEndereo;
	private JTextField txtTelefone;
	private JButton button;
	private JButton button_1;
	private JLabel label;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarPlanoGUI frame = new CriarPlanoGUI();
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
	public CriarPlanoGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 474, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setBounds(43, 95, 76, 14);
		contentPane.add(lblRazoSocial);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(43, 123, 64, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(43, 151, 76, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(43, 179, 76, 14);
		contentPane.add(lblTelefone);
		
		lblNewLabel = new JLabel("Planos de Sa\u00FAde");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 25, 259, 27);
		contentPane.add(lblNewLabel);
		
		txtRazao = new JTextField();
		txtRazao.setBounds(117, 92, 284, 20);
		contentPane.add(txtRazao);
		txtRazao.setColumns(10);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setColumns(10);
		txtCNPJ.setBounds(117, 120, 284, 20);
		contentPane.add(txtCNPJ);
		
		txtEndereo = new JTextField();
		txtEndereo.setColumns(10);
		txtEndereo.setBounds(117, 148, 284, 20);
		contentPane.add(txtEndereo);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(117, 176, 284, 20);
		contentPane.add(txtTelefone);
		
		button = new JButton("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Plano_De_Saude p = new Plano_De_Saude();
				p.setCnpj(txtCNPJ.getText());
				p.setEndereco(txtEndereo.getText());
				p.setRazaoSocial(txtRazao.getText());
				p.setTelefone(txtTelefone.getText());
				
				if(txtCNPJ.getText().isEmpty() || txtEndereo.getText().isEmpty() || txtRazao.getText().isEmpty() || txtTelefone.getText().isEmpty() )
				{
					ErrorGUI.MostrarErro(getContentPane(), "Preencha todo o formulário.");
					return;
				}
				
				if(!Atendente.Cadastrar(p))
				{
					ErrorGUI.MostrarErro(getContentPane(), "CNPJ já cadastrado!");
					return;
				}
				
				ErrorGUI.MostrarErro(getContentPane(), "Plano cadastrado com sucesso.");
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 128, 128));
		button.setBounds(148, 232, 144, 43);
		contentPane.add(button);
		
		button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(304, 232, 144, 43);
		contentPane.add(button_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(CriarPlanoGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(0, 0, 458, 75);
		contentPane.add(label);
	}
}
