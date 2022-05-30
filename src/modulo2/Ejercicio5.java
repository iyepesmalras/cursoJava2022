package modulo2;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Ejercicio5
		short s=25;
		int  i=1200;
		long l=0;
		
		byte b=0;
		
		b=(byte)s;
		l=i;
		b=(byte)i;
		s=(short)i;
		
		
		System.out.println("Debemos castear a byte si queremos mover \'s\' sobre \'b\' " + "valor de b:" + b);
		System.out.println("No debemos castear a long si queremos mover \'i\' sobre \'l\' " + "valor de l:" + l);
		System.out.println("Debemos castear a byte si queremos mover \'i\' sobre \'b\' " + "valor de b:" + b);
		System.out.println("Debemos castear a short si queremos mover \'i\' sobre \'s\' " + "valor de s:" + s);

	}

}
