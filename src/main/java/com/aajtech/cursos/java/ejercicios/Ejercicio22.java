package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */
import java.util.*;

/**
 * Escribir un programa que permita almacenar y buscar personas en un Map
 * utilizando como clave el n�mero de documento. Probar cambiar la
 * implementaci�n del Map.
 *
 *
 */
public class Ejercicio22 {
	public static void main(String[] args) {
		/* Declaro un Map */
		Map personas;

		/*
		 * Construyo una instancia. Notar que se puede cambiar la
		 * implementaci�n, tal como muestan las lineas comentadas, sin tocar el
		 * resto del c�digo
		 */
		personas = new HashMap();

		// personas = new TreeMap();

		/* Cargo datos */
		personas.put("20565186", "Pepe Sanchez");
		personas.put("24592214", "Lautaro Brasseur");
		personas.put("19563216", "Isidoro Ca�ones");
		personas.put("16931467", "Inodoro Pereyra");

		/* Busco un dato por la clave */
		System.out.println(personas.get("24592214"));
	}
}
