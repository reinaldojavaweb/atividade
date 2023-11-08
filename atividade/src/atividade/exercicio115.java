package atividade;

import javax.swing.JOptionPane;

public class exercicio115 {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Quantos carros ? ");
		String pessoas = JOptionPane.showInputDialog("Quantas pessosas ? ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		JOptionPane.showMessageDialog(null, "Divisão de pessoas deu "+ divisao + "e sobrou " + resto +"carros");
		
		
	}

}
