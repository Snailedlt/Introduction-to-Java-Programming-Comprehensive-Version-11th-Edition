/*********************************************************************************
 * Tests the PairWithMin class
 *********************************************************************************/
package Chapter_19_Generics.Exercise_19_04;

import static Chapter_19_Generics.Exercise_19_04.PairWithMin.min;

public class Main {
    
    public static void main(String[] args) {
        
        PairWithMin<Integer> pair = new PairWithMin<>(5, 30);
        PairWithMin<String> pair2 = new PairWithMin<>("This is a String", "This is another String");
        PairWithMin<Integer> pair3 = new PairWithMin<>(5, 5);
        PairWithMin<Integer> pair4 = new PairWithMin<>(30, 2);
        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(min(pair).toString());
        System.out.println(min(pair3).toString());
        System.out.println(min(pair4).toString());
    }
    
} 
