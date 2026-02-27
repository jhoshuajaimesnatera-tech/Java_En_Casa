package Herencia;

public class Personaje {
	protected String nombre;
	protected int salud;
	
	public Personaje (String nombre, int salud) {
		this.nombre = nombre;
		this.salud = salud;
	}
	
	public int recibirDanio(int cantidad) {
		return salud -= cantidad;
	}
}
