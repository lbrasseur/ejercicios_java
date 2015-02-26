package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Construya una clase con datos y m�todos miembro que sean public, private,
 * protected y "friendly". Cree un objeto de esta clase y vea que tipo de
 * errores de compilador obtiene cuando intenta acceder a todos los miembros de
 * la clase. Tenga en cuenta que las clases del mismo directorio son parte del
 * mismo paquete "por defecto".
 * 
 *
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		EjemploAccesos accesos = new EjemploAccesos();

		/*
		 * Intento mostrar los campos. Todos son accesibles, excepto el privado.
		 */
		// System.out.println(accesos.privado);
		System.out.println(accesos.paquete);
		System.out.println(accesos.protegido);
		System.out.println(accesos.publico);
	}
}

/**
 * Clase con ejemplos de los distintos especificadores de acceso
 * 
 *
 */
class EjemploAccesos {
	private String privado = "Dato con acceso privado";
	String paquete = "Dato con acceso de paquete (friendly)";
	protected String protegido = "Dato con acceso protegido";
	public String publico = "Dato con acceso publico";
}