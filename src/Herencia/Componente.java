package Herencia;

public class Componente {
	protected String nombre;
	protected int id;
	
	public Componente(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public void renderizar() {
		System.out.println("Nombre del componente: " + nombre + " ID: " + id);
	}
}
