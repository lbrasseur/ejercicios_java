package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Escriba una clase con una afirmaci�n (assertion). Provoque condiciones para
 * que la misma produzca un error. Pruebe el efecto de correr el c�digo con
 * error sin habilitar las afirmaciones.
 *
 *
 */
public class Ejercicio23 {
	public static void main(String[] args) {
		/* Declaro un entero y lo inicializo */
		int dato = 3;

		/*
		 * Afirmo que deber�a ser menor a 6. Recordar compilar con opci�n
		 * -source 1.4 y ejecutar con opci�n -ea
		 */
		assert (dato < 6);
		System.out.println("Hasta aca llego");

		/* Afirmo que deber�a ser menor a 3 */
		assert (dato < 3);
		System.out.println("Hasta aca tambien");
	}
}
