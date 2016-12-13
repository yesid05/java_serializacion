package entidad;

import java.io.Serializable;


public class Empleado implements Serializable {
    // ---------------------------
    // Atributos
    // ---------------------------
    /**
     * Nombre del empleado
     */
    public String nombre;
    /**
     * Dirección de correo electrónico
     */
    public String mail;
    /**
     * Número social del empleado
     */
    public transient int ssn; //transient campo no serializable
    /**
     * Número de teléfono
     */
    public int numeroTelefonico;

    // ---------------------------
    // Metodos
    // ---------------------------
    /**
     * Contruye un emeado sin caracteristicas 
     */
    public Empleado() {
    }
    /**
     * Construye un empleado con sus caracteristicas
     * @param unNombre nombre  de tipo String
     * @param unMail correo electrónico  de tipo String
     * @param unSsn número de seguro social de tipo int
     * @param unNumeroT número de teléfono de tipo int 
     */
    public Empleado(String unNombre,String unMail,int unSsn,int unNumeroT){
	nombre = unNombre;
	mail = unMail;
	ssn = unSsn;
	numeroTelefonico = unNumeroT;
    }
    
    /**
     * Modifica el nombre del empleado
     * @param unNombre nuevo nombre de tipo String 
     */
    public void cambiarNombre(String unNombre){
	nombre = unNombre;
    }
    
    /**
     * Retorna el nombre del empleado
     * @return un nombre de tipo String
     */
    public String darNombre(){
	return nombre;
    }
    
    /**
     * Modifica el correo electrónico del empleado
     * @param unMail nuevo mail de tipo String
     */
    public void cambiarMail(String unMail){
	mail = unMail;
    }
    
    /**
     * Retorna el correo electrónico del empleado
     * @return un mail de tipo String 
     */
    public String darMail(){
	return mail;
    }
    
    /**
     * Modifica el número de seguro social de un empleado
     * @param unSsn nuevo número de seguro social de tipo int
     */
    public void cambiarSSN(int unSsn){
	ssn = unSsn;
    }
    
    /**
     * Retorna el número de seguro social de un empleado
     * @return un numero de seguro social de tipo int 
     */
    public int darSSN(){
	return ssn;
    }

    /**
     * Modifica el número de teléfono de un empleado
     * @param unNumeroT nuevo número de teléfono de tipo int
     */
    public void cambiarNumeroTelefonico(int unNumeroT){
	numeroTelefonico = unNumeroT;
    }
    
    /**
     * Retorna el número de teléfono de un empleado
     * @return un número de teléfono de tipo int  
     */
    public int darNumeroTelefonico(){
	return numeroTelefonico;
    }
}
