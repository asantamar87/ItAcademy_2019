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
public class Coet {

    //Un coet està identificat per un codi de 8 caràcters i un número de propulsors. 
    private String codi;
    private int propulsors;

    public Coet(String codi, int propulsors) {
        
        try {
               if (codi.length() <=8) {
            this.codi = codi;
            this.propulsors = propulsors;
        }
        
        
        } catch (Exception e) {
            System.out.println("max 8 characters");
        }
     
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public int getPropulsors() {
        return propulsors;
    }

    public void setPropulsors(int propulsors) {
        if (propulsors !=0 ){
              this.propulsors = propulsors;
        }
      
    }



  
    
    

}
