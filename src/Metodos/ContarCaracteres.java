package Metodos;

import java.util.Scanner;

public class ContarCaracteres {
	
	public static int numCaracteres(String frase) {
		
		return frase.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Dime una frase y te dire cuantos caracteres tiene: ");
		frase = sc.nextLine();
		
		sc.close();
		
		int caracteres = numCaracteres( frase);
		
		System.out.println("este es el numero de caracteres de tu frase: " + caracteres);
	}

}
