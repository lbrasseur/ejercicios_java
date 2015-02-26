package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Escriba (heredando e Thread o implementando Runnable) una clase que muestre
 * una secuencia de n�meros por pantalla. Lance varios hilos simult�neos. Pruebe
 * el efecto de cambiar las prioridades en los hilos. Compare los resultados de
 * correr el mismo programa en distintos equipos.
 *
 *
 */
public class Ejercicio19 {
	public static void main(String[] args) {
		for (int n = 0; n < 5; n++) {
			/* Construyo el hilo */
			Thread t = new ThreadSimple();

			/* Le cambio la prioridad */
			t.setPriority(n + 1);

			/* Lo inicio */
			t.start();
		}

		System.out.println("Iniciados todos los hilos");
	}
}

/**
 * Ejemplo de hilo
 *
 *
 */
class ThreadSimple extends Thread {
	static int contadorHilos = 0;
	int esteHilo = ++contadorHilos;

	/**
	 * Constructor
	 *
	 */
	public ThreadSimple() {
		System.out.println("Creando " + esteHilo);
	}

	/**
	 * M�todo principal del hilo
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		for (int n = 0; n < 5; n++) {
			System.out.println("Hilo " + esteHilo + "(" + n + ")");
		}
	}
}
