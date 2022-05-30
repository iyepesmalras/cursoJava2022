package modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Ejercicio2
		byte 	bytemin=-128;
		byte 	bytemax= 127;
		short 	shortmin=-32768;
		short 	shortmax=32767;
		int		intmin=-2147483648;
		int		intmax=2147483647;
		long	longmin=-9223372036854775808L;
		long	longmax=9223372036854775807L;
		
		System.out.println("Tipos de dato\t\t\tmínimo\t\t\tmáximo.");
		System.out.println("-------------\t\t\t------\t\t\t---------");
		System.out.println("byte\t\t\t\t" + bytemin + "\t\t\t" + bytemax);
		System.out.println("short\t\t\t\t" + shortmin + "\t\t\t" + shortmax);
		System.out.println("int\t\t\t\t" + intmin + "\t\t" + intmax);
		System.out.println("long\t\t\t\t" + longmin + "\t" + longmax);
	}

}
