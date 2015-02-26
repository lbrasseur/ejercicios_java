package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

/**
 * Escriba un m�todo con argumentos variables que muestre por pantalla la
 * cantidad de argumentos. Verifique que el mismo m�todo puede invocarse tanto
 * con argumentos variables como con un arreglo.
 *
 *
 */
public class Ejercicio28 {
	public static void main(String[] args) {
		/* Invoco con un arreglo */
		argumentosVariables("Con un arreglo", new String[] { "esto", "es",
				"un", "arreglo" });

		/* Invoco con lista de par�metros */
		argumentosVariables("Con lista de parametros", "esto", "es", "con",
				"lista", "de", "parametros");
	}

	public static void argumentosVariables(String titulo, String... args) {
		/* Muestro el t�tulo */
		System.out.println(titulo);

		/* Muestro los argumentos variables */
		for (String s : args) {
			System.out.println("Argumento: " + s);
		}
	}
}
