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
		panel.setBounds(10, 146, 233, 178);
		contentPane.add(panel);
		
		JCalendar calendar = new JCalendar();
		panel.add(calendar);
	}
}
