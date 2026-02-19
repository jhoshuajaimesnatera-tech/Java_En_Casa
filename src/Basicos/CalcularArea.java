package Basicos;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alto, ancho;
		double area;
		
		System.out.println("Calcular area");
		System.out.println("Dime el alto");
		alto = sc.nextInt();
		System.out.println("Dime el ancho");
		ancho = sc.nextInt();
		
		area = (alto * ancho)/2;
		
		System.out.println("Esta es el area: " + area);

		sc.close();
	}

}
