/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorcarro;

/**
 *
 *<h1>ConstructorCarro</h1>
 * 
 * <p>Es el main de el programa</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class ConstructorCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion del objeto de la clase carro y addicion de parametros
        Carro car = new Carro("no", "si");
        
        //Impresion de resultados
        System.out.println(car.Evalua());
    }
    
}
