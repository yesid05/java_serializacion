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
     * Direcci�n de correo electr�nico
     */
    public String mail;
    /**
     * N�mero social del empleado
     */
    public transient int ssn; //transient campo no serializable
    /**
     * N�mero de tel�fono
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
     * @param unMail correo electr�nico  de tipo String
     * @param unSsn n�mero de seguro social de tipo int
     * @param unNumeroT n�mero de tel�fono de tipo int 
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
     * Modifica el correo electr�nico del empleado
     * @param unMail nuevo mail de tipo String
     */
    public void cambiarMail(String unMail){
	mail = unMail;
    }
    
    /**
     * Retorna el correo electr�nico del empleado
     * @return un mail de tipo String 
     */
    public String darMail(){
	return mail;
    }
    
    /**
     * Modifica el n�mero de seguro social de un empleado
     * @param unSsn nuevo n�mero de seguro social de tipo int
     */
    public void cambiarSSN(int unSsn){
	ssn = unSsn;
    }
    
    /**
     * Retorna el n�mero de seguro social de un empleado
     * @return un numero de seguro social de tipo int 
     */
    public int darSSN(){
	return ssn;
    }

    /**
     * Modifica el n�mero de tel�fono de un empleado
     * @param unNumeroT nuevo n�mero de tel�fono de tipo int
     */
    public void cambiarNumeroTelefonico(int unNumeroT){
	numeroTelefonico = unNumeroT;
    }
    
    /**
     * Retorna el n�mero de tel�fono de un empleado
     * @return un n�mero de tel�fono de tipo int  
     */
    public int darNumeroTelefonico(){
	return numeroTelefonico;
    }
}
