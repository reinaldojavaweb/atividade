package atividade;

public class exercicio00 {
	
	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 10;
		int n3 = 99;
		int n4 = 100;
		int media =0;
		
		
		media = (n1 + n2 + n3 + n4)/4;
		
				if(media >= 70) {
					System.out.println("Aluno Aprovado com Média " + media);
				}
				else if(media >= 40 && media <= 69) {
					System.out.println("Aluno Recuperação " + media);
				}
				else {
					System.out.println("Reprovado");
				}
		
		
	}

}
