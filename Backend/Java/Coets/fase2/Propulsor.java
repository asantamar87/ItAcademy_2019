
package fase2;

/**
 *
 * @author Aldo Santa María
 */
public class Propulsor {

    private int potencia;
    private int numPropulsores;

    public Propulsor(int potencia) {
        this.potencia = potencia;

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumPropulsores() {
        return numPropulsores;
    }

    public void setNumPropulsores(int numPropulsores) {
        this.numPropulsores = numPropulsores;
    }

}
