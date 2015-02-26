package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Herede una interfaz de otra y �sela mediante una referencia a la interfaz
 * base.
 *
 *
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		/*
		 * Construyo un objeto de tipo "ImplementacionInterfacesHeredadas"
		 */
		InterfazHijo hijo = new ImplementacionInterfacesHeredadas();
		InterfazPadre padre = hijo;

		/* Desde Hijo puedo invocar los dos m�todos */
		hijo.saludoPadre();
		hijo.saludoHijo();

		/* Desde Padre, s�lo los m�todos que �sta define */
		padre.saludoPadre();

		// padre.saludoHijo();
	}
}

/**
 * Ejemplo de interfaz base
 *
 */
interface InterfazPadre {
	void saludoPadre();
}

/**
 * Ejemplo de interfaz heredada
 *
 */
interface InterfazHijo extends InterfazPadre {
	void saludoHijo();
}

class ImplementacionInterfacesHeredadas implements InterfazHijo {
	/**
	 * Muestra un saludo por pantalla. Si no se implementa este m�todo, la clase
	 * no compilar�, debido a que est� declarado en una de las interfaces que
	 * implementa. Notar que el m�todo debe ser p�blico.
	 */
	public void saludoHijo() {
		System.out.println("Saludo hijo desde " + getClass());
	}

	/**
	 * Idem anterior, para todas las superintefaces de la interfaz implementada
	 */
	public void saludoPadre() {
		System.out.println("Saludo padre desde " + getClass());
	}
}
