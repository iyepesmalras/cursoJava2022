package modulo3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Ejercicio5
		
		int categoria;
		
		System.out.println("Introduce posición en el torneo:\n");
		Scanner sc=new Scanner(System.in);
		categoria=sc.nextInt();
		
		if (categoria==1)
			System.out.println("Medalla de oro");
		else if (categoria==2)
			System.out.println("Medalla de plata");
		else if (categoria==3)
			System.out.println("Medalla de bronce");
		else
			System.out.println("Siga participando");
		
		sc.close();

	}

}
