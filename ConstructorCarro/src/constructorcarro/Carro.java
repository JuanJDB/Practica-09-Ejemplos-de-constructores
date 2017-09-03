/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorcarro;

/**
 *
 *<h1>Carro</h1>
 * 
 * <p>Es laclase de Carro</p>
 * 
 * @author Monroy Gonzalez Juan Ignacio
 * @version 1.0.0
 * @since 02-09-17
 * 
 */
public class Carro {
    //Declaracion de las variables gasolina y frenos
    private String gasolina;
    private String frenos;
    
    /**
     * Constructor de la clase Carro recibe como parametros: frenos y gasolina
     * @param gasolina
     * @param frenos 
     */
    public Carro(String gasolina, String frenos){
        
        this.frenos = frenos;
        this.gasolina = gasolina;
        
    }
    
    /**
     * Metodo mediante el cual se evalua la condicion del carro devuelve el string resultado
     * @return resultado
     */
    public String Evalua(){
        
        String resultado="";
        
        if(frenos.equals("si") && gasolina.equals("si")){
            
            resultado="Usted tiene en su carro gasolina y cuenta con buenos frenos";
            
        }else{
        
            resultado="Usted deberia llevar su coche a una revision";
              
        }
      
      return resultado;
    }
    
}
