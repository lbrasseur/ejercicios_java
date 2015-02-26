package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Defina una clase Numero que almacene un entero. Deberá tener un constructor
 * que reciba como argumento un entero primitivo y un método para cambiar dicho
 * valor. Definirle un método toString() para visualizar el valor. Verificar que
 * si tenemos 2 referencias apuntando al mismo objeto (alias), al modificar una,
 * modificamos la otra.
 *
 *
 */
public class Ejercicio03 {
	public static void main(String[] args) {
		/*
		 * La clase Numero está definida en el archivo Numero.java, porque se
		 * usa desde varios ejercicios y resulta más claro definirla así, pero
		 * podría estar definida en este mismo archivo
		 */
		Numero a;
		Numero b;

		/* Construyo un objeto, pas�ndole como valor inicial 123 */
		a = new Numero(123);

		/*
		 * Lo muestro por pantalla. Notar que el método toString se invoca
		 * automáticamente al concatenar un objeto con un String
		 */
		System.out.println("a vale: " + a);

		/*
		 * Provoco el efecto "aliasing" (más de una referencia apuntando al
		 * mismo objeto)
		 */
		b = a;

		/* Modifico el segundo */
		b.cambiarValor(456);

		/* Muestro el valor de b */
		System.out.println("b vale: " + b);

		/* Muestro el valor de a, para ver que también cambió */
		System.out.println("ahora a vale: " + a);
	}
}
