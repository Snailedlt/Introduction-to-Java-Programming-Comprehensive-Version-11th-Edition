/*********************************************************************************
 * Tests the SumOfThreeNumbers class
 *********************************************************************************/
package Chapter_19_Generics.Exercise_19_07;

import Chapter_19_Generics.Exercise_19_06.Transition;
import static Chapter_19_Generics.Exercise_19_07.SumOfThreeNumbers.sum;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(sum(new Transition<>(2.63, 2, 42f)));
    } 
}
