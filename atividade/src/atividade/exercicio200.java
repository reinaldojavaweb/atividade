package atividade;

public class exercicio200 {
	
	public static void main(String[] args) {
		
		
		int n1 = 10;
		int n2 = 9;
		int n3 = 80;
		int n4 = 90;
		int media = 0;
		
		media = (n1 + n2 + n3 + n4)/4;
		
		if(media >= 70) {
			System.out.println("Aprovado é a sua Média " + media);
		}
		else if (media >= 40 && media <= 69) {
			System.out.println("Sua nota foi " + media + " Recuperação ");
			
		}
		else {
			System.out.println("Sua nota foi " + media + "Reprovado");
		}
		
		
		
	}

}
