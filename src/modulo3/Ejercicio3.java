package modulo3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ejercicio3
		String mes;
		int dias=0;
		Boolean error=false;
		
		System.out.println("Introduce un mes:\n");
		Scanner sc=new Scanner(System.in);
		mes=sc.nextLine();
		mes=mes.toUpperCase();
		
		System.out.println("el mes introducido es: " + mes);
		
		switch(mes){
		case "ENERO":
				dias=31;
			break;
		case "FEBRERO":
			dias=28;
			break;
		case "MARZO":
			dias=31;
			break;
		case "ABRIL":
			dias=30;
			break;
		case "MAYO":
			dias=31;
			break;
		case "JUNIO":
			dias=30;
			break;
		case "JULIO":
			dias=31;
			break;
		case "AGOSTO":
			dias=31;
			break;
		case "SEPTIEMBRE":
			dias=30;
			break;
		case "OCTUBRE":
			dias=31;
			break;
		case "NOVIEMBRE":
			dias=30;
			break;	
		case "DICIEMBRE":
			dias=31;
			break;
		default:
			System.out.println("Error al introducir el mes");
			error=true;
		}
		
		if(error==false)
			System.out.println("El mes introducido es " + mes + " y este mes tiene " + dias + " dias");
		
		sc.close();

	}

}
