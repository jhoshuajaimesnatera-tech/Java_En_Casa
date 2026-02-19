package Basicos;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alto, base;
		double area;
		
		System.out.println("Calcular area de un rectangulo");
		System.out.println("Dime el alto");
		alto = sc.nextInt();
		System.out.println("Dime el Base");
		base = sc.nextInt();
		
		area = alto*base;
		
		System.out.println("Esta es el area del rectangulo: " + area);
		
		sc.close();
	}

}
