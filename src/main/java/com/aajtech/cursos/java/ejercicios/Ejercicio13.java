package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Pruebe que los campos de una interfaz son impl�citamente static y final.
 * Verifique tambi�n que todos los m�todos son autom�ticamente p�blicos.
 *
 *
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		/* Accedo al campo mensaje en forma est�tica */
		System.out.println(DatosEstaticos.mensaje);
	}
}

/**
 * Ejemplo de campos est�ticos en una interfaz
 *
 */
interface DatosEstaticos {
	String mensaje = "Hola, este es un campo estatico";
}
