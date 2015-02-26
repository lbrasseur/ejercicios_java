package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

/**
 * Utilice generics para hacer un programa que muestre por pantalla la longitud
 * de los argumentos de la l�nea de comandos, sin necesidad de aplicar una
 * operaci�n de molde.
 *
 *
 */
public class Ejercicio24 {
	public static void main(String[] args) {
		/* Declaro una lista de Strings */
		List<String> argumentos = new LinkedList<String>();

		/* Copio los argumentos a la lista */
		for (int n = 0; n < args.length; n++) {
			argumentos.add(args[n]);
		}

		/* Muestro las longitudes reocrriendo la lista */
		System.out.println("Con iterador");
		Iterator<String> i = argumentos.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(" - " + s + " tiene una longitud de "
					+ s.length());
		}

		/* Ahora con for-each */
		System.out.println("Con for-each");
		for (String s : argumentos) {
			System.out.println(" - " + s + " tiene una longitud de "
					+ s.length());
		}
	}
}
