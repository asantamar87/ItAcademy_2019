package fase3;

/**
 *
 * @author Aldo Santa María
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Creando Cohetes y propulsores ... ");

        Coet coet1 = new Coet();
        coet1.setNom("32WESSDS");
        coet1.addPropulsor(10);
        coet1.addPropulsor(30);
        coet1.addPropulsor(50);

        Coet coet2 = new Coet();
        coet2.setNom("LDSFJA32");
        coet2.addPropulsor(30);
        coet2.addPropulsor(40);
        coet2.addPropulsor(50);
        coet2.addPropulsor(50);
        coet2.addPropulsor(30);
        coet2.addPropulsor(10);

        System.out.println("Cohetes Creados!!");

        System.out.println("[Código_Cohete1] -> " + coet1.getNom()
                + " [Total Propulsores] -> " + coet1.getNumPropulsors()
                + " [Potencia máxima] - >" + coet1.getMaximaPotencia());
        
        System.out.println("[Código_Cohete2] -> " + coet2.getNom()
                + " [Total Propulsores] -> " + coet2.getNumPropulsors()
                + "[Potencia máxima] -> " + coet2.getMaximaPotencia());
        System.out.println(" ");
        
        System.out.println("3. Mostrando Velocidad Actual ...");
        System.out.println("La velocidad actual del coet 1: "+coet1.getPotenciaActual());
        System.out.println("La velocidad actual del coet 2: "+coet2.getPotenciaActual());
        System.out.println(" ");
        
        System.out.println("4. Acelerando los Cohetes en 3 ...");
        coet1.acelerar(3);
        coet2.acelerar(3);
        System.out.println(" ");
        System.out.println("5. Mostrando Velocidad Actual ...");
        System.out.println("Velocidad Modificada COHETE 1-> " + coet1.getPotenciaActual());
        System.out.println("Velocidad Modificada COHETE 2-> " + coet2.getPotenciaActual());
         System.out.println(" ");
        System.out.println("6. Frenando el cohete 1 en 5  y acelerando en 7 el cohete 2");
        coet1.frenar(5);
        coet2.acelerar(7);
        System.out.println(" ");
        System.out.println("7. Mostrando Velocidad Actual ...");
        System.out.println("Velocidad Modificada COHETE 1-> " + coet1.getPotenciaActual());
        System.out.println("Velocidad Modificada COHETE 2-> " + coet2.getPotenciaActual());
        System.out.println(" ");
        System.out.println("8. Acelerando los Cohetes 15 veces ...");
        
        System.out.println(" ");
        System.out.println("9. Mostrando Velocidad Actual ...");
        System.out.println("Velocidad Modificada COHETE 1-> " + coet1.getPotenciaActual());
        System.out.println("Velocidad Modificada COHETE 2-> " + coet2.getPotenciaActual());

        
    }
}
