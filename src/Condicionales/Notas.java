package Condicionales;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		
		System.out.println("Dime tu nota la cual debe ser del 1-10");
		nota = sc.nextInt();
		
		if (nota <= 4) {
			System.out.println("Suspendido");
		}else if (nota == 5 || nota == 6) {
			System.out.println("Aprobado");
		}else if (nota == 7 || nota == 8) {
			System.out.println("Notanle");
		}else {
			System.out.println("Sobresaliente");
		}
		
		sc.close();
	}

}
