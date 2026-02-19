package Condicionales;

import java.util.Scanner;

public class Renta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad, ingresos;
		
		System.out.println("Dime tu edad");
		edad = sc.nextInt();
		
		System.out.println("Dime tus ingresos mensuales");
		ingresos = sc.nextInt();
		
		if (edad >= 18 && ingresos > 1000) {
			System.out.println("Debes tributar");
		}else {
			System.out.println("No debes tributar");
		}

		sc.close();
	}

}
