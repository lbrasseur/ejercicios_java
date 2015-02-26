package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Haga una clase con métodos y datos estáticos (puede ser en la misma clase
 * Numero). Probar acceder y modificar los datos estáticos, desde distintas
 * instancias. Haga las mismas pruebas desde métodos estáticos. Intentar acceder
 * a un miembro no estático desde un método estático.
 *
 *
 */
public class Ejercicio06 {
	public static void main(String[] args) {
		/* Construyo 2 instancias distintas */
		PruebasEstaticos a = new PruebasEstaticos();
		PruebasEstaticos b = new PruebasEstaticos();

		/* Modifico la primera */
		a.valor = 123;

		/* Muestro los valores */
		System.out.println("Valor de a: " + a.valor);
		System.out.println("Valor de b: " + b.valor);

		/* Accedo directamente con el nombre de la clase */
		PruebasEstaticos.valor = 456;

		/* Muestro los valores */
		System.out.println("Valor de a: " + a.valor);
		System.out.println("Valor de b: " + b.valor);
	}
}

/**
 * Clase para hacer pruebas con miembros estáticos.
 *
 *
 */
class PruebasEstaticos {
	static int valor;
	int valorNoEstatico;

	static void metodoIncorrecto() {
		/*
		 * Acceder a miembros estáticos desde otros miembros estáticos es legal
		 */
		valor = 123;

		/*
		 * Acceder a miembros no estáticos desde miembros estáticos es ilegal.
		 * La siguiente línea no compila
		 */

		// valorNoEstatico = 123;
	}

	void metodoCorrecto() {
		/*
		 * Acceder a miembros estáticos desde miembros no estáticos es legal
		 */
		valor = 123;

		/*
		 * Acceder a miembros no estáticos desde otros miembros no estáticos
		 * también es legal
		 */
		valorNoEstatico = 123;
	}
}
