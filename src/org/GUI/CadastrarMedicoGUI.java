package org.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import org.Classes.Arquivo;
import org.Classes.Atendente;
import org.Classes.Especialidade;
import org.Classes.Medico;
import org.Classes.Paciente;
import org.Classes.Plano_De_Saude;
import org.Classes.Usuario;
import org.GUI.util.ErrorGUI;

import javax.swing.JComboBox;


public class CadastrarMedicoGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEndereco;
	private JTextField txtTelefone;

	private JTextField txtNome;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JTextField txtCRM;
	private JComboBox<String> cmbPlanos;
	private JComboBox<String> cmbEspecialidade;
	private JTextField[] textfields;
	private JCheckBox[] chckbxBoxes;

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
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 533, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		chckbxBoxes = new JCheckBox[6];
		
		textfields = new JTextField[5];
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(19, 171, 85, 14);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblUsername.setForeground(new Color(102, 102, 102));
		
		txtEndereco = new JTextField();
		
		
		txtEndereco.setBounds(148, 294, 349, 29);
		panel.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Senha:");
		lblEndereo.setBounds(19, 215, 85, 14);
		panel.add(lblEndereo);
		lblEndereo.setForeground(new Color(102, 102, 102));
		lblEndereo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JLabel lblComplemento = new JLabel("Telefone:");
		lblComplemento.setBounds(19, 260, 119, 14);
		panel.add(lblComplemento);
		lblComplemento.setForeground(new Color(102, 102, 102));
		lblComplemento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(148, 254, 349, 29);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(148, 115, 349, 29);

		panel.add(txtNome);
		
		JLabel label_1 = new JLabel("Nome: ");
		label_1.setForeground(new Color(102, 102, 102));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		label_1.setBounds(19, 120, 71, 14);
		panel.add(label_1);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(148, 166, 349, 29);
		panel.add(txtUsername);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/adicionar-01.png")));
		lblNewLabel.setBounds(256, 48, 20, 35);
		panel.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Endere\u00E7o:");
		lblTelefone.setForeground(new Color(102, 102, 102));
		lblTelefone.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblTelefone.setBounds(19, 299, 119, 14);
		panel.add(lblTelefone);
		
		JLabel lblCadastroDeMdicos = new JLabel("Cadastro de M\u00E9dicos");
		lblCadastroDeMdicos.setForeground(new Color(255, 255, 255));
		lblCadastroDeMdicos.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 23));
		lblCadastroDeMdicos.setBounds(19, 48, 259, 29);
		panel.add(lblCadastroDeMdicos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 414, 487, 93);
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
		
		chckbxBoxes[0] = chckbxNewCheckBox;
		chckbxBoxes[1] = chckbxTera;
		chckbxBoxes[2] = chckbxQuarta;
		chckbxBoxes[3] = chckbxQuinta;
		chckbxBoxes[4] = chckbxSexta;
		chckbxBoxes[5] = chckbxSbado;
				
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBackground(new Color(0, 128, 128));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/cancelar-01.png")));
		btnCancelar.setBounds(353, 518, 144, 43);
		panel.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Medico m =  new Medico(null, null, null, null, null);

				for(int i = 0; i < textfields.length;i++)
				{
					if(textfields[i].getText().isEmpty() || pwdPassword.getText().isEmpty())
					{
						ErrorGUI.MostrarErro(getContentPane(), "Preencha todo o formulário!");
						return;
					}
				}
				
				boolean aux = false;
				for (int j = 0; j < chckbxBoxes.length; j++)
				{
					if(chckbxBoxes[j].isSelected())
						aux = true;
				}
				
				if(!aux)
				{
					ErrorGUI.MostrarErro(getContentPane(), "Selecione pelo menos um dia");
					return;
				}
				
				boolean[] DiasDaSemana = new boolean[7];
				DiasDaSemana[0] = false;
				for (int i = 1; i < chckbxBoxes.length; i++)
				{
					DiasDaSemana[i] = chckbxBoxes[i].isSelected();
				}
				
				Usuario u = new Usuario(txtUsername.getText(), pwdPassword.getText());
				
				m.setNome(txtNome.getText());
				m.setUsuario(u);
				m.setCRM(txtCRM.getText());
				m.setTelefone(txtTelefone.getText());
				m.setEspecialidades(Atendente.getEspecialidadePorString(cmbEspecialidade.getSelectedItem().toString()));
				m.setDiaDaSemana(DiasDaSemana);
				
				
				if(!Atendente.Cadastrar(m))
				{
					JOptionPane.showMessageDialog(getContentPane(), "CRM já cadastrado.");
					return;
				}
				
				JOptionPane.showMessageDialog(getContentPane(), "Médico cadastrado com sucesso");
				

				AtendenteGUI.GetInstance().AtualizarTabelaMedicos();
				
				dispose();
				
			}
		});
		btnSalvar.setBackground(new Color(0, 128, 128));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/salvar-01.png")));
		btnSalvar.setBounds(197, 518, 144, 43);
		panel.add(btnSalvar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastrarMedicoGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(10, 11, 487, 93);
		panel.add(label);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(148, 210, 349, 29);
		panel.add(pwdPassword);
		
		JLabel lblCrm = new JLabel("CRM:");
		lblCrm.setForeground(new Color(102, 102, 102));
		lblCrm.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCrm.setBounds(19, 341, 119, 14);
		panel.add(lblCrm);
		
		txtCRM = new JTextField();
		txtCRM.setColumns(10);
		txtCRM.setBounds(148, 336, 349, 29);
		panel.add(txtCRM);
		
		JLabel lblEspecialidade = new JLabel("Especialidades:");
		lblEspecialidade.setForeground(new Color(102, 102, 102));
		lblEspecialidade.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEspecialidade.setBounds(19, 385, 119, 14);
		panel.add(lblEspecialidade);
		
		JLabel lblPlanosDeSade = new JLabel("Planos de Sa\u00FAde");
		lblPlanosDeSade.setForeground(new Color(102, 102, 102));
		lblPlanosDeSade.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlanosDeSade.setBounds(256, 385, 119, 14);
		panel.add(lblPlanosDeSade);
		

		cmbPlanos = new JComboBox<String>();
		cmbPlanos.setBounds(373, 383, 112, 20);
		panel.add(cmbPlanos);
		
		for (Plano_De_Saude plano : Arquivo.getListaPlanos())
		{
			cmbPlanos.addItem(plano.getRazaoSocial());

		}
		
		cmbEspecialidade = new JComboBox<String>();
		cmbEspecialidade.setBounds(133, 382, 112, 20);
		panel.add(cmbEspecialidade);
		
		for (Especialidade esp : Arquivo.getListaEspecialidades())
		{
			cmbEspecialidade.addItem(esp.getNome());
			
		}
		
		textfields[0] = txtEndereco;
		textfields[1] = txtCRM;
		textfields[2] = txtNome;
		textfields[3] = txtUsername;
		textfields[4] = txtTelefone;
		
	}
}
