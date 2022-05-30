package modulo3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio4
		char categoria;

		
		System.out.println("Introduce una catergoría (valores permitidos 'a','b','c':\n");
		Scanner sc=new Scanner(System.in);
		categoria=sc.next().charAt(0);
		
		if (categoria!='a'&&categoria!='b'&&categoria!='c')
			System.out.println("error al introducir categoria");

		
		if (categoria=='a')
			System.out.println("Categoría corresponde a HIJO");
		else if (categoria=='b')
			System.out.println("Categoría corresponde a PADRES");
		else
			System.out.println("categoría corresponde a ABUELOS");
			
			
			
		sc.close();

	}

}
