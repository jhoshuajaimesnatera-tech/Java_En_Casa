package TresEnRaya;

import java.util.Scanner;

public class TresEnRayaMisery extends JuegoDeTablero{
 
	public TresEnRayaMisery (String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}

 
	public void inicio () {
		Scanner sc = new Scanner(System.in);
		boolean finPartida = false;
 
		while (!finPartida) {
			mostrarTurno();
			realizarJugada();

			//comprobar si hemos terminado
			if (tablero.hayGanador()) {
				tablero.mostrar();
				cambiarTurno();
				System.out.println("Enhorabunea " + jugadorActivo.getNombre() + " has ganado");
			} else if (tablero.hayEmpate()) {
				tablero.mostrar();
				System.out.println("Empate!! no quedan movimientos");
			} else {
				//cambio de jugador
				cambiarTurno();
			}
		}
 
		sc.close();
	}
 
} 
