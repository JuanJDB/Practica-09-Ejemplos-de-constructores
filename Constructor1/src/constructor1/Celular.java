/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor1;

/**
 *
 *<h1>Celular</h1>
 * 
 * <p>Clase del celular</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class Celular {
    //Declaracion de la variable bateria
    public String bateria;
    
    
    //Feclaracion del constructor de la clase Celular
    public Celular(){
        bateria = "si";
    }
    
    /**
     * 
     * @param bateria
     * Segundo constructor de la clase Celular recibe como parametro bateria
     * 
     */
    public Celular(String bateria){
        this.bateria = bateria;
    }
    
    
    //Metodo que sirve para devolver el contenido de la variable bateria
    public String toString(){
        return bateria;
    }
}
