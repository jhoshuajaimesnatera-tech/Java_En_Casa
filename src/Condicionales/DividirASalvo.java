package Condicionales;

import java.util.Scanner;

public class DividirASalvo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividendo, divisor;
		
		System.out.println("Dime el numero por el que quieres dividir");
		dividendo = sc.nextInt();
		
		System.out.println("Dime por el numero que quieres dividir");
		divisor = sc.nextInt();
		
		if(divisor == 0) {
			System.out.println("No se puede dividir por cero ");
		}else {
			System.out.println(dividendo + "/" + divisor + "=" + (dividendo/divisor));
		}

	}

}
