/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aldo.santamaria
 */
public class Ejercicio2 {

    public static void main(String[] args) {

     
        ArrayList<String> nombre = new ArrayList<String>();

        nombre.add("a");
        nombre.add("l");
        nombre.add("d");
        nombre.add("o");
        nombre.add("2");
       
        //Declaracion del Iterator
        Iterator item = nombre.iterator();
        while (item.hasNext()) {

            String letra = item.next().toString();
            if (esVocal(letra)) {
                System.out.println("vocal");
            } else if (esConsonante(letra)){
                System.out.println("consonante");
            }else if(esNumero(letra)){
                System.out.println("Els noms de persones no contenen números!");
            }
        }


    }
    
    public static boolean esVocal(String letra){
        String vocales[];
        vocales = new String[]{"a", "e", "i", "o", "u"};
        for (int i = 0; i < vocales.length; i++) {
            if (letra.equals(vocales[i])) {
                return true;
            }
        }
        return false;
    }
    public static boolean esConsonante(String letra){
        String consonante[];
        consonante = new String[]{"l", "d"};
        for (int i = 0; i < consonante.length; i++) {
            if (letra.equals(consonante[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean esNumero(String letra){
        int n= Integer.parseInt(letra);
        int numero[];
        numero = new int[]{0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numero.length; i++) {
            if (n == numero[i]) {
                return true;
            }
        }
        return false;
    }
}
