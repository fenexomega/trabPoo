package org.GUI;

import java.awt.EventQueue;
import java.util.Calendar;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.Classes.Arquivo;
import org.Classes.Atendente;
import org.Classes.Consulta;

import com.toedter.calendar.JCalendar;

import java.lang.*;

public class ListarConsultasDiariasGUI extends JDialog {

	private JPanel contentPane;
	private JTable table;
	private String[][] listaStringsConsultas;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarConsultasDiariasGUI frame = new ListarConsultasDiariasGUI();
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
	public ListarConsultasDiariasGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 334);
		contentPane.add(scrollPane);

		Arquivo.LerArquivos();
		JCalendar c = new JCalendar();
		c.setVisible(false);
		List<Consulta> list = Atendente.getConsultasPorDia(c.getCalendar());
		listaStringsConsultas = new String[list.size()][3];

		int i = 0;
		for (Consulta consulta : list)
		{
			listaStringsConsultas[i][0] 	 = consulta.getPaciente().toString();
			listaStringsConsultas[i][1]		 = consulta.getMedico().toString();
			listaStringsConsultas[i++][2] 	 = consulta.getData().getTime().toString();

		}
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel (
				
				listaStringsConsultas,
				new String[] {
					"Paciente", "Medico" ,"Hora"
				}	
		));
	}

}
