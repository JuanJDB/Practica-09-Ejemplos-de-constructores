/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerconstructor;

/**
 *
 *<h1>Computadora</h1>
 * 
 * <p>Es la clasede computadora</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class Computadora {
    // Declaracion de la variable virus
    private String virus;
    
    //Declaracion del constructor de la clase Computadora
    public Computadora(){
        virus = "Su computadora esta libre de virus";
    }
    
    //Metodo que sirve para devolver el contenido de la variable virus
     public String toString(){
        return virus;
    }
    
}
