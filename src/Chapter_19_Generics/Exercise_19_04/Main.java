/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_19_Generics.Exercise_19_04;

import static Chapter_19_Generics.Exercise_19_04.Pair_with_min.min;

/**
 *
 * @author Jørgen
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pair_with_min<Integer> pair = new Pair_with_min<>(5, 30);
        Pair_with_min<String> pair2 = new Pair_with_min<>("This is a String", "This is another String");
        Pair_with_min<Integer> pair3 = new Pair_with_min<>(5, 5);
        Pair_with_min<Integer> pair4 = new Pair_with_min<>(30, 2);
        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(min(pair).toString());
        System.out.println(min(pair3).toString());
        System.out.println(min(pair4).toString());
    }
    
} 
