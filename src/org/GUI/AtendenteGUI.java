package org.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Label;
import java.awt.Font;
import java.awt.Panel;

public class AtendenteGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtendenteGUI frame = new AtendenteGUI();
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
	public AtendenteGUI() {
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
		button_3.setBackground(SystemColor.desktop);
		button_3.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/nova_consulta-01.png")));
		button_3.setBounds(696, 291, 185, 109);
		panel.add(button_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/cadastrar_medico-01.png")));
		btnNewButton.setBounds(492, 61, 107, 109);
		panel.add(btnNewButton);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(SystemColor.desktop);
		button_2.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/sair-01.png")));
		button_2.setBounds(780, 77, 89, 82);
		panel.add(button_2);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(SystemColor.desktop);
		button_1.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/cadastrar_paciente.png")));
		button_1.setBounds(619, 61, 107, 109);
		panel.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(124, 230, 398, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/pesquisa-01.png")));
		button.setBounds(526, 230, 40, 27);
		panel.add(button);
		
		JLabel lblJlabel = new JLabel("");
		lblJlabel.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/logo-01.png")));
		lblJlabel.setForeground(Color.WHITE);
		lblJlabel.setBounds(10, 11, 324, 181);
		panel.add(lblJlabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 893, 280);
		lblNewLabel.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/inicial_background.png")));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 293, 676, 384);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		table.setModel(new DefaultTableModel (
				
				new Object[][]{
						
				},
				new String[] {
						"Nome", "Especialidade", "localidade"
				}	
		));
		
		Label label = new Label("Somente para n\u00EDvel gerencial");
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		label.setBounds(707, 453, 174, 27);
		panel.add(label);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(SystemColor.desktop);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setIcon(new ImageIcon(AtendenteGUI.class.getResource("/Images/seach-01.png")));
		button_4.setBounds(696, 483, 185, 109);
		panel.add(button_4);
			
	}
}
