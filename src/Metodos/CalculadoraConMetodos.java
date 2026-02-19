package Metodos;

import java.util.Scanner;

public class CalculadoraConMetodos {
	
	public static int Suma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static  boolean esPar(int resultado) {
		if (resultado %2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Dime dos numeros y te dire su suma, resta, multiplicacion y si es par");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		int resultadoSuma = Suma(num1, num2);
		System.out.println("Este es el resultado de la suma: " + resultadoSuma);
		
		if(esPar(resultadoSuma)) {
			System.out.println("Es par");
		}else {
			System.out.println("No es par");
		}
		
		sc.close();
		
	}

}
