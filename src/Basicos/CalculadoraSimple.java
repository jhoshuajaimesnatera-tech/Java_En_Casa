package Basicos;

import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Dime dos numeros y te dire su suma, resta y multiplicacion");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("La suma es: " + (num1+num2));
		System.out.println("La resta es: " + (num1-num2));
		System.out.println("La multiplicacion es: " + (num1*num2));
		
		sc.close();
	}

}
