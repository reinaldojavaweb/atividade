package atividade;

import javax.swing.JOptionPane;

public class exercicio116 {
	
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe Carros ? ");
		String pessoas = JOptionPane.showInputDialog("Informe pessoas ? ");
		
		double carroNumero = Double.parseDouble(carros);	
		double pessoaNumero = Double.parseDouble(pessoas);		
		
		int divisao = (int)(carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado ? ");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Deseja ver o resultado da ? " + divisao);
			
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o Resto da divisão ");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " +divisao);
		}
		
	}

}
