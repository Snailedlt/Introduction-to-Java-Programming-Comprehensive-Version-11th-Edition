/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_19_Generics.Exercise_19_05;

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
        
        Triplet<Integer> pair = new Triplet(5, 30, 32);
        Triplet<String> pair2 = new Triplet("This is a String", "This is another String", "This is a third String");
        System.out.println(pair);
        System.out.println(pair2);
    }
    
} 
