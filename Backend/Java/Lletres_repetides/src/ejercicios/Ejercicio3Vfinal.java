/*
* Fase 3
*Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
 */
package ejercicios;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Aldo santamaria
 */
public class Ejercicio3 {

    public static void fillArray(List<String> letters, Map<String, Integer> lettersMap) {

        for (String letter : letters) {

            countLetters(letter, lettersMap);
        }
    }

    public static void countLetters(String letter, Map<String, Integer> map) {

        if (map.containsKey(letter.toLowerCase())) {
            Integer value = map.get(letter);
            map.put(letter.toLowerCase(), value++);
        } else {
            map.put(letter.toLowerCase(), 1);
        }
    }

    public static void showResults(Map<String, Integer> lettersMap) {

        for (String key : lettersMap.keySet()) {
            System.out.println(" ShowLetter:  " + key + "   Count: " + lettersMap.get(key));
        }
    }

    public static void main(String[] args) {

        List<String> letters = Arrays.asList("A", "L", "D", "O");
        Map<String, Integer> lettersMap = new LinkedHashMap<String, Integer>();
        fillArray(letters, lettersMap);
        showResults(lettersMap);
    }

}
