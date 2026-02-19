package Herencia;

public class AppEmpleado {

	public static void main(String[] args) {
		// repartidores
		
		Repartidor r1 = new Repartidor("Pepe", 1000.00, "zona 1");
		Repartidor r2 = new Repartidor("Juan", 1100.00, "zona 2");
		
		r1.getEmpleadoInfo();
		r2.getEmpleadoInfo();
		
		// comerciales
		
		Comercial c1 = new Comercial("Ana", 1200.00, 300.00);
		Comercial c2 = new Comercial("Eva", 1000.00, 600.00);
		
		c1.getEmpleadoInfo();
		c2.getEmpleadoInfo();
	}

}
