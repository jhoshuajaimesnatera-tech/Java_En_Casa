package MaquinaExpendedora;

import java.util.Scanner;
import java.util.ArrayList;

public class AppMaquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Productos> maquinaExpendedora = new ArrayList<>();

		maquinaExpendedora.add(new Productos("Cocacola", 1.3, 5));
		maquinaExpendedora.add(new Productos("Barra de cocholate", 2.0, 7));
		maquinaExpendedora.add(new Productos("Gominolas", 1., 5));
		
		System.out.println("Quieres comprar algo S/N");
		String opc =sc.nextLine();
		do{
		for(Productos p : maquinaExpendedora) {
			System.out.println(p.toString());
		}
		
		System.out.println("\n ¿Que producto quieres comprar?");
		String eleccion = sc.nextLine();
		
		for(Productos p : maquinaExpendedora) {
			if(p.getNombre().equalsIgnoreCase(eleccion)) {
				p.vender();
			}
		}
		System.out.println("Quieres algo mas S/N");
		opc = sc.nextLine();
		}while(opc.equalsIgnoreCase("S"));
		
		sc.close();

	}
}
