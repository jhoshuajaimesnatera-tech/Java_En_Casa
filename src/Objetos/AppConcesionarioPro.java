package Objetos;

import java.util.Scanner;
import java.util.ArrayList;

public class AppConcesionarioPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Coche>ListaCoches = new ArrayList<>();
		
		String continuar = "S";

		while(continuar.equalsIgnoreCase("S")){
			System.out.println("Marca: ");
			String marca = sc.nextLine();
			System.out.println("Modelo:");
			String modelo = sc.nextLine();
			
			ListaCoches.add(new Coche(marca, modelo));
			System.out.println("Quieres agregar un coche S/N");
			continuar = sc.nextLine();
		}
		
		for(Coche c: ListaCoches) {
			c.getInfoCoche();
		}
		
		sc.close();
	}
}


