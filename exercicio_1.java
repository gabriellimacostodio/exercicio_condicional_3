package exercicio_condicional_3;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n1;

		
		System.out.println("digite um numero ");
		n1 = leitor.nextInt();
		
		if((n1 >= 20) && (n1 <= 90)) {
			System.out.println("o numero se encontra entre 20 e 90");
		}
		
		else if(n1 < 20) {
			System.out.println("numero invalido");
		}
		
		else if(n1 >90) {
			System.out.println("numero invalido");
		}
	}

}
