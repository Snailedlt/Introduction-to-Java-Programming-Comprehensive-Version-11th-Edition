/*
 * Method that returns the sum of three numbers in a Transition
 */
package Chapter_19_Generics.Exercise_19_07;

import Chapter_19_Generics.Exercise_19_06.Transition;

public class SumOfThreeNumbers {   
    
    public static double sum(Transition<? extends Number, ? extends Number, ? extends Number> transition) {
        Number first = transition.getFirst();
        Number second = transition.getSecond();
        Number third = transition.getThird();
        return first.doubleValue() + second.doubleValue() + third.doubleValue();
    }
}
