package MaquinaExpendedora;

public class Productos {
	protected String nombre;
	protected double precio;
	protected int cantidad;
	
	protected Productos(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	protected void vender() {
		if(cantidad>0) {
			cantidad--;
			System.out.println("Disfruta tu " + this.nombre);
		}else {
			System.out.println("Lo sentimos el producto esta agotado");
		}
	}

	@Override
	public String toString() {
		return "Producto:" + nombre + ", Precio:" + precio + ", Stock:" + cantidad;
	}

	public String getNombre() {
		return nombre;
	}

}
