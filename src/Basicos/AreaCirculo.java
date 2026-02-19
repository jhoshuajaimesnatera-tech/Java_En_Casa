package Basicos;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radio;
		
		System.out.println("Calcular area de un circulo");
		System.out.println("Dime su radio");
		radio = sc.nextInt();
		
		// tambien podemos usar la libreria Math para usar la potencia Math.pow(radio,2);
		
		System.out.println("Esta es el area del circulo: " + (Math.PI * (radio * radio))); 
		
		sc.close();

	}

}
