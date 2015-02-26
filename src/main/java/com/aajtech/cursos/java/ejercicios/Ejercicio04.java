package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Haga un arreglo de Numero y mostrar los valores con un ciclo for. Definir el
 * largo del arreglo basándose en un parámetro.
 *
 *
 */
public class Ejercicio04 {
	public static void main(String[] args) {
		int cantidadElementos;
		Numero[] numeros;

		/* Tomo el primer argumento y lo convierto en entero */
		cantidadElementos = Integer.parseInt(args[0]);

		/* Construyo el arreglo. Notar que la dimensión es dinámica */
		numeros = new Numero[cantidadElementos];

		/* Recorro el arreglo y le cargo objetos */
		for (int n = 0; n < numeros.length; n++) {
			/* Lo inicializo con un valor arbitrario n*2 */
			numeros[n] = new Numero(n * 2);
		}

		/* Recorro el arreglo muestro los valores */
		for (int n = 0; n < numeros.length; n++) {
			System.out.println("Elemento " + n + ": " + numeros[n]);
		}
	}
}
