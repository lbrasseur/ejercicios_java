package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

import java.lang.reflect.Method;

/**
 * Desarrolle una clase de metadata que permita indicar informaci�n acerca de la
 * persona que desarroll� un m�todo dado. Investigue c�mo se podr�a desarrollar
 * un programa que busque en esta metadata para, por ejemplo, realizar un
 * reporte.
 *
 *
 */
public class Ejercicio30 {
	public static void main(String[] args) {
		/* Obtengo los m�todos de la clase por reflexi�n */
		for (Method m : EjemploAnotacion.class.getDeclaredMethods()) {
			/* Muestro el nombre del m�todo */
			System.out.println("Metodo: " + m.getName());

			if (m.isAnnotationPresent(Autor.class)) {
				/* Muestro informaci�n acerca del autor */
				Autor autor = m.getAnnotation(Autor.class);
				System.out.println("Autor: " + autor.apellido() + ", "
						+ autor.nombre());
				System.out.println("Nota del autor: " + autor.nota());
			} else {
				System.out.println("Sin informacion de autor");
			}

			System.out.println();
		}
	}
}
