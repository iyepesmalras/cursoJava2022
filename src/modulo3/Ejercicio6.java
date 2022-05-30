package modulo3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		
		int curso;
		
		System.out.println("Introduzca edad:\n");
		Scanner sc=new Scanner(System.in);
		curso=sc.nextInt();
		
		if (curso==0)
			System.out.println("Jardín de infantes");
		else if (curso<=6)
			System.out.println("Primaria");
		else if (curso<=12)
			System.out.println("Secundaria");
		else
			System.out.println("No existen cursos para esa edad");
		
		sc.close();

	}

}
