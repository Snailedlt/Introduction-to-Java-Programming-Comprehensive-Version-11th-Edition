/*********************************************************************************
 * Tests the Triplet class
 *********************************************************************************/

package Chapter_19_Generics.Exercise_19_05;

public class Main {
   
    public static void main(String[] args) {
        
        Triplet<Integer> pair = new Triplet<>(5, 30, 32);
        Triplet<String> pair2 = new Triplet<>("This is a String", "This is another String", "This is a third String");
        System.out.println(pair);
        System.out.println(pair2);
    }
    
} 
