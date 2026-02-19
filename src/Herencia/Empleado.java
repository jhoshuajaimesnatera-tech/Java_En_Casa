package Herencia;

public class Empleado {
	protected String nombre;
	protected double salarioBase;
	
	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario(double salarioBase) {
		return salarioBase;
	}


	public void getEmpleadoInfo() {
		System.out.println("Nombre: " + nombre + " Salario: " + calcularSalario(salarioBase));
	}
	
}
