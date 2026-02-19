package Basicos;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precio, descuento;
		
		System.out.println("Dime el precio ");
		precio = sc.nextDouble();
		
		descuento = precio * 0.15;
		
		System.out.println("Este es el precio: " + precio + ", El decuento del 15%: " + descuento + ", TOTAL A PAGAR: " + (precio - descuento));
		
		sc.close();
	}

}
