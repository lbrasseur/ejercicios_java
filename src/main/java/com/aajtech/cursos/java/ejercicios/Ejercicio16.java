package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Verifique la salida mostrando mensajes en el catch y en el finally. Compruebe
 * que finally se llama siempre, aunque hay un return dentro del bloque try o
 * aunque no ocurra ninguna excepci�n.
 *
 *
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		try {
			/* Genero un n�mero aleatorio entre 0 y 2 */
			int nro = (int) (Math.random() * 3);

			if (nro == 0) {
				/* No hago nada */
				System.out.println("0: Proceso normal");
			} else if (nro == 1) {
				/* Lanzo una excepci�n */
				System.out.println("1: Excepcion");
				throw new Exception();
			} else if (nro == 2) {
				/* Retorno */
				System.out.println("2: Retorno");

				return;
			}

			System.out.println("Paso por final del codigo");
		} catch (Exception e) {
			System.out.println("Paso por catch");
		} finally {
			System.out.println("Paso por finally");
		}

		System.out.println("Paso fuera del bloque try-catch");
	}
}
