package atividade;

import javax.swing.JOptionPane;

public class exercicio114 {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros ");
		String pessoas = JOptionPane.showInputDialog("Quantidade de pessoas ?");
		
		double numeroCarro = Double.parseDouble(carros);
		double numeroPessoa = Double.parseDouble(pessoas);
		
		int divisao = (int) (numeroCarro / numeroPessoa);
		
		double resto = numeroCarro % numeroPessoa;
				
				
		JOptionPane.showMessageDialog(null, "Divisão de pessoas deu "+ divisao + "e sobrou " + resto +"carros");
		
	}

}
