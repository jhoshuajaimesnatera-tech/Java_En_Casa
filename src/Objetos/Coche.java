package Objetos;

public class Coche {
	private String marca;
	private String modelo;
	private int velocidad;
	
	public Coche (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = 0;
	}
	
	public void getInfoCoche() {
		System.out.println("marca del coche: " + marca + " modelo: " + modelo + " y tiene una velocidad actual de:" + velocidad + "Km/h");
	}

	public void acelerar(int aceleracion) {
		this.velocidad += aceleracion;
		
		System.out.println("Esta es la nueva velocidad: " + velocidad);
	}
	
	public void frenar(int reduccion) {
		if(this.velocidad==0) {
			System.out.println("No se puede frenar ya el auto esta detenido");
		}else if (reduccion >= this.velocidad){
			this.velocidad=0;
			System.out.println("El aouto se detuvo");
		}else {
			this.velocidad-= reduccion;
			System.out.println("Se redujo la velocidad a: " + velocidad +"Km/h");
		}
	}
	
}
