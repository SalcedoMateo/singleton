/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author elkinmateo
 */

public class Singleton {

    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Instancia de ejemplos de singleton
         */
        Instancia ejemplo= Instancia.getInstancia();
        ejemplo.numero=3;
        System.out.println(ejemplo.numero);
        Instancia ejemplo2= Instancia.getInstancia();
        System.out.println(ejemplo2.numero);
        Instancia ejemplo3= Instancia.getInstancia();
        System.out.println(ejemplo3.numero);
    }
    
}
