package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Haga una clase abstracta con m�todos abstractos. Verifique que el compilador
 * exige que al heredar se escriban los m�todos declarados como abstractos.
 * Verifique tambi�n que no pueden crearse objetos de una clase abstracta (y que
 * s� se puede usar una referencia a una clase abstracta).
 *
 *
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		/* Declaro una referencia a la clase base (abstracta) */
		PadreAbstracto objeto;

		/*
		 * La siguiente l�nea es ilegal, debido a que no se pueden instanciar
		 * clases abstractas
		 */
		// objeto = new PadreAbstracto();

		/* Esta es la forma correcta */
		objeto = new HijoConcreto();

		/* Invoco al m�todo */
		objeto.saludo();
	}
}

/**
 * Ejemplo de clase abstracta
 *
 */
abstract class PadreAbstracto {
	abstract void saludo();
}

class HijoConcreto extends PadreAbstracto {
	/**
	 * Muestra un saludo por pantalla. Si no se implementa este m�todo, la clase
	 * no compilar�, debido a que est� declarado como abstracto en la
	 * superclase.
	 */
	void saludo() {
		System.out.println("Saludo desde " + getClass());
	}
}
