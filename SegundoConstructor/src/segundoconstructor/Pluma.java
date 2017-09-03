/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoconstructor;

/**
 *
 *<h1>Pluma</h1>
 * 
 * <p>Es la clase de la pluma</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class Pluma {
    //Declaracion de la variable tinta
    String tinta;
    
    /**
     * Declaracion del constructor de la clase pluma que recibe el parametro tinta
     * @param tinta 
     */
    public Pluma(String tinta){
        this.tinta = tinta;
    }
    
    //Metodo que sirve para devolver el contenido de la variable tinta
    public String toString(){
        return tinta;
    }
    
}


