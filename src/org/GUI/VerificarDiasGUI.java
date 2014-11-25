package org.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class VerificarDiasGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificarDiasGUI frame = new VerificarDiasGUI();
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
	public VerificarDiasGUI() {
		setTitle("Verificar dias dispon\u00EDveis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVerificarDiasDisponveis = new JLabel("Verificar dias dispon\u00EDveis");
		lblVerificarDiasDisponveis.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblVerificarDiasDisponveis.setForeground(Color.WHITE);
		lblVerificarDiasDisponveis.setBounds(24, 69, 261, 14);
		contentPane.add(lblVerificarDiasDisponveis);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VerificarDiasGUI.class.getResource("/Images/inicial_background.png")));
		lblNewLabel.setBounds(0, 0, 620, 137);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 166, 233, 178);
		contentPane.add(panel);
		
		JCalendar calendar = new JCalendar();
		panel.add(calendar);
		
		JLabel txt3 = new JLabel("10h \u00E0s 11h");
		txt3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt3.setBounds(273, 241, 75, 29);
		contentPane.add(txt3);
		
		JLabel txt4 = new JLabel("11h \u00E0s 12h");
		txt4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt4.setBounds(273, 280, 75, 29);
		contentPane.add(txt4);
		
		JLabel txt5 = new JLabel("12h \u00E0s 13h");
		txt5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt5.setBounds(273, 320, 75, 29);
		contentPane.add(txt5);
		
		JLabel txt8 = new JLabel("15h \u00E0s 16h");
		txt8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt8.setBounds(402, 241, 75, 29);
		contentPane.add(txt8);
		
		JLabel txt9 = new JLabel("16h \u00E0s 17h");
		txt9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt9.setBounds(402, 280, 75, 29);
		contentPane.add(txt9);
		
		JLabel txt10 = new JLabel("17h \u00E0s 18h");
		txt10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt10.setBounds(402, 320, 75, 29);
		contentPane.add(txt10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(253, 161, 253, 29);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txt1 = new JLabel("8h \u00E0s 9h");
		txt1.setBounds(20, 0, 75, 29);
		panel_1.add(txt1);
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel txt6 = new JLabel("13h \u00E0s 14h");
		txt6.setBounds(149, 0, 75, 29);
		panel_1.add(txt6);
		txt6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(253, 201, 253, 29);
		contentPane.add(panel_2);
		
		JLabel txt2 = new JLabel("9h \u00E0s 10h");
		txt2.setBounds(21, 0, 75, 29);
		panel_2.add(txt2);
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel txt7 = new JLabel("14h \u00E0s 15h");
		txt7.setBounds(150, 0, 75, 29);
		panel_2.add(txt7);
		txt7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(253, 241, 253, 29);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(253, 281, 253, 29);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(253, 320, 253, 29);
		contentPane.add(panel_5);
	}
}
