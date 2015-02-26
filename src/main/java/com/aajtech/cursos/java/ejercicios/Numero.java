package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Clase para almacenar un entero.
 *
 */
class Numero {
	/* Valor del n�mero */
	int valor;

	/**
	 * Constructor de objetos de tipo Numero.
	 * 
	 * @param valorInicial
	 *            El primer valor que se cargar� al n�mero.
	 */
	Numero(int valorInicial) {
		/*
		 * Asigno el valor del par�metro "valorInicial" a la propiedad "valor"
		 */
		valor = valorInicial;

		System.out.println("Construido Numero con parametro int "
				+ valorInicial);
	}

	/**
	 * Constructor de objetos de tipo Numero. Est� sobrecargado para recibir un
	 * double que es convertido a entero.
	 * 
	 * @param valorInicial
	 *            El primer valor que se cargar� al n�mero.
	 */
	Numero(double valorInicial) {
		/* Invoco al otro constructor */
		this((int) valorInicial);
		System.out.println("Construido Numero con parametro double "
				+ valorInicial);
	}

	/**
	 * Cambia el valor del n�mero.
	 * 
	 * @param nuevoValor
	 *            El nuevo valor a cargar.
	 */
	void cambiarValor(int nuevoValor) {
		/*
		 * Asigno el valor del par�metro "nuevoValor" a la propiedad "valor"
		 */
		valor = nuevoValor;
	}

	/**
	 * Devuelve una representaci�n en forma de String del objeto.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Numero-" + valor;
	}
}
