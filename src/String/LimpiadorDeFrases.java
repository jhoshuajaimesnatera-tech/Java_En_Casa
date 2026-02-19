package String;

import java.util.Scanner;

public class LimpiadorDeFrases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("dime una frase");
		frase = sc.nextLine();
		
		String tuneada = frase.replace('a', '4').replace('e', '3');
		
		System.out.println(tuneada);
		
		System.out.println(frase.length() + " Caracteres");
			
		System.out.println(frase.toUpperCase());
		
		sc.close();

	}

}
