package Bucles;

import java.util.Scanner;

public class CuentaHaciaAtras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Dime un numero y te muestro su cuanta recresiva");
		num = sc.nextInt();
		
		for(int i = num; i>=0; i--) {
			System.out.print(i + ", ");
		}

		sc.close();
	}

}
