package modulo3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Ejercicio2
		int variable=0;
		
		System.out.println("Introduce un número:\n");
		Scanner numero=new Scanner(System.in);
		variable=numero.nextInt();
		
		if (variable%2==0)
			System.out.println("el número introducido es un número PAR.");
		else
			System.out.println("el número introducido es un número IMPAR.");
		
		numero.close();
		

	}

}
