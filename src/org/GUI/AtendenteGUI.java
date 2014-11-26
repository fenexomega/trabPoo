package org.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.Classes.Arquivo;
import org.Classes.Medico;
import org.Classes.Paciente;
import org.GUI.util.ErrorGUI;



import javax.swing.JTabbedPane;

//SINGLETON
public class AtendenteGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[][] listaStringsPacientes;
	private String[][] listaStringsMedicos;
	private CriarPacienteGUI cp;
	static private AtendenteGUI _instance;
	private JTable tab_paciente;
	private JTable tab_medico;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtendenteGUI frame = GetInstance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void AtualizarTabelaMedicos(){
		Arquivo.LerArquivos();
		listaStringsMedicos = new String[Arquivo.getListaMedicos().size()][4];
		
		int i = 0;
		for (Medico p : Arquivo.getListaMedicos())
		{

			listaStringsMedicos[i][0] = p.getNome();
			listaStringsMedicos[i][2] = p.getCRM();
			listaStringsMedicos[i++][3] = "";
		}
		
		tab_medico.setModel(new DefaultTableModel (
				
				listaStringsMedicos,
				new String[] {
						"Nome", "CRM", "Horario"
				}	
		));
		
	}
	public void AtualizarTabelaPacientes()
	{
		//TODO TIRAR ESSA LINHA AQUI NO RELEASE
		Arquivo.LerArquivos();
		//FIM
		listaStringsPacientes = new String[Arquivo.getListaPacientes().size()][3];
		
		int i = 0;
		for (Paciente p : Arquivo.getListaPacientes())
		{

			listaStringsPacientes[i][0] = p.getNome();
			listaStringsPacientes[i][1] = p.getCpf();
			listaStringsPacientes[i++][2] = p.getEndereco();	
		}
		
		tab_paciente.setModel(new DefaultTableModel (
				
				listaStringsPacientes,
				new String[] {
						"Nome", "CPF", "Endereço"
				}	
		));
	}

	static public AtendenteGUI GetInstance()
	{
		if(_instance == null)
		{
			_instance = new AtendenteGUI();
		}
		return _instance;
	}
	/**
	 * Create the frame.
	 */
	private AtendenteGUI() {
		System.out.println(Arquivo.getListaConsultasPlano().size());
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AtendenteGUI.class.getResource("/Images/logo-01.png")));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 727);
		contentPane = new JPanel();
		contentPane.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent arg0) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 391, Short.MAX_VALUE)
		);
		panel.setLayout(null);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tab_paciente.getSelectedRow() == -1)
				{
					//GERAR ERRO, nenhuma linha foi selecionada
					ErrorGUI.MostrarErro(contentPane, "Nenhuma linha foi selecionada");
				}
				else
				{
				
					AgendarConsultaGUI gui = new AgendarConsultaGUI(tab_paciente.getModel().getValueAt(tab_paciente.getSelectedRow(), 1).toString());
					gui.setVisible(true);
				}
			}
		});
		button_3.setBackground(SystemColor.desktop);
		button_3.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/nova_consulta-01.png")));
		button_3.setBounds(696, 261, 185, 109);
		panel.add(button_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarMedicoGUI cm = new CadastrarMedicoGUI();
				cm.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/cadastrar_medico-01.png")));
		btnNewButton.setBounds(492, 61, 107, 109);
		panel.add(btnNewButton);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_2.setBackground(SystemColor.desktop);
		button_2.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/sair-01.png")));
		button_2.setBounds(780, 77, 89, 82);
		panel.add(button_2);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cp = new CriarPacienteGUI();
				cp.setVisible(true);;
				
			}
		});
		button_1.setBackground(SystemColor.desktop);
		button_1.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/cadastrar_paciente.png")));
		button_1.setBounds(619, 61, 107, 109);
		panel.add(button_1);
		
		JLabel lblJlabel = new JLabel("");
		lblJlabel.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/logo-01.png")));
		lblJlabel.setForeground(Color.WHITE);
		lblJlabel.setBounds(10, 11, 324, 181);
		panel.add(lblJlabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 893, 231);
		lblNewLabel.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/inicial_background.png")));
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 242, 676, 420);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pacientes", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 651, 370);
		panel_1.add(scrollPane_1);
		
		tab_paciente = new JTable();
		scrollPane_1.setViewportView(tab_paciente);
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Médicos", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 651, 370);
		panel_2.add(scrollPane_2);
		
		tab_medico = new JTable();
		scrollPane_2.setViewportView(tab_medico);
		
		tab_medico.setModel(new DefaultTableModel (
				
				listaStringsMedicos,
				new String[] {
						"Nome", "CRM", "Horario"
				}	
		));
		
		JButton btnNewButton_1 = new JButton("Criar Plano de Sa\u00FAde");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CriarPlanoGUI cp = new CriarPlanoGUI();
				cp.setVisible(true);
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 153, 204));
		btnNewButton_1.setBounds(696, 402, 185, 54);
		panel.add(btnNewButton_1);
		
		JButton btnVerificarDias = new JButton("Verificar dias disponiveis");
		btnVerificarDias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerificarDiasGUI verd = new VerificarDiasGUI();
				verd.setVisible(true);
			}
		});
		btnVerificarDias.setForeground(Color.WHITE);
		btnVerificarDias.setBackground(new Color(0, 153, 204));
		btnVerificarDias.setBounds(696, 532, 185, 54);
		panel.add(btnVerificarDias);
		
		JButton btnCriarEspecialidade = new JButton("Criar Especialidades");
		btnCriarEspecialidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CriarEspecialidadeGUI ce = new CriarEspecialidadeGUI();
				ce.setVisible(true);
				
			}
		});
		btnCriarEspecialidade.setForeground(Color.WHITE);
		btnCriarEspecialidade.setBackground(new Color(0, 153, 204));
		btnCriarEspecialidade.setBounds(696, 467, 185, 54);
		panel.add(btnCriarEspecialidade);
		
		AtualizarTabelaPacientes();
		AtualizarTabelaMedicos();
			
	}
}
