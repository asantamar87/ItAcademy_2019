/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldo Santa Maria
 */
public class Coet {

    private String nom;
    private int numPropulsors;
    private List<Propulsor> propulsores;

    public Coet() {

        this.propulsores = new ArrayList<Propulsor>();
    }

    public Coet(String nom, List<Propulsor> propulsores) {
        this.nom = nom;
        this.propulsores = propulsores;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumPropulsors() {
        return propulsores.size();
    }

    public void setNumPropulsors(int numPropulsors) {
        this.numPropulsors = numPropulsors;
    }

    public List<Propulsor> getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(List<Propulsor> propulsores) {
        this.propulsores = propulsores;
    }

    public void addPropulsor(int potencia) throws Exception {

        Propulsor propulsor = new Propulsor(potencia);
        this.propulsores.add(propulsor);

    }

    public void acelerar(int acelerar) {

        for (Propulsor propulsor : propulsores) {
            propulsor.acelerar(acelerar);
        }
    }

    public void frenar(int frenar) {
        for (Propulsor propulsor : propulsores) {
            propulsor.frenar(frenar);
        }
    }
    
    public List<Integer> getMaximaPotencia() {
		List<Integer> llistaPotencia = new ArrayList<>();
		for (Propulsor p : propulsores) 
			llistaPotencia.add(p.getPotenciaMaxima());
		
		return llistaPotencia;
	}
	
	public List<Integer> getPotenciaActual1(){
		List<Integer> llistaPotenciaActual = new ArrayList<>();
		for (Propulsor p : propulsores) 
			llistaPotenciaActual.add(p.getPotenciaMaxima());		
		
		return llistaPotenciaActual;
	}

	public int getPotenciaActual() {
		int potenciaInicial = 0;
		for (Propulsor p : propulsores) {
			//potenciaInicial = potenciaInicial + p.getPotenciaInicial();
			potenciaInicial = potenciaInicial + p.getPotenciaInicial();
		}
		return potenciaInicial;

}
      /*
    public int getPotenciaMaxima() {

        List<Integer> listPotenciaMaxima = new ArrayList<>();

        for (Propulsor p : propulsores) {

            listPotenciaMaxima.add(p.getPotenciaMaxima());
        }

        int max = listPotenciaMaxima.get(0);

        for (int i = 0; i < listPotenciaMaxima.size(); i++) {
            if (listPotenciaMaxima.get(i) > max) {
                max = listPotenciaMaxima.get(i);
            }
        }

        return max;
    }
    
    public int getVelocidadActual() {
        
        List<Integer> velActual = new ArrayList<>();

        for (Propulsor p : propulsores) {

            velActual.add(p.getPotenciaActual());
        }

        int sumVel = velActual.get(0);

        for (int i = 0; i < velActual.size(); i++) {
           
                sumVel = velActual.get(i);
                
            
        }

        return sumVel;
    }
    
    public int getPotenciaActual() {
		int potenciaInicial = 0;
		for (Propulsor p : propulsores) {
			
			potenciaInicial += p.getPotenciaInicial();
		}
		return potenciaInicial;

	}

    
    // Hasta aquí va bien ...
  

      public  List<Integer> getVelocidadActual(){
           List<Integer> velMax = new ArrayList<>();

        for (Propulsor p : propulsores) {

            velMax.add(p.getPotenciaMaxima());
        }
        
        return velMax;
      }

    /* El coet tindrà una velocitat actual que és la suma de totes 
    les potències dels seus propulsors.
    
    
    public int getPowerActually() {
        
        //List<Integer> listPotenciaActual = new ArrayList<>();
        
        int velocidadActual=0;
        for (Propulsor p : propulsores) {
            listPotenciaActual.add(p.getPotenciaMaxima());
            velocidadActual+=p.getPotenciaActual();
            velocidadActual++;
        }

        return velocidadActual;
    }
     */
 /*   public int getPowerActually() {
		int potenciaActual = 0;
		for (Propulsor p : propulsores) {
		
			potenciaActual =  p.getPotenciaActual();
                        potenciaActual++;
		}
		return potenciaActual;
*/
}

