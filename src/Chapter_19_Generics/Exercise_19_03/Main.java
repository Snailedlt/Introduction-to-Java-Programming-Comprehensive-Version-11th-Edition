/*********************************************************************************
 * Tests the Pair class
 *********************************************************************************/
package Chapter_19_Generics.Exercise_19_03;

public class Main {

    public static void main(String[] args) {
        
        Pair<Integer> pair = new Pair<>(5, 30);
        Pair<String> pair2 = new Pair<>("This is a String", "This is another String");
        System.out.println(pair);
        System.out.println(pair2);
    }
    
}