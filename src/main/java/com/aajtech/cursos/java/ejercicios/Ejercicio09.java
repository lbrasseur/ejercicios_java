package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */
/* Tambien se podria usar:
 * import com.aajtech.cursos.cursos.java.ejercicios.nro09.*; */
import com.aajtech.cursos.java.ejercicios.nro09.EjemploPaquete;

/**
 * Genere una clase que est� dentro de un paquete y �sela desde una clase de
 * otro paquete.
 *
 *
 */
public class Ejercicio09 {
	public static void main(String[] args) {
		/*
		 * Construyo un objeto de una clase pertenciente a otro paquete
		 */
		EjemploPaquete objeto = new EjemploPaquete();

		/* Invoco al m�todo */
		objeto.saludo();
	}
}
