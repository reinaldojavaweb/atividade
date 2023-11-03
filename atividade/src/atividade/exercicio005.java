package atividade;

import java.security.DomainCombiner;

public class exercicio005 {
	
		public static void main(String[] args) {
			
			/*Operador ternário*/
			
			int n1 = 200;
			int n2 = 100;
			int n3 = 90;
			int n4 = 10;
			int media = (n1 + n2 + n3 + n4)/4;
			
			
			
			String saidaResultado;
			
			saidaResultado = media >= 70 ? "APROVADO": media >= 40 && media <= 69 ? "Recuperação": "REPROVADO";
			
			System.out.println(saidaResultado);
			
		}
	

}
