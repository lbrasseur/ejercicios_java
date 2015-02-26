package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Capture un grupo de excepciones usando una clase base y varias excepciones
 * heredadas.
 *
 *
 */
public class Ejercicio17 {
	public static void main(String[] args) {
		try {
			/* Genero un n�mero aleatorio entre 0 y 1 */
			int nro = (int) (Math.random() * 2);

			if (nro == 0) {
				System.out.println("Lanzando UnaExcepcion");
				throw new UnaExcepcion();
			} else {
				System.out.println("Lanzando OtraExcepcion");
				throw new OtraExcepcion();
			}
		} catch (Exception e) {
			/*
			 * Capturo cualquiera de las dos excepciones con una clase base
			 * (Exception)
			 */
			System.out.println("Capturada excepcion de tipo " + e.getClass());
		}
	}
}

/**
 * Ejemplo de como definir una excepci�n nueva
 *
 */
class UnaExcepcion extends Exception {
}

/**
 * Ejemplo de como definir una excepci�n nueva
 *
 */
class OtraExcepcion extends Exception {
}
