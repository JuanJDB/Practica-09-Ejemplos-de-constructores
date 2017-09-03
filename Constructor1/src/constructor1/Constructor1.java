/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor1;

/**
 *
 *<h1>Constructor1</h1>
 * 
 * <p>Es el main de el programa</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class Constructor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** Declaracion de objetos cell de la clase celular para el constructor sin parametros y nuevo para la clase celular
         *  con parametros.
         */        
        Celular  cell = new Celular();
        Celular  nuevo = new Celular("no");
        
        //Impresion de resultados  
        System.out.println("El telefono "+ cell.toString() +" tiene bateria");
        System.out.println("El telefono "+ nuevo.toString() +" tiene bateria");
    }
    
}
