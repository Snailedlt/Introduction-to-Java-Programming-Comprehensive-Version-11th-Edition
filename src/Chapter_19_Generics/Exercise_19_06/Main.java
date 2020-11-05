/*
 * Tests Association and Transition classes
 */
package Chapter_19_Generics.Exercise_19_06;

public class Main {
    
    public static void main(String[] args) {
        
        //Test Association
        Association<Integer, String> association = new Association<>(5, "This is a String");
        Association<String, String> association2 = new Association<>("This is a String", "This is another String");
        Association<Integer, Double> association3 = new Association<>(5, (double) 5);
        Association<Integer, Float> association4 = new Association<>(30, 2f);
        System.out.println(association);
        System.out.println(association2);
        System.out.println(association3);
        System.out.println(association4);
        System.out.println("association3 second: " + association3.getSecond());
        
        //Test Transition
        Transition<Integer, String, String> transition = new Transition<>(5, "This is a String", "This is a 2nd String");
        Transition<String, String, String> transition2 = new Transition<>("This is a String", "This is another String", "This is a third String");
        Transition<Integer, Double, String> transition3 = new Transition<>(5, (double) 5, "This is a String");
        int[] array = {1, 2, 3};
        Transition<Integer, Float, int[]> transition4 = new Transition<>(30, 2f, array);
        System.out.println(transition);
        System.out.println(transition2);
        System.out.println(transition3);
        System.out.println(transition4);
        System.out.println("transition4 third: " + transition4.getThird());
    }
    
} 
