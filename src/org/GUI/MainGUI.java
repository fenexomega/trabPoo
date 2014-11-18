package org.GUI;

import java.awt.EventQueue;
import java.awt.PopupMenu;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SingleSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* SINGLETON */
public class MainGUI {

	private JFrame frame;
	private JMenuBar menuBar;
	//private LoginGUI login;
	private static MainGUI _instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainGUI window = MainGUI.getInstance();
					window.frame.setVisible(true);
//					window.login = new LoginGUI();
//					window.login.setVisible(true);
//					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public static MainGUI getInstance()
	{
		if(_instance == null)
			_instance = new MainGUI();
		return _instance;
	}
	
	private MainGUI() {
		initialize();

	}

	public void Dispose()
	{
		frame.dispose();
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame("Sistema Clínica");
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenu mnAdicionar = new JMenu("Adicionar");
		mnArquivo.add(mnAdicionar);
		
		JMenuItem mntmPaciente = new JMenuItem("Paciente");
		mnAdicionar.add(mntmPaciente);
		
		JMenuItem mntmMdico = new JMenuItem("Médico");
		mnAdicionar.add(mntmMdico);
		
		JMenuItem mntmFuncionario = new JMenuItem("Funcionario");
		mnAdicionar.add(mntmFuncionario);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnArquivo.add(mntmLogout);
		
		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mntmFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dispose();
			}
		});
		mnArquivo.add(mntmFechar);
		
		JMenu mnExibir = new JMenu("Exibir");
		menuBar.add(mnExibir);
		
		JMenuItem mntmPacientes = new JMenuItem("Pacientes");
		mnExibir.add(mntmPacientes);
		
		JMenuItem mntmMedicos = new JMenuItem("Medicos");
		mnExibir.add(mntmMedicos);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JDialog diaSobre = new SobreGUI();
				diaSobre.show();
				diaSobre.toFront();
			}
		});
		mnAjuda.add(mntmSobre);
	}

}
