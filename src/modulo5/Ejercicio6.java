package modulo5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		String cadena;
		Boolean num=false;
		
		System.out.println("Introduce una cadena de caracteres(num�ricos y alfanum�ricos): ");
		System.out.println("\n");
		
		Scanner sc=new Scanner(System.in);
		cadena=sc.nextLine();
		
		num=cadena.matches(".*[0..9]*.");
		
		System.out.println("num: " + num);
		if (num=true)
			System.out.println("la cadena no contiene num�ricos");
		else
			System.out.println("la cadena contiene num�ricos");
		
		sc.close();

	}

}
