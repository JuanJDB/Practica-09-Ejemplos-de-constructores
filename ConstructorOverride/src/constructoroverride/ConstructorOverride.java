/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverride;

/**
 *
 *<h1>ConstructorOverride</h1>
 * 
 * <p>Es el main de el programa</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class ConstructorOverride {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion del objeto reca de la clase Recamara
        Recamara reca = new Recamara("Si hay muebles");   
        
        //Impresion de resultados
        System.out.println(reca.contiene(mueble));
    }
    
}
