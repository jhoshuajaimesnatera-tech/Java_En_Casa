package Bucles;

import java.util.Scanner;

public class SumaNImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad, numero;
		int suma=0;

		System.out.println("Dime cuantos numeros quieres sumar: ");
		cantidad = sc.nextInt();

		for (int i = 1; i <= cantidad;i++) {
			System.out.println("Dime el numero que quieres sumar " + i + "/" + cantidad);
			numero = sc.nextInt();
			
			if (numero %2 !=0) {
				suma = suma + numero;
			}

		}

		sc.close();

		System.out.println("Esta es la sumar de los impares: " + suma);
	}
}