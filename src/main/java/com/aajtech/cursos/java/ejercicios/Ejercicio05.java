package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Agregue constructores y métodos sobrecargados para Numero (por ejemplo, para
 * double en lugar de int). Verificar en que caso se invoca cada uno, haciendo
 * prueba con literales de distintos tipos. Probar invocar un constructor desde
 * otro.
 * 
 *
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		/* Invoco al constructor que recibe un parámetro int */
		new Numero(123);

		/*
		 * Invoco al constructor que recibe un parámetro double. Notar que ese
		 * constructor llama al de parámetro int
		 */
		new Numero(456.789);
	}
}
