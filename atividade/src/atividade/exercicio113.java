package atividade;

import javax.swing.JOptionPane;

public class exercicio113 {
	
	public static void main(String[] args) {
		
	String carros = JOptionPane.showInputDialog("Informe quantidade de carrros ?");
	
	String pessoas = JOptionPane.showInputDialog("Informe quantidade de Pessoas ? ");
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);
	
	double resto = carroNumero % pessoaNumero; 
	
	System.out.println("Divisão de pessoas deu "+ divisao + "e sobrou " + resto +"carros");
		
	}
		
}
