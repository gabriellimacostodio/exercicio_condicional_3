package exercicio_condicional_3;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
			

		int n1 ,n2 ,n3 ,n4 ;
		double media ;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite a nota 1");
		n1 = leitor.nextInt();
		
		System.out.println("digite a nota 2");
		n2 = leitor.nextInt();
		
		System.out.println("digite a nota 3");
		n3 = leitor.nextInt();
		
		System.out.println("digite a nota 4");
		n4 = leitor.nextInt();
		
		
		System.out.println(media =((n1 + n2 + n3 + n4)/4));
		
		
		if(media >= 7 ) {
			System.out.println("aprovado");
		
		}
		else if((media >= 3.5) && (media < 7)) {
			System.out.println("recuperação");
			
		}
		else if(media < 3.5) {
			System.out.println("reprovado");
		
	
		}
	}
}
	
	
	
	
	
	


