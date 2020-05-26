package exercicio_condicional_3;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite a idade do nadador");
		idade = leitor.nextInt();
		
		if(idade >= 5 && idade <= 10) {
			System.out.println("categoria infantil");
		}
		else if(idade >= 11 && idade <= 17) {
			System.out.println("categoria juvenil");
			
		}
		else if(idade >= 18) {
			System.out.println("categoria adulto");
			
		}
		
		
		
	}

}
