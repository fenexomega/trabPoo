package org.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerenteGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenteGUI frame = new GerenteGUI();
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
	public GerenteGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(GerenteGUI.class.getResource("/Images/sair-01.png")));
		button_1.setBackground(SystemColor.desktop);
		button_1.setBounds(465, 67, 89, 82);
		contentPane.add(button_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListarConsultasDiariasGUI gui = new ListarConsultasDiariasGUI();
				gui.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(GerenteGUI.class.getResource("/Images/seach-01.png")));
		button.setBackground(SystemColor.desktop);
		button.setBounds(227, 211, 144, 111);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(GerenteGUI.class.getResource("/Images/logo-01.png")));
		lblNewLabel.setBounds(0, 25, 321, 138);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GerenteGUI.class.getResource("/Images/security.png")));
		label.setBounds(0, 0, 595, 374);
		contentPane.add(label);
	}

}
