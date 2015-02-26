package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Genere una interfaz e implem�ntela. Verifique c�mo el compilador fuerza a
 * implementar los m�todos. Implemente m�s de una interfaz a la vez. Prueba usar
 * referencias a interfaces.
 *
 *
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		/* Construyo un objeto de tipo "implementacion" */
		Implementacion objeto = new Implementacion();

		/* Lo asigno a referencias de las interfaces que implementa */
		InterfazUno uno = objeto;
		InterfazDos dos = objeto;

		/*
		 * S�lo se puede acceder a los m�todos declarados en la interfaz del
		 * tipo de la referencia
		 */
		uno.saludoUno();
		dos.saludoDos();

		/*
		 * Las siguientes lineas son ilegales, mas all� de que el objeto posea
		 * ambos m�todos
		 */

		// uno.saludoDos();
		// dos.saludoUno();
	}
}

/**
 * Ejemplo de interfaz
 *
 */
interface InterfazUno {
	void saludoUno();
}

/**
 * Segundo ejemplo de interfaz
 *
 */
interface InterfazDos {
	void saludoDos();
}

class Implementacion implements InterfazUno, InterfazDos {
	/**
	 * Muestra un saludo por pantalla. Si no se implementa este m�todo, la clase
	 * no compilar�, debido a que est� declarado en una de las interfaces que
	 * implementa. Notar que el m�todo debe ser p�blico.
	 */
	public void saludoUno() {
		System.out.println("Saludo uno desde " + getClass());
	}

	/**
	 * Idem anterior, para todas las intefaces implementadas
	 */
	public void saludoDos() {
		System.out.println("Saludo dos desde " + getClass());
	}
}
