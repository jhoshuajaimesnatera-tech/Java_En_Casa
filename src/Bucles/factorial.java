package Bucles;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int factorial=1;
		
		System.out.println("Dime un nunero entero y te dire su factorial");
		numero = sc.nextInt();
		
		for(int i =1; i<=numero; i++) {
			factorial = factorial * i;
		}
		
		sc.close();

		System.out.println("El factorial de " + numero + "=" + factorial);
	}

}
