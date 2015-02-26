/*
 * Archivo creado el 04/12/2003
 */
package com.aajtech.cursos.java.ejercicios.nro09;

/**
 * Ejemplo de cómo definir una clase dentro de un paquete
 *
 */
public class EjemploPaquete {
	/**
	 * Muestra un saludo por pantalla. El método debe ser público, para que
	 * pueda ser accedido desde fuera del paquete.
	 */
	public void saludo() {
		System.out.println("Saludo desde " + getClass());
		System.out.println("en " + getClass().getPackage());
	}
}
