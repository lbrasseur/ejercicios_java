package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

import java.util.List;
import java.util.LinkedList;

/**
 * Pruebe colocar un valor de tipo int en alg�n tipo de colecci�n y extraerlo,
 * sin aplicar operaciones de molde.
 *
 *
 */
public class Ejercicio26 {
	public static void main(String[] args) {
		/* Declaro y construyo una lista */
		List<Integer> lista = new LinkedList<Integer>();

		/* Agrego un entero a la lista */
		lista.add(123);

		/* Lo extraigo y lo almaceno en un int */
		int i = lista.get(0);

		/* Lo muestro */
		System.out.println("Valor: " + i);
	}
}
