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
 * <p>Casa</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public abstract class Casa {
    /**
     * <h3>Muebles en la casa</h3>
     * 
     * Metodo abstracto para la clase recamara
     */
    private String mueble;
    
    public abstract void contiene(String mueble);
    
    public String getMuebles(){
        return mueble;
    }
    
    public void setMuebles(String mueble){
        this.mueble=mueble;
    }
    
    
}
