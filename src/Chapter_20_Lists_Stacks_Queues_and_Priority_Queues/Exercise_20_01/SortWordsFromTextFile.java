/*********************************************************************************
 * Reads the words from a text file, and displays them in descending alphabetical 
 * order.
 *********************************************************************************/
package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues.Exercise_20_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortWordsFromTextFile {
    private static File file;
    private static java.io.PrintWriter output;
    private static PriorityQueue<String> priorityQueue;

    public static void main(String[] args) throws FileNotFoundException{
        //Check if the user put in an argument with the
        if(args.length != 1) {
            System.out.println("Usage: java SortWordsFromTextFile \"filepath\"");
            System.exit(1);
        }
        try {
            System.out.println(sortWordsFromTextFile(args[0])); //prints sorted priorityqueue
        }
        catch (Exception ex) {
            System.out.println("Wrong filepath " + args[0]);
        }
    }  
    
    public static PriorityQueue sortWordsFromTextFile(String filepath) throws FileNotFoundException {
        file = new File(filepath);
        if(file.exists() && !file.isDirectory()) {
            System.out.println("file already exists");
        }
        else {
            output = new java.io.PrintWriter(file); //Creates file
            output.println("This is a test to see if the words get sorted in descending alphabetical order. 1 2 3 4 , 1;2;3:4;5");
            output.close(); //close file
        }        
        Scanner input = new Scanner(file); //creates scanner for file
        priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); //creates priority queue
        //puts words from file inside the priority queue
        while(input.hasNext()) {
            String s = input.next();
            if(Character.isLetter(s.charAt(0)))
                priorityQueue.offer(s);
        }
        
        return priorityQueue;
    }
}