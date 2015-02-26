package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

/**
 * Clase de ejemplo para anotaciones. Usado en el ejercicio 30.
 *
 *
 */
public class EjemploAnotacion {
	@Autor(nombre = "Homero", apellido = "Simpson", nota = "Donas!!!")
	public void atenderPlantaNuclear() {
	}

	@Autor(nombre = "Montgomery", apellido = "Burns", nota = "Excelente...")
	public void controlarEmpleados() {
	}

	@Autor(nombre = "Ned", apellido = "Flanders")
	public void irAMisa() {
	}
}