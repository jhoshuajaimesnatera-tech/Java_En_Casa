package Basicos;

public class OrdenarTresNumeros {

	public static void main(String[] args) {
		// Vamos a definir los numeros desde aqui 
		int n1=7, n2=9, n3=2;
		
		// Esto es ineficiente ya que se podria hacer mejor con bucles

		if (n1>=n2 && n1>=n3) {
			if(n2>=n3) {
				System.out.println(n1 + "," + n2 + "," + n3);
			}else {
				System.out.println(n1 + "," + n3 + "," + n2);
			}
		}else if(n2>=n1 && n2>=n3) {
			if(n1>=n3) {
				System.out.println(n2 + "," + n1 + "," + n3);
			}else {
				System.out.println(n2 + "," + n3 + "," + n1);
			}
		}else {
			if(n1>=n2) {
				System.out.println(n3 + "," + n1 + "," + n2);
			}else {
				System.out.println(n3 + "," + n2 + "," + n3);
			}
		}
	}
}
