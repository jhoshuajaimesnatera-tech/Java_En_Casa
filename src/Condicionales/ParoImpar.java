package Condicionales;

import java.util.Scanner;

public class ParoImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un numero entero y te dire si es par o no");
		numero = sc.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		sc.close();

	}

}
