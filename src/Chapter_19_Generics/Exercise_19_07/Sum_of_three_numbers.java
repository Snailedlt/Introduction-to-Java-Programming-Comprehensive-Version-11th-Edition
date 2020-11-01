/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_19_Generics.Exercise_19_07;

import Chapter_19_Generics.Exercise_19_06.Transition;

/**
 *
 * @author Jørgen
 */
public class Sum_of_three_numbers {   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sum(new Transition<>(2.63, 2, 42f)));
    } 
    public static double sum(Transition<? extends Number, ? extends Number, ? extends Number> transition) {
        Number first = transition.getFirst();
        Number second = transition.getSecond();
        Number third = transition.getThird();
        return first.doubleValue() + second.doubleValue() + third.doubleValue();
    }
}
