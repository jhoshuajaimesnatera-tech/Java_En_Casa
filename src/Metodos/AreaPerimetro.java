package Metodos;

import java.util.Scanner;

public class AreaPerimetro {
	
	public static double area(double radio) {
		double area = Math.PI * Math.pow(radio, radio);
		return area;
	}
	
	public static double perimetro(double radio) {
		double perimetro = 2 * (Math.PI * radio);
		return perimetro;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		 System.out.println("Dime el radio y te dire el area y perimetro");
		 radio = sc.nextDouble();
		 
		 double area = area(radio);
		 double perimetro = perimetro(radio);
		 
		 System.out.println("Esta es la area: " + area + " y este es el perimetro: " + perimetro);
		 
		 sc.close();
	}

}
