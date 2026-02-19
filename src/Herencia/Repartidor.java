package Herencia;

public class Repartidor extends Empleado {
	private String zona;
	
	public Repartidor(String nombre, Double salarioBase, String zona) {
		super(nombre, salarioBase);
		this.zona = zona;
	}

	@Override
	public double calcularSalario(double salarioBase) {
		if(this.zona.equals("zona 1")) {
			return super.calcularSalario(salarioBase) + 100;
		}else {
			return super.calcularSalario(salarioBase);
		}
	}
	
	
}
