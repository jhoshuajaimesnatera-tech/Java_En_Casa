package Herencia;

public class Guerrero extends Personaje {
	
	public Guerrero(String nombre, int salud) {
		super(nombre, salud);
	}
	
	public int usaEscudo() {
		return this.salud +=20;
	}
}
