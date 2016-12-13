package entidad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URL;

public class Serializacion {

    // nombre del archivo donde se guardan los objetos serializados
    private static String NOMBRE_ARCHIVO = "empleado.txt";

    /**
     * Metodo para serializar un objeto
     * 
     * @param unEmpleado
     *            un objeto de tipo empleado
     */
    public void serializacion(Empleado unEmpleado) {

	try {
	    URL url = getClass().getResource("/tmp/");
	    FileOutputStream fileOut = new FileOutputStream(url.toURI().getPath() + NOMBRE_ARCHIVO);
	    ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
	    objOut.writeObject(unEmpleado);
	    objOut.close();
	    fileOut.close();
	    System.out.println("Serialización exitosa guardada en: " + url.toURI().getPath());
	} catch (Exception e) {
	    System.err.println("Error: " + e.getMessage());
	}

    }

    /**
     * Retorna un objeto deserializado
     * @return objeto de tipo empleado
     * @throws IOException Error de lectura o escritura
     * @throws ClassNotFoundException Error al crear el objeto empleado
     * @throws Exception error 
     */
    public Empleado Deserializacion() throws IOException, ClassNotFoundException, Exception {
	Empleado empleado = null;
	URL url = getClass().getResource("/tmp/");
	FileInputStream fileIn = new FileInputStream(url.toURI().getPath() + NOMBRE_ARCHIVO);
	ObjectInputStream objIn = new ObjectInputStream(fileIn);
	empleado = (Empleado) objIn.readObject();
	objIn.close();
	fileIn.close();

	return empleado;
    }

}
