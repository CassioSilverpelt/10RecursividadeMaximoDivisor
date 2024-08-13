package view;

import javax.swing.JOptionPane;
import controller.MaximoDivisorCController;

public class MaximoDivisorCPrincipal {
	public static void main (String[] args) {
		MaximoDivisorCController mdcCon = new MaximoDivisorCController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
	}
}
