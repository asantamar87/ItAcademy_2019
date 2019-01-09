/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase1;

/**
 *
 * @author manuelsantamaria
 */
public class Main {
    
    public static void main(String[] args) {
   
        Coet a1 = new Coet ("32WESSDS",3);
        
        Coet a2 = new Coet("LDSFJA32",6);
        
        System.out.println("El código es : "+ a1.getCodi()+" y el número es: "+ a1.getPropulsors());
        System.out.println("El código es : "+ a2.getCodi()+" y el número es: "+ a2.getPropulsors());
        
    }
}
