package atividade;

public class exercicio106 {
	
	public static void main(String[] args) {
		
		
		int n1 = 100;
		int n2 = 40;
		int n3 = 90;
		int n4 = 100;
		
		int media = (n1 + n2 + n3 + n4)/4;
		
		
		/*operação Aninhada*/
		
		
		if(media >= 70) {
			
			if(media >= 100) {
				
				System.out.println("Aprovado com a nota " + media);
			}
			else {
				System.out.println("Recuperação com a nota: " + media);
			}
			
		}
		else {
			System.out.println("Aluno REPROVADO nota: " + media);
		}
		
		
		
	}

}
