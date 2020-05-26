package exercicio_condicional_3;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int b , l2 , l3 ;
		

		System.out.println("digite o valor da base  do triangulo");
		b = leitor.nextInt();
		System.out.println("digite o valor do lado 2 do triangulo");
		l2 = leitor.nextInt();
		System.out.println("digite o valor do lado 3 do triangulo");
		l3 = leitor.nextInt();
		
		if((b == l2) && (b == l3) && (l2 == l3)) {
			System.out.println("triangulo equilatero");
		}
		
		else if((b < l2 + l3 ) && (l2 == l3) ) {
			System.out.println("triangulo isósceles");
				
		}
		
		else if((b < l2 + l3 ) && (l2 > l3)) {
			System.out.println("triangulo escaleno");
		}
		
		
		else if((b < l2 + l3 ) && (l3 > l2)) {
			System.out.println("triangulo escaleno");
		
		}
		
		else if (b > l2 + l3) {
			System.out.println("não e um triangulo");
		}
		
		

		
	}

}
