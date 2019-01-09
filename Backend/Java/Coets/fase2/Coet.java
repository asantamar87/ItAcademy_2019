/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldo Santa María
 */
public class Coet {

    private String nom;
    private List<Propulsor> propulsores;

    public Coet(String nom, List<Integer> Propulsores) {
        this.nom = nom;
        this.propulsores.size();
    }

    public Coet() {
        this.propulsores = new ArrayList<Propulsor>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Propulsor> getPropulsores() {
        return propulsores;
    }

    public int getNumPropulsores() {
        return propulsores.size();
    }

    public void setPropulsores(List<Propulsor> Propulsores) {
        this.propulsores = Propulsores;
    }

    public void setNumPropulsor(List<Propulsor> potencia) {
        this.propulsores = potencia;
    }

    public void addPropulsors(int potencia) {
        Propulsor propulsor = new Propulsor(potencia);
        this.propulsores.add(propulsor);
    }
    
     public int getMaxPropulsor() {

        List<Integer> listPotenciaMaxima = new ArrayList<>();

        for (Propulsor p : propulsores) {

            listPotenciaMaxima.add(p.getPotencia());
        }

        int max = listPotenciaMaxima.get(0);

        for (int i = 0; i < listPotenciaMaxima.size(); i++) {
            if (listPotenciaMaxima.get(i) > max) {
                max = listPotenciaMaxima.get(i);
                
            }
        }

        return max;
    }
    
}
