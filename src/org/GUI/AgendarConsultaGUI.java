package org.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.Classes.Arquivo;
import org.Classes.Plano_De_Saude;

import com.toedter.calendar.JCalendar;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AgendarConsultaGUI extends JDialog {

	private JPanel contentPane;
	private JLabel lblCpfDoPaciente;
	private JLabel lblCpf;
	private JTable table;
	private String[][] listaStringsMedicos;
	private TextField textField_3;
	private JComboBox<Plano_De_Saude> comboBoxPlan;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendarConsultaGUI frame = new AgendarConsultaGUI("111.111.111-11");
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
	public AgendarConsultaGUI(String CPFpaciente) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 792, 651);
		setModalityType(ModalityType.APPLICATION_MODAL);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/logo-01.png")));
		label_3.setBounds(431, 11, 304, 138);
		panel.add(label_3);
		
		JLabel lblAgendarConsulta = new JLabel("Agendar Consulta");
		lblAgendarConsulta.setForeground(Color.WHITE);
		lblAgendarConsulta.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 23));
		lblAgendarConsulta.setBounds(20, 75, 217, 29);
		panel.add(lblAgendarConsulta);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/adicionar-01.png")));
		label_2.setBounds(232, 75, 20, 35);
		panel.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/inicial_background.png")));
		label.setBounds(0, 0, 766, 159);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 160, 746, 431);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(80, 381, 55, 22);
		panel_1.add(textField_2);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setForeground(Color.GRAY);
		lblHora.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		lblHora.setBounds(30, 374, 55, 29);
		panel_1.add(lblHora);
		
		JLabel lblMdicos = new JLabel("Especialidades");
		lblMdicos.setBounds(314, 49, 148, 29);
		panel_1.add(lblMdicos);
		lblMdicos.setForeground(Color.GRAY);
		lblMdicos.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		
		JComboBox<?> comboBoxMedi = new JComboBox<Object>();
		comboBoxMedi.setBounds(314, 77, 128, 20);
		panel_1.add(comboBoxMedi);
		
		JButton button_1 = new JButton("Salvar");
		button_1.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/salvar-01.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 128, 128));
		button_1.setBounds(438, 344, 144, 43);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_2.setIcon(new ImageIcon(AgendarConsultaGUI.class.getResource("/Images/cancelar-01.png")));
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(new Color(0, 128, 128));
		button_2.setBounds(592, 344, 144, 43);
		panel_1.add(button_2);
		
		JLabel lblPlanoDeSade = new JLabel("Plano de sa\u00FAde");
		lblPlanoDeSade.setForeground(Color.GRAY);
		lblPlanoDeSade.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		lblPlanoDeSade.setBounds(30, 309, 144, 29);
		panel_1.add(lblPlanoDeSade);
		

		 comboBoxPlan = new JComboBox<Plano_De_Saude>();
		comboBoxPlan.setBounds(30, 343, 128, 20);
		panel_1.add(comboBoxPlan);
		
		Arquivo.LerArquivos();
		
		for (Plano_De_Saude plano : Arquivo.getListaPlanos())
		{
			comboBoxPlan.addItem(plano);
		}
		

		textField_3 = new TextField();
		textField_3.setBounds(86, 275, 134, 22);

		panel_1.add(textField_3);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setForeground(Color.GRAY);
		lblValor.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		lblValor.setBounds(30, 268, 55, 29);
		panel_1.add(lblValor);
		
		

		
		lblCpfDoPaciente = new JLabel("CPF do paciente:");
		lblCpfDoPaciente.setBounds(10, 7, 148, 29);
		panel_1.add(lblCpfDoPaciente);
		lblCpfDoPaciente.setForeground(Color.GRAY);
		lblCpfDoPaciente.setFont(new Font("Helvetica65-Medium", Font.PLAIN, 18));
		
		lblCpf = new JLabel(CPFpaciente);
		lblCpf.setBounds(170, 15, 148, 15);
		panel_1.add(lblCpf);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(20, 47, 227, 193);
		panel_1.add(panel_2);
		
		JCalendar calendar = new JCalendar();
		panel_2.add(calendar);
		

		
		JCheckBox chckbxParticular = new JCheckBox("Particular");
		chckbxParticular.setBounds(30, 246, 129, 23);
		panel_1.add(chckbxParticular);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(452, 49, 284, 248);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 264, 226);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel (
				
				listaStringsMedicos,
				new String[] {
						"Nome", "Horario"
				}	
		));
		chckbxParticular.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e)
			{
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					textField_3.setEnabled(true);
					comboBoxPlan.setEnabled(false);
				}
				else
				{
					textField_3.setEnabled(false);
					comboBoxPlan.setEnabled(true);
				}
			}
		});
	}
}
