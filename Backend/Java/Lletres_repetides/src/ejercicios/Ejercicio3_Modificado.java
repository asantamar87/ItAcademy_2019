/*
* Fase 3
*Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
 */
package ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author manuelsantamaria
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<Character, String>();

        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        String cadena = "Aldo";

// Bucle que recorre la cadena y va añadiendo las letras y sumando las coincidencias

        for (int i = 0; i < cadena.length(); i++) {

            if (h.containsKey(cadena.charAt(i))) {

                h.put(cadena.charAt(i), (int) h.get(cadena.charAt(i)) + 1);

            } else {

                h.put(cadena.charAt(i), 1);

            }

        }

        Set<Map.Entry<Character, Integer>> freq = h.entrySet();

        Iterator<Map.Entry<Character, Integer>> it = freq.iterator();

        // Imprimimos el resultado en pantalla
        
        while (it.hasNext()) {

            Map.Entry<Character, Integer> item = it.next();

            System.out.println(item.getKey() + ": " + item.getValue());

        }

    }

}
