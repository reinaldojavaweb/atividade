package atividade;

import javax.swing.JOptionPane;

public class exercicio117 {
	
	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Informe Nota 1 : ");
		String n2 = JOptionPane.showInputDialog("Informe Nota 2: ");
		String n3 = JOptionPane.showInputDialog("Informe Nota 3: ");
		String n4 = JOptionPane.showInputDialog("Informe Nota 4: ");
		
		double dn1 = Double.parseDouble(n1);
		double dn2 = Double.parseDouble(n2);
		double dn3 = Double.parseDouble(n3);
		double dn4 = Double.parseDouble(n4);
		
		double media = (dn1 + dn2 + dn3 + dn4) / 4;
		
		JOptionPane.showMessageDialog(null, "A média é " + media);
		
		if(media >= 50) {
			
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "O aluno está Aprovado " + media);
			}
			else {
				JOptionPane.showMessageDialog(null, "Aluno de RECUPERAÇÃO "+ media);
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Aluno REPROVADO "+ media);
		}
		
		
	}

}
