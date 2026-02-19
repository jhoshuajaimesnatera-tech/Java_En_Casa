package Arrays;

import java.util.Scanner;

public class Almacenar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]numeros = new int[5];
	
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Dime el numero que quieres guardar en la posicion "+ (i+1) + "/5");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Forma normal");
		for(int i=0; i<numeros.length;i++) {
			System.out.print(numeros[i]);
			
			if (i < numeros.length -1) {
				System.out.print(", ");
			}
		}
		System.out.println("");
		
		System.out.println("Forma inversa");
		for(int i =numeros.length -1; i>=0; i--) {
			System.out.print(numeros[i]);
			
			if (i > 0) {
				System.out.print(", ");
			}
		}
		
		sc.close();

	}

}
