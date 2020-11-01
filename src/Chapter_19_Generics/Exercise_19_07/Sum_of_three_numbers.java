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
public class Sum_of_three_numbers {   
    
    public static double sum(Transition<? extends Number, ? extends Number, ? extends Number> transition) {
        Number first = transition.getFirst();
        Number second = transition.getSecond();
        Number third = transition.getThird();
        return first.doubleValue() + second.doubleValue() + third.doubleValue();
    }
}
