package com.aajtech.cursos.java.ejercicios;

/*
 * Archivo creado el 03/12/2003
 */

/**
 * Utilice m�todos sincronizados y wait()/notify() para crear dos hilos: uno que
 * escriba mensajes en un objeto compartido y otro que los tome y los muestre
 * por pantalla. El hilo que los muestra debe esperar la llegada de mensajes y
 * el que los escribe debe notificar cuando escribe uno.
 *
 *
 */
public class Ejercicio20 {
	public static void main(String[] args) {
		/*
		 * Notar que este mecanismo sincorniza el emisor con el receptor, es
		 * decir, los hilos no ejecutan en una forma aleatoria. Inlcuso en el
		 * ejemplo inicio primero al receptor, pero los mensajes se leen en
		 * orden porque �ste se duerme hasta que el emisor env�a algo
		 */
		/* Construyo un buz�n */
		Buzon buzon = new Buzon();

		/* Construyo un receptor y lo inicio */
		new Receptor(buzon, 10).start();

		/* Construyo un emisor y lo inicio */
		new Emisor(buzon, 10).start();
	}
}

/**
 * Clase que almacena un mensaje y permite un acceso sincronizado al mismo
 *
 *
 */
class Buzon {
	/* Bandera que indica si hay un mensaje */
	boolean hayMensaje = false;

	/* El mensaje */
	String mensaje;

	/**
	 * Env�a un mensaje. Si el buz�n est� ocupado, duerme el hilo hasta que se
	 * libere
	 * 
	 * @param nuevoMensaje
	 *            el mensaje a enviar
	 * @throws InterruptedException
	 *             Si se interrumpe el hilo mientras est� esperando
	 */
	synchronized void enviarMensaje(String nuevoMensaje)
			throws InterruptedException {
		/* Espero a que se libere el buz�n */
		while (hayMensaje) {
			wait();
		}

		/* Coloco el mensaje en el buz�n */
		mensaje = nuevoMensaje;
		hayMensaje = true;

		/* Notifico a los hilos que est�n esperando un mensaje */
		notifyAll();

		System.out.println("Enviado: " + mensaje);
	}

	/**
	 * Recibe un mensaje. Si el buz�n est� vac�o, duerme el hilo hasta que
	 * llegue alg�n mensaje
	 * 
	 * @return El mensaje del buz�n
	 * @throws InterruptedException
	 *             Si se interrumpe el hilo mientras est� esperando
	 */
	synchronized String recibirMensaje() throws InterruptedException {
		/* Espero a que haya algo en el buz�n */
		while (!hayMensaje) {
			wait();
		}

		/* Libero el buz�n */
		hayMensaje = false;

		/* Notifico a los hilos que el buz�n est� libre */
		notifyAll();

		/* Retorno el mensaje */
		System.out.println("Recibido: " + mensaje);

		return mensaje;
	}
}

/**
 * Clase que env�a varios mensajes a un buz�n
 *
 */
class Emisor extends Thread {
	Buzon buzon;
	int cantidadMensajes;

	/**
	 * Constructor
	 * 
	 * @param buzon
	 *            El buz�n al cual se enviar�n los mensajes
	 * @param cantidadMensajes
	 *            La cantidad de mensajes a enviar
	 */
	Emisor(Buzon buzon, int cantidadMensajes) {
		this.buzon = buzon;
		this.cantidadMensajes = cantidadMensajes;
	}

	/**
	 * M�todo principal del hilo
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			for (int n = 0; n < cantidadMensajes; n++) {
				buzon.enviarMensaje("Mensaje nro " + n);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/**
 * Clase que recibe varios mensajes del un buz�n
 *
 */
class Receptor extends Thread {
	Buzon buzon;
	int cantidadMensajes;

	/**
	 * Constructor
	 * 
	 * @param buzon
	 *            El buz�n al cual se enviar�n los mensajes
	 * @param cantidadMensajes
	 *            La cantidad de mensajes esperados
	 */
	Receptor(Buzon buzon, int cantidadMensajes) {
		this.buzon = buzon;
		this.cantidadMensajes = cantidadMensajes;
	}

	/**
	 * M�todo principal del hilo
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			for (int n = 0; n < cantidadMensajes; n++) {
				buzon.recibirMensaje();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
