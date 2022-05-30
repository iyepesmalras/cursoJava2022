package modulo5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio4
		String cadena;
		int contadorVocales=0;
		int contadorConsonantes=0;
		
		System.out.println("Introduce una cadena de caracteres: ");
		System.out.println("\n");
		
		Scanner sc=new Scanner(System.in);
		cadena=sc.nextLine();
		cadena=cadena.toUpperCase();
		
		for(int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i) =='A' ||
				cadena.charAt(i) =='E' ||	
				cadena.charAt(i) =='I' ||	
				cadena.charAt(i) =='O' ||	
				cadena.charAt(i) =='U')
				contadorVocales++;	
			else if (cadena.charAt(i)!=' ')
				contadorConsonantes++;
		}
		
		System.out.println("La cadena contiene " + contadorVocales + " vocales y " + contadorConsonantes + " consonantes");
		
		sc.close();

	}

}
