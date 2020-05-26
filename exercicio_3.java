package exercicio_condicional_3;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int cash;
		
		System.out.println("qual o seu salario ?");
		cash = leitor.nextInt();
		
		if(cash >=0 && cash <= 1000 ) {
			System.out.println("você recebeu um almento de 15% "+ (cash+(cash/100*15)));
		}
		
		else if(cash >1000 && cash <= 2500 ) {
			System.out.println("você recebeu um almento de 7% "+ (cash+(cash/100*7)));
		}
		
		else if (cash > 2500) {
			System.out.println("não haverá aumento, seu salario continuara "+ cash);
		}
		
		
		
		
	}

}
