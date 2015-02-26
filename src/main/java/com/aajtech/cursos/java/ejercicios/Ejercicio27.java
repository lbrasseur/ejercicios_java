package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

/**
 * Defina dos enumeraciones distintas (del tema que le parezca apropiado).
 * Intente hacer una asignaci�n de un valor enumerado a una variable de otro
 * tipo enumerado. Agregue m�todos a una de las enumeraciones y compruebe que se
 * comporta como una clase com�n.
 *
 *
 */
public class Ejercicio27 {
	/* Declaro una variable de tipo Simpson */
	enum Simpson {
		BART, LISA, MAGGIE, HOMERO, MARGE;

		public void saludo() {
			System.out.println("Hola, yo soy " + this);
		}
	};

	enum Shrek {
		SHREK, FIONA, BURRO
	};

	public static void main(String[] args) {
		/* Declaro una variable de tipo Simpson */
		Simpson personaje;

		/* Esto no funciona */
		// personaje = Shrek.BURRO;

		/* Esto si */
		personaje = Simpson.HOMERO;

		/* Invoco a un m�todo */
		personaje.saludo();
	}
}
