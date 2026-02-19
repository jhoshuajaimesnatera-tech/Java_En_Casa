package Basicos;

import java.util.Scanner;

public class CalcularIVA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precio;
		double IVA;
		System.out.println("Dime un presio y te dire cuanto es con el IVA incluido");
		precio = sc.nextDouble();
		
		IVA = precio * 0.21;
		
		System.out.println("Este es el precio con el IVA: " + (precio + IVA));
		
		sc.close();
	}

}
