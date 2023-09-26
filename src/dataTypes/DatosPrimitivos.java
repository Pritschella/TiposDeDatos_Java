package dataTypes;

public class DatosPrimitivos {

	public static void main(String[] args) {


		/*
		 Datos primitivos. 
		 Datos fundamentales en Java que sriven para 
		 gestionar los tipos de información más básicos

		 Existen 8 tipos de datos primitivos:
		 byte, short, int, long, float, double,
		 boolean, char.
		 */

		//Para autocompletar
		/*System.out.println(); //sysout + ctrl + space
		System.out.println(); //syso + ctrl + space */


		//BYTE ValorMínimo y ValorMáximo
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("----- Byte -----");
		System.out.println("El valor mínimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);

		
		//short. ValorMínimo y ValorMáximo
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("----- Short -----");
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " +  maxShort);
		
		//char. VMín y Vmax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("----- Char -----");
		System.out.println("El valor mínimo de Character es: " + minChar);
		System.out.println("El valor máximo de Character es: " + maxChar);
		
		//int. VMin y Vmax
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("----- Int -----");
		System.out.println("El valor mínimo de Integer es: " + minInt);
		System.out.println("El valor mínimo de Integer es: " + maxInt);
		
		
		//Tipo de dato Long
		long isbn = 9788499169019L;
		System.out.println("----- Long -----");
		System.out.println(isbn);
		//long. Vmin y Vmax
		long  minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de Long es: " + minLong);
		System.out.println("El valor máximo de Long es: " + maxLong);
		
		//Tipo de dato float
		float salary = 15000f;
		System.out.println("----- Float -----");
		System.out.println(salary);
		//float. Vmin y Vmax
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de Float es: " + minFloat);
		System.out.println("El valor máximo de Float es: " + maxFloat);
	
		
		//Tipo de dato double
		double ISR = 1239.45d;
		System.out.println("----- Double -----");
		System.out.println(ISR);
		//double. Vmin y Vmax
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de Double es: " + minDouble);
		System.out.println("el valor máximo de Double es: " + maxDouble);
		
		System.out.println("********************************************");
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/*Casteo (Conversión de tipos en Java).
		 	- Autompático (dato más pequeño  a un dato más grande)
		 	- Manual (Tipo de dato más grande a tipo de dato más pequeño)
		  
		 */
		
		System.out.println("*********************");
		System.out.println("Casteo automático:");
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//Casteo Manual
		int myNewCasting = (int) myCasting;
		System.out.println("***** Casteo Manual *****");
		System.out.println(myNewCasting);
		
		
		//Convertir de float a int
		System.out.println("Conversión de float a int");
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversión 
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir de char a int
		System.out.println("Convertir de char a int");
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		

	}

}
