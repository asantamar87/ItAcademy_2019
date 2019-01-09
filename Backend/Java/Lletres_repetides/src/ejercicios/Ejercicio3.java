/*
* Fase 3
*Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
 */
package ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author manuelsantamaria
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"A");
        map.put(2, "l");
        map.put(3, "d");
        map.put(4, "o");
   

// Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }
}