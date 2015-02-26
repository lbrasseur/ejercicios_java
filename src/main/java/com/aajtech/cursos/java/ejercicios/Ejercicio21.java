package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */
import java.util.*;

/**
 * Escriba una rutina que inserte objetos de tipo String en una colecci�n List
 * en orden alfab�tico. Notar que String implementa Comparable. Empezar con una
 * implementaci�n ArrayList o Vector y luego cambiar a LinkedList.
 *
 *
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		/* Declaro la lista */
		List lista;

		/*
		 * Construyo una instancia. Notar que se puede cambiar la
		 * implementaci�n, tal como muestan las lineas comentadas, sin tocar el
		 * resto del c�digo
		 */
		lista = new ArrayList();

		// lista = new Vector();
		// lista = new LinkedList();

		/* Inserto datos */
		insertar(lista, "Ejemplo");
		insertar(lista, "de");
		insertar(lista, "colecciones");
		insertar(lista, "en");
		insertar(lista, "el");
		insertar(lista, "curso");
		insertar(lista, "de");
		insertar(lista, "Java");

		/* Muestro los datos de la lista */
		for (Iterator i = lista.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	/**
	 * Inserta un elemento en una lista en forma ordenada
	 * 
	 * @param lista
	 *            La lista sobre la cual se insertar� el dato
	 * @param dato
	 *            El dato a ordenar
	 */
	static void insertar(List lista, Comparable dato) {
		/* Recorro la lista */
		for (int n = 0; n < lista.size(); n++) {
			/*
			 * Cuando encuentro un elemento mayor, inserto y retorno
			 */
			if ((dato.compareTo(lista.get(n))) < 0) {
				lista.add(n, dato);

				return;
			}
		}

		/* Si no encontr� uno mayor, lo agrego al final */
		lista.add(dato);
	}
}
