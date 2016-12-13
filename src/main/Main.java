package main;

import java.io.IOException;
import java.util.Scanner;

import entidad.Empleado;
import entidad.Serializacion;

public class Main {

    public static void main(String[] argumento) {
	// creando el empleado
	Empleado empleado = new Empleado("Pepito Perez", "pp@correo.com", 1234567, 356123);

	Serializacion serializacion = new Serializacion();
	serializacion.serializacion(empleado); // serializando el objeto

	Scanner teclado = new Scanner(System.in);

	System.out.println("Ver objeto serializado SI/NO");
	String respuesta = teclado.nextLine();
	if (respuesta.equalsIgnoreCase("si")) {

	    try {
		// deserializando un objeto de tipo empleado
		empleado = serializacion.Deserializacion();
		System.out.printf(
			"Empleado...!!\nNombre: %s,\nMail: %s,\nNúmero de seguro social %d,\nNúmero de teléfono: %d,\n",
			empleado.darNombre(), empleado.darMail(), empleado.darSSN(), empleado.darNumeroTelefonico());
	    } catch (ClassNotFoundException e) {
		System.err.println("Error en el objeto: " + e.getMessage());
		e.printStackTrace();
	    } catch (IOException e) {
		System.err.println("Error de lectura o escritura: " + e.getMessage());
		e.printStackTrace();
	    } catch (Exception e) {
		System.err.println("Error: " + e.getMessage());
		e.printStackTrace();
	    }
	}

    }

}
