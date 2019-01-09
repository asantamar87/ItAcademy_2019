
package fase3;

/**
 *
 * @author Aldo Santa María
 */
public class Propulsor {

    private int potenciaActual;
    private int potenciaMaxima;

    public Propulsor(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaActual() {
        return potenciaActual;
    }
    public int getPotenciaInicial() {
		return potenciaActual;
	}

    

    public void setPotenciaActual(int potenciaActual) {
        this.potenciaActual = potenciaActual;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public void acelerar(int n) {
        potenciaActual += 10 * n;
        if (potenciaActual >= potenciaMaxima) {
            potenciaActual = potenciaMaxima;
        }
    }

    public void frenar(int f) {
        potenciaActual -= 10 * f;
        if (potenciaActual < 0) {
            potenciaActual = 0;
        }

    }

    
}
