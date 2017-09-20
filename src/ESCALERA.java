
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class ESCALERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ESCALERA objesc  = new ESCALERA();
        objesc.suvirescalera (5);
    }
    //CREANDO UN METODOPARA SUVIR UNA ESCALERA DE MANERA RECURSIVA
    public void suvirescalera(int escalones){
        if ( escalones == 0){
            //caso base respuesta explicita 
            System.out.println("has terminado de suvir la escalera");
        }else{
            try {
                // dominio ,divicion el problema original {problema - 1}
                Thread.sleep(8);
            } catch (InterruptedException ex) {
                Logger.getLogger(ESCALERA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("subiendo el escalon " + escalones);
            //haciendo uso de la recursividad
            suvirescalera(escalones -1);
            
            
        }
    }
    
}
