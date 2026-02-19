package Condicionales;

import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un numero y te dire si es negativo  o psitivo");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Postivo");
		}else if (numero < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Tu numero es 0");
		}
		
		sc.close();
	}

}
