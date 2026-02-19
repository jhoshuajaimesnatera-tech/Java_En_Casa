package Basicos;

import java.util.Scanner;

public class DolarAEuro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double cambio, cantidad;
		
		System.out.println("Dime la cantidad de $ que quieres cambiar a €");
		cantidad = sc.nextDouble();
		
		cambio = cantidad *0.92;
		
		System.out.println("Esta sera la cantidad al cambio de $ a €: " + cambio);
		
		sc.close();
	}

}
