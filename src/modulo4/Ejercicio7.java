package modulo4;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Ejercicio7
		
		double antiguedad=0;
		double categoria=0;
		int intAntiguedad=0;
		int intCategoria=0;
		double sueldo=0.00;
		char valCategoria;
		double bonus=0.00;
		double porcentaje=0.00;
		double sueldoAnual=0.00;
		
		do {
			
			antiguedad=Math.random()*100;
			categoria=Math.random()*10;
			sueldo=(double)Math.random()*100000;
			intAntiguedad=(int)antiguedad;
			intCategoria=(int)categoria;
			
			System.out.println("nuevo calculo sueldo neto");
			System.out.println("-------------------------");
			
			switch(intCategoria) {
			case 1:
				valCategoria='A';
				bonus=1000.00;
				break;
			case 2:
				valCategoria='B';
				bonus=2000.00;
				break;
			case 3:
				valCategoria='C';
				bonus=3000.00;
				break;
			default:
				valCategoria=' ';
				bonus=0.00;
				System.out.println("categoria no existente: " + valCategoria);
			}
			
			if(intAntiguedad>=1&&intAntiguedad<=5)
				porcentaje=0.05;
			else if (intAntiguedad>=6&&intAntiguedad<=10)
				porcentaje=0.10;
			else 
				porcentaje=0.30;	
			
			sueldo=Math.round(sueldo*100)/100d;
			System.out.println("porcentaje: " + porcentaje);
			System.out.println("bonus: " + bonus);
			System.out.println("sueldo: " + sueldo);
			
			sueldoAnual = sueldo + porcentaje*sueldo + bonus;
			sueldoAnual=Math.round(sueldoAnual*100)/100d;
			
		
			if (intCategoria>=1&&intCategoria<=3)
				System.out.println("El sueldo neto anual es: " + sueldoAnual + " €\n");
			else
				System.out.println("No es posible calcular su sueldo neto\n");
					
		}while(intCategoria>3||intCategoria<1);
		
		

	}

}
