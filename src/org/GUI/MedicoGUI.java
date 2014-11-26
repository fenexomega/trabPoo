package org.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.Classes.Arquivo;
import org.Classes.Paciente;

public class MedicoGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String nomeMedico = "Dr. Fulano";
	private JLabel lblNewLabel_1;
	private JTable table_1;
	

	public void setNomeMedico(String nomeMedico)
	{
		lblNewLabel_1.setText(nomeMedico);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicoGUI frame = new MedicoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private String[][] getTabelaPacientes()
	{
		//TODO TIRAR ESSA LINHA AQUI NO RELEASE
		Arquivo.LerArquivos();
		//FIM
		String[][] listaStrings = new String[Arquivo.getListaPacientes().size()][2];
		int i = 0;
		for (Paciente p : Arquivo.getListaPacientes())
		{

			listaStrings[i][0] = p.getNome();
			listaStrings[i++][1] = p.getCpf();

			
		}
		return listaStrings;
	}
	
	/**
	 * Create the frame.
	 */
	public MedicoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
//		
//		textField = new JTextField();
//		textField.setColumns(10);
//		textField.setBounds(554, 187, 282, 27);
//		panel.add(textField);
		
		lblNewLabel_1 = new JLabel(nomeMedico);

		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(745, 139, 130, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnListar = new JButton("Listar atendimentos");
		btnListar.setForeground(new Color(255, 255, 255));
		btnListar.setBackground(new Color(0, 128, 128));
		btnListar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnListar.setBounds(554, 528, 321, 48);
		panel.add(btnListar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MedicoGUI.class.getResource("/Images/medico-01.png")));
		lblNewLabel.setBounds(713, 128, 22, 35);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 306, 138);
		panel.add(label);
		label.setIcon(new ImageIcon(MedicoGUI.class.getResource("/Images/logo-01.png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(774, 21, 89, 126);
		panel.add(label_1);
		label_1.setIcon(new ImageIcon(MedicoGUI.class.getResource("/Images/sair-01.png")));
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(0, 0, 885, 176);
		panel.add(label_2);
		label_2.setIcon(new ImageIcon(MedicoGUI.class.getResource("/Images/inicial_background.png")));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(554, 187, 326, 277);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
		table.setModel(new DefaultTableModel (
				
				getTabelaPacientes(),
				new String[] {
						"Medico", "Dia"
				}	
		));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(MedicoGUI.class.getResource("/Images/salvar-01.png")));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(0, 102, 102));
		btnSalvar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnSalvar.setBounds(554, 475, 156, 48);
		panel.add(btnSalvar);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(562, 150, 46, 14);
		panel.add(label_3);
		
		JButton btnLimparTudo = new JButton("Excluir tudo");
		btnLimparTudo.setIcon(new ImageIcon(MedicoGUI.class.getResource("/Images/excluir-01.png")));
		btnLimparTudo.setForeground(new Color(255, 255, 255));
		btnLimparTudo.setBackground(new Color(0, 102, 102));
		btnLimparTudo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnLimparTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLimparTudo.setBounds(713, 475, 166, 48);
		panel.add(btnLimparTudo);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 187, 536, 485);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		table_1.setModel(new DefaultTableModel (
				
				getTabelaPacientes(),
				new String[] {
						"Nome", "CPF"
				}	
		));
		
		JButton btnNovaObservao = new JButton("Criar nova Observa\u00E7\u00E3o");
		btnNovaObservao.setForeground(Color.WHITE);
		btnNovaObservao.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnNovaObservao.setBackground(new Color(0, 128, 128));
		btnNovaObservao.setBounds(554, 582, 321, 48);
		panel.add(btnNovaObservao);
	}
}
