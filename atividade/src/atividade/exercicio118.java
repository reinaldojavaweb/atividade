package atividade;

import javax.swing.JOptionPane;

public class exercicio118 {
	
	
	public static void main(String[] args) {
		

	
	String n1 = JOptionPane.showInputDialog("Digite nota1: ");
	String n2 = JOptionPane.showInputDialog("Digite nota2: ");
	String n3 = JOptionPane.showInputDialog("Digite nota3: ");
	String n4 = JOptionPane.showInputDialog("Digite nota4: ");
	
	double dn1 = Double.parseDouble(n1);
	double dn2 = Double.parseDouble(n2);
	double dn3 = Double.parseDouble(n3);
	double dn4 = Double.parseDouble(n4);
	
	double media = (dn1 + dn2 + dn3 + dn4 )/4;
	
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "A media é " +media+ " APROVADO");
			}
			else {
				JOptionPane.showConfirmDialog(null, "A média é "+media+ "Reprovado");
			}
		}
	
	
	}
	
}