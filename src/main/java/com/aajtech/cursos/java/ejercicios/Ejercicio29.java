package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

import com.aajtech.cursos.java.ejercicios.nro29.OtraClase.InternaDos;
import com.aajtech.cursos.java.ejercicios.nro29.OtraClase.InternaUno;

/**
 * Defina una clase con clases internas estaticas (públicas). Importelas desde
 * otra clase usando importacion estatica. Compare esta aproximacion con el uso
 * de paquetes.
 *
 *
 */
public class Ejercicio29 {
	public static void main(String[] args) {
		/*
		 * Declaro dos variables de tipos de clases internas importadas. Notar
		 * que si se quita la importación, las clases no son visibles. Además,
		 * las clases importadas deben estan en un paquete.
		 */
		InternaUno uno = new InternaUno();
		InternaDos dos = new InternaDos();
	}
}
