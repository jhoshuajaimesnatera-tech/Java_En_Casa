package Bucles;

import java.util.Scanner;

public class CajeroImpaciente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		double con=0;

		do {
			System.out.println("Dime el precio ");
			numero = sc.nextDouble();

			con += numero;

		}	while(numero!=0);

		System.out.println("Precio total: " + con);

		sc.close();

	}
}

