package modulo4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		char categoria;
		int antiguedad=0;
		double sueldo=0.00;
		double porcentaje=0.00;
		int bonus=0;
		double sueldoAnual=0;
		
		System.out.println("Introduzca categoría ('A','B','C':\n");
		Scanner sc=new Scanner(System.in);
		categoria=sc.next().charAt(0);
		
		System.out.println("Introduzca antigüedad en años:\n");
		Scanner sc1=new Scanner(System.in);
		antiguedad=sc1.nextInt();

		System.out.println("Introduzca sueldo anual:\n");
		Scanner sc2=new Scanner(System.in);
		sueldo=sc2.nextDouble();
		
		//obtenemos porcentaje por antiguedad
		if(antiguedad>=1&&antiguedad<=5)
			porcentaje=0.05;
		else if (antiguedad>=6&&antiguedad<=10)
			porcentaje=0.10;
		else 
			porcentaje=0.30;
		
		//Obtenemos bonus por categoria
		if (categoria=='A')
			bonus=1000;
		else if (categoria=='B')
			bonus=2000;
		else
			bonus=3000;
		
		sueldoAnual= sueldo + (porcentaje*sueldo) + bonus;
		System.out.println("El sueldo neto anual es " + sueldoAnual + bonus + " €");
				
		sc.close();	
		sc1.close();
		sc2.close();
	}

}
