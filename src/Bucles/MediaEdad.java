package Bucles;

import java.util.Scanner;

public class MediaEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		int contPersonas=0;
		int sumaEdades=0;
		
		do {
			
			System.out.println("Dime una edad");
			edad = sc.nextInt();
			
			if(edad>0) {
				sumaEdades += edad;
				contPersonas++;
			}
			
			
		}while(edad > 0);
		
		double media = sumaEdades/contPersonas;
		
		System.out.println("Esta es la media de edades: " + media);
		
		sc.close();

	}

}
