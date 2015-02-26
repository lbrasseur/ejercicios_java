package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 06/11/2004
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describe al autor del desarrollo. Usado en el ejercicio 30.
 *
 *
 */
@Retention(RetentionPolicy.RUNTIME)
/* Hace que se mantenga hasta en el runtime */
@Target(ElementType.METHOD)
/* Indica que se puede usar solo en metodos */
public @interface Autor {
	String nombre() default "[sin nombre]";

	String apellido() default "[sin apellido]";

	String nota() default "[sin notas]";
}
