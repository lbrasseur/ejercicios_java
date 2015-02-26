package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */
import java.io.*;

/**
 * Verifique que los m�todos redefinidos por medio de herencia no pueden lanzar
 * excepciones que el ancestro no lanza.
 *
 *
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		new HijoExcepcion().saludo();
	}
}

/**
 * Clase desde la cual se heredar�
 *
 *
 */
class PadreExcepcion {
	/**
	 * Muestra un saludo por pantalla
	 */
	void saludo() throws FileNotFoundException {
		System.out.println("Saludo desde PADRE");
	}
}

/**
 * Subclase
 *
 *
 */
class HijoExcepcion extends PadreExcepcion {
	/**
	 * Muestra un saludo por pantalla. Redefine el m�todo de la clase Padre
	 */
	void saludo()
	/* La siguiente l�nea es ilegal */

	// throws EOFException
	{
		System.out.println("Saludo desde HIJO");
	}
}
