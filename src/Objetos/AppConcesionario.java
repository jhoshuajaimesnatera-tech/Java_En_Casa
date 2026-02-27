package Objetos;

import java.util.Scanner;

public class AppConcesionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos coches vas a poner:");
		int numCoches = sc.nextInt();
		sc.nextLine();
		
		Coche[]inventario = new Coche[numCoches];
		
		for(int i=0; i<inventario.length; i++) {
			System.out.println("\nDatos del coche #" + (i+1));
			System.out.println("Marca: ");
			String marca = sc.nextLine();
			System.out.println("Modelo:");
			String modelo = sc.nextLine();
			
			inventario[i]= new Coche(marca, modelo);
		}
		System.out.println("\nLista de coches: ");
		for(int i=0; i<inventario.length; i++) {
			inventario[i].getInfoCoche();
		}
		sc.close();
	}

}
