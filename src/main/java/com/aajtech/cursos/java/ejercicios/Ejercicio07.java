package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Experimente con la herencia: herede una clase de otra y redefina m�todos.
 * Haga una referencia a una clase base y pruebe crear objetos de esa clase y de
 * clases heredadas. Vea qu� m�todo se invoca en cada caso.
 *
 *
 */
public class Ejercicio07 {
	public static void main(String[] args) {
		/* Creo una referencia a la clase Padre */
		Padre objeto;

		/* Lo construyo como objeto de tipo Hijo */
		objeto = new Hijo();

		/*
		 * Invoco a saludo(). Notar que invoca el m�todo de la clase Hijo
		 */
		objeto.saludo();
	}
}

/**
 * Clase desde la cual se heredar�
 *
 *
 */
class Padre {
	/**
	 * Muestra un saludo por pantalla
	 */
	void saludo() {
		System.out.println("Saludo desde PADRE");
	}
}

/**
 * Subclase
 *
 *
 */
class Hijo extends Padre {
	/**
	 * Muestra un saludo por pantalla. Redefine el m�todo de la clase Padre
	 */
	void saludo() {
		System.out.println("Saludo desde HIJO");
	}
}
