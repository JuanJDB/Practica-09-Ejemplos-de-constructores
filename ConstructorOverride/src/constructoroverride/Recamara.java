/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverride;

/**
 *
 *<h1>Recamara</h1>
 * 
 * <p>Clase hija de la clase Casa</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class Recamara extends Casa{

    @Override
    public void contiene(String mueble) {

        this.setMuebles(mueble);
        
        System.out.println(mueble);
        
    }
    

}
