package modulo3;

import java.util.*;
import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Ejercicio1
		int nota1=0;
		int nota2=0;
		int nota3=0;
		
		System.out.println("Introduce nota primer examen:");
		System.out.println("\n");
		Scanner s1=new Scanner(System.in);
		nota1=s1.nextInt();
		System.out.println("Introduce nota segundo examen:\n");
		System.out.println("\n");
		Scanner s2=new Scanner(System.in);
		nota2=s2.nextInt();
		System.out.println("Introduce nota tercer examen:\n");
		System.out.println("\n");
		Scanner s3=new Scanner(System.in);
		nota3=s3.nextInt();
		
		System.out.println("las notas del alumno son: ");
		System.out.println("\tprimer  examen: " + nota1);
		System.out.println("\tsegundo examen: " + nota2);
		System.out.println("\ttercer  examen: " + nota3);
		
		double promedio=(double)(nota1+nota2+nota3)/3;
		
		if (promedio>=7)
			System.out.println("El alumno ha aparobado con promedio: " + promedio);
	    else
	    	System.out.println("El alumno ha suspendido con promedio: " + promedio);
		
		s1.close();
		s2.close();
		s3.close();
		
		
	}

}
