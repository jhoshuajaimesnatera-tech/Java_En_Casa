package Enemigos;

import Herencia.Guerrero;

public class Villano {
	protected String nombre;
	protected int vida;
	
	public Villano (String nombre, int vida) {
		this.nombre = nombre;
		this.vida = vida;
	}
	
	public void hacerDanio(Guerrero g) {
	// no puede ralizar esta accion ya que no cuenta con la herencia 
	//	g.salud = 0;
	}
}
