package dataTypes;

import java.util.Arrays;

public class DatosEstructurados {

	public static void main(String[] args) {
		
		/* 
		 Datos estructurados:
		 
		 Son datos complejos que almacenan caracteres y/o cadenas de caracteres, o bien, algún tipo de dato primitivo
		 
		 	- String: Cadena de caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String.
		 	Los Strings en Java se consideran Objetos
		 	
		 	- Arrays
		 	
		 	
		 	- Creados por el usuario (API JAVA)
		 	
		 	
		*/
		
		String myString = "Hola, soy un String";
		System.out.println(myString);
		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/*
		 Métodos para String
		   - String length: Método que permite medir la longitud de una cadena de caracteres
		 */
		
		String texto = "AsJgjnoLÑq";
		// String.length. Método que permite medir la longitud de una cadena de caracteres
		System.out.println("La longitud de la variable texto de tipo String es: " + texto.length());
		
		/*
		 Guardando la variable texto en una nueva variable de tipo int para pasarle el método length.
		 int metodoLength = texto.length();
		  -- Output: 10
		  Imprimimos en consola la nueva variable
		  System.out.println(metodoLength);
		 */
		
		
		// -- Sttring: toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el método toUpperCase: " +  upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el método toLowerCase: " +  lowerCase);
		
		// -- indexOff(). Devuelve el índice de la primera aparición de un texto específico
		String fraseMotivicional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivicional.indexOf("temporal"); //8
		System.out.println("La palabra 'temporal' inicia en el índice: " + indexOf);
		
		// -- Concatenación
		String firstName = "Daniel ";
		String lastName = "Maldonado";
		
		String userNAme = firstName + " " +  lastName;
		System.out.println(userNAme);
		
		System.out.println(firstName.concat(lastName));
		
		// -- Métodos de conversión (parseo)
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());
		
		
		//Parseado de presupuesto a tipo Double
		System.out.println("***Parseado a tipo Double***");
		double parseado = Double.parseDouble(presupuesto);
		System.out.println("Aplicando parseDouble, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseado + " que ahora es de tipo " + ((Object)parseado).getClass().getSimpleName());
		
		/*
		 Arrays:
		 
		 Conocidos como arreglos, se trata de una colección de datos del mismo tipo, donde cada elemento corresponde a una posición identificada por índices´numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz
		 */
		
		String[] cars = {"Volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars);
		System.out.println(Arrays.toString(cars));
		
		
		
		/*
		 Variables por tipo de declaración
		 
		 	- Variables dinámicas:
		 	Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 	
		 	- Variables constantes o finales:
		 	Su valor no puede modificarse.
		 	
		 	- Varibles literales (palabras reservadas):
		 	Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java
		 */
		
		//Variables dinámicas
		float gastosMensauales = 35684.30f;
		System.out.println(gastosMensauales);
		
		gastosMensauales = 42699.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensauales);
		
		//Variables finales o constantes
		final int SALARIO = 15000;
		System.out.println(SALARIO);
		
		
		
	}//main

}//class
