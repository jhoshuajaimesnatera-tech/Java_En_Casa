package Basicos;

import java.util.Scanner;

public class CocienteYResto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Dime dos numeros y te dire su division y resto");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Esta es la division: " + (num1/num2) + " y este es el resto: " + (num1%num2));
		
		sc.close();

	}

}
