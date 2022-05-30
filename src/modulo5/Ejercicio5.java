package modulo5;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Ejercicio5
		String email="gcasas1972@gmail.com";
		int posicion=0;
		String [] partes;
		
		posicion=email.indexOf('@');
		
		System.out.println("Apartado A");
		if (posicion!=-1) 
			System.out.println("La \'@\' se encuentra en la posición; " + posicion);
		else 
			System.out.println("No se encuentra \'@\' en el texto");
		
		
		System.out.println("\nApartado B");
		System.out.println("Split del mail");
		System.out.println("--------------");
		partes=email.split("@");
		
		System.out.println("Primera parte: " + partes[0]);
		System.out.println("Segunda parte: " + partes[1]);
		
	}

}
