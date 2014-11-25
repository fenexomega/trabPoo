package org.GUI.util;

import java.awt.Container;

import javax.swing.JOptionPane;


public class ErrorGUI
{
	public static void MostrarErro(Container contentPane,String mensagem){
		JOptionPane.showMessageDialog(contentPane, mensagem);

	}
}
