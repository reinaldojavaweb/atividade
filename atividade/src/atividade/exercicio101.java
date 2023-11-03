
package atividade;

public class exercicio101 {
	
	public static void main(String[] args) {
		
		/*velocidade Média*/
		
		double velocidade = 20;
		
		if(velocidade >= 100) {
			
			System.out.println("Reduza sua Velocidade está ALTA " + velocidade + " KM/h");
		}
		
		else if (velocidade < 99 && velocidade >= 40) {
			
			System.out.println("Velocidade Média " + velocidade + " km/h");
		}
		
		else if (velocidade < 39) {
			System.out.println(velocidade +" km/h " + "Baixa Velocidade ");
		}
		
	}
	
	
	}
