package joptionpane;

import javax.swing.JOptionPane;

public class RepeticaoJOptionPane {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int med = 0, par = 0, impar = 0, num, cc = 0, acima = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número <br />"
																	+ "<em>número 0 encerra</em></html>"));
			if (num != 0) {
				cc++; // total de valores digitados
				med += num; // media
				if (num > 100) acima++; 	// acima de 100
					
				if (num % 2 == 0) par++;  	// total de pares 
				else impar++; 				// total de impares
			} else continue;
		} while (num != 0);
		
		JOptionPane.showMessageDialog(null, 
				"<html> Resultado <hr />"
				+ "Total de valores: " + cc + "<br />"
				+ "Total de pares: " + par + "<br />"
				+ "Total de ímpares: " + impar + "<br />"
				+ "Acima de 100: " + acima + "<br />"
				+ "Soma dos valores: " + med + "<br />"
				+ "Média dos valores: " + (med/cc) + "<br />"
				+ "</html>", "Resultado em Java", JOptionPane.WARNING_MESSAGE);
	}
}