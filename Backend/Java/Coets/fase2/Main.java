
package fase2;

/**
 *
 * @author Aldo Santa Maria
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Creando Cohetes y propulsores ... ");

        Coet coet1 = new Coet();
        coet1.setNom("32WESSDS");
        
        coet1.addPropulsors(10);
        coet1.addPropulsors(30);
        coet1.addPropulsors(80);

        Coet coet2 = new Coet();
        coet2.setNom("LDSFJA32");
        
        coet2.addPropulsors(30);
        coet2.addPropulsors(40);
        coet2.addPropulsors(50);
        coet2.addPropulsors(50);
        coet2.addPropulsors(30);
        coet2.addPropulsors(10);

        System.out.println("Imprimiendo Información ... ");
        System.out.println("[ El codi del coet 1 ->] " + coet1.getNom()
                + " [Total propulsores -> ]" + coet1.getNumPropulsores()+" [Max Propulsor-> ] "+coet1.getMaxPropulsor());

        System.out.println("[ El codi del coet 2 ->] " + coet2.getNom()
                + " [ Total propulsores -> ]" + coet2.getNumPropulsores()+"[ Max Propulsor-> ] "+coet2.getMaxPropulsor());

    }
}
