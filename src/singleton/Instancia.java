/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 * @version 1.0
 * @author Internet
 * @class Instancia
 * Clase de instancia usada para el patron singleton
 */
public class Instancia {
    
    
    // variable Instancia de tipo static para controlar el singleton
    private static Instancia instancia;
    // variable numero ejemplo para singleton
    public int numero;
    
    /**
     * @method Instancia
     * Constructor de la clase instancia privada para utilizar en singleton
     */
    private Instancia(){
        
    }
    
    /**
     * @method getInstancia
     * metodo singleton que verifica si la instancia esta creada o no
     * @return instancia
     * retorna la instacia del aplicativo
     */
    public static Instancia getInstancia(){
        if(instancia==null){
            instancia=new Instancia();
        }
        return instancia;
    }
}

