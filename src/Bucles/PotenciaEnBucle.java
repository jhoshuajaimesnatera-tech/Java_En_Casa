package Bucles;

import java.util.Scanner;

public class PotenciaEnBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, exponente;
		int acumulador = 1;
		
		System.out.println("Dime la base de la potencia ");
		base = sc.nextInt();
		
		System.out.println("Dime ahora el exponente ");
		exponente = sc.nextInt();
		
		for(int i = 0; i < exponente; i++) {
			acumulador = acumulador * base;
			
		}
		
		System.out.println("Este es el resultado de la potencia " + acumulador);
		
		sc.close();

	}

}
