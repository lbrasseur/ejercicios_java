package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Haga una clase con un m�todo que dispare excepciones. Pruebe capturarla con
 * un bloque try-catch. Pruebe no capturarla y hacer que sea relanzada
 * autom�ticamente (declar�ndola en throws). Verifique que el compilador obliga
 * a que se haga al menos una de estas dos cosas.
 *
 *
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		try {
			System.out.println("Invocando metodo reLanzarExcepcion()");
			reLanzarExcepcion();
			System.out.println("Finalizaci�n OK (esta linea no se ejecuta)");
		} catch (Exception e) {
			System.out
					.println("Ocurrio una excepccion con el siguiente mensaje:");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Ejemplo de m�todo que lanza excepciones
	 * 
	 * @throws Exception
	 *             A modo de ejemplo.
	 */
	static void lanzarExcepcion() throws Exception {
		/* Lanzo una excepci�n */
		throw new Exception("Este es el mensaje de error");
	}

	/**
	 * Ejemplo de m�todo que lanza excepciones
	 * 
	 * @throws Exception
	 *             A modo de ejemplo.
	 */
	static void reLanzarExcepcion() throws Exception {
		/*
		 * La excepxi�n lanzada por este m�todo es lanzada nuevamente, en forma
		 * autom�tica
		 */
		lanzarExcepcion();
	}
}
