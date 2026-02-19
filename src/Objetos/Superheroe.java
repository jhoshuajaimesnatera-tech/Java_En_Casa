package Objetos;

public class Superheroe {
	private String nombre;
	private String poder;
	
	public Superheroe(String nombre, String poder) {
		this.nombre = nombre;
		this.poder = poder;
		
	}
	
	public void Descripcion() {
		System.out.println("Mi nombre de superheroe es: " + nombre + " y mi super poder es: " + poder);
	}
	
}
