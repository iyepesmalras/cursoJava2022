package modulo4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Ejercicio1
		int valor=0;
		int multiplica=0;
		
		System.out.println("Iroduzca un valor :\n");
		Scanner sc=new Scanner(System.in);
		valor=sc.nextInt();
		
		System.out.println("Vamos a calcular la tabla de multiplicar del " + valor);
		System.out.println("------------------------------------------------------");
		
		for (int i=0;i<=10;i++) {
			multiplica=valor*i;
			System.out.println(valor +" x " + i + " = " + multiplica);
		}
		
		sc.close();

	}

}
