package Herencia;

public class Boton extends Componente{
	protected String texto;
	
	public Boton ( String nombre, int id, String texto) {
		super(nombre, id);
		this.texto = texto;
	}

	@Override
	public void renderizar() {
		super.renderizar();
		System.out.println(texto);
	}
	
	
}
