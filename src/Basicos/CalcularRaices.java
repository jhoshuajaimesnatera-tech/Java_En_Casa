package Basicos;

import java.util.Scanner;

public class CalcularRaices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un numero y te dire su raiz cuadrada y cubica");
		numero = sc.nextInt();
		
		System.out.println("Raiz cuadrada: " + Math.sqrt(numero) + " Y esta es la raiz cubica: " + Math.cbrt(numero));
		
		sc.close();
	}

}
