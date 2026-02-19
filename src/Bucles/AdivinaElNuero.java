package Bucles;

import java.util.Scanner;

public class AdivinaElNuero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int numeroSecreto = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("Adivina el nuemro del 1-100");
			num = sc.nextInt();
			
			if(num < numeroSecreto) {
				System.out.println("El numero es mas alto");
			}else {
				System.out.println("El numero es mas bajo");
			}
			
		}while(num != numeroSecreto);
		
		System.out.println("Felicidades adivinaste el numero");
		
		sc.close();

	}

}
