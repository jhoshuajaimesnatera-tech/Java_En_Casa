package Condicionales;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int clave;
		
		System.out.println("Dime tu nombre de usuario");
		nombre = sc.nextLine();
		
		System.out.println("Dime tu contraseña");
		clave = sc.nextInt();
		
		if (nombre.equals("Admi") && clave == 1234) {
			System.out.println("Bienvenido");
		}else {
			System.out.println("Acceso restringido");
		}
		
		sc.close();
	}

}
