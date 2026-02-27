package Herencia;

import java.util.Objects;

public class Libro {
	protected String titulo;
	protected int ISBN;
	
	public Libro(String titulo, int ISBN) {
		this.titulo = titulo;
		this.ISBN = ISBN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + "]";
	}
	
	
	
	
}
