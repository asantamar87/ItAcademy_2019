/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manuelsantamaria
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("--- Fase #4 ---");
   
        
      char[] name = {'A','l','d','o'};
      
       char[] lastname = {'S','a','n','t','a',' ','M','a','r','i','a'};


       
        List<String> fullName = new ArrayList<>();
        int i=0;
        for (Character letter : name) {
             fullName.add(letter.toString());
        }
        fullName.add(" ");
        
        for (Character letter : lastname) {
            fullName.add(letter.toString());
        }

        System.out.println(fullName);
        System.out.println();

    }
}
