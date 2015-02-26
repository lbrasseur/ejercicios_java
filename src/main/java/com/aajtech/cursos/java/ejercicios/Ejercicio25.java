package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

/**
 * Utilice la estructura for-each para mostrar, por separado, las letras de cada
 * uno de los argumentos de la l�nea de comandos. Necesitar� hacer dos bucles
 * anidados. Realice el mismo desarrollo usando la forma convencional y compare
 * claridad de c�digo. Si resulta conveniente, use generics.
 *
 *
 */
public class Ejercicio25 {
	public static void main(String[] args) {
		/* Armo for-each anidados */
		for (String s : args) {
			System.out.println(s + ":");
			for (char c : s.toCharArray()) {
				System.out.println(" - " + c);
			}
		}
	}
}
