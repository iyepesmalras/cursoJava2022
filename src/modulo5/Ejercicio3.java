package modulo5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ejercicio3
		String nombre;
		String apellido;
		String resultado;
		
		System.out.println("Introduce tu nombre: ");
		System.out.println("\n");
		Scanner sc=new Scanner(System.in);
		nombre=sc.nextLine();
		
		System.out.println("Introduce tu apellido: ");
		System.out.println("\n");
		Scanner sc1=new Scanner(System.in);
		apellido=sc1.nextLine();
		
		resultado=nombre.concat(" ").concat(apellido);
		
		System.out.println("resultado: " + resultado);
		
		sc.close();
		sc1.close();

	}

}
