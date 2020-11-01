/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_19_Generics.Exercise_19_06;

/**
 *
 * @author Jørgen
 */
public class Association<E, E2> {
    private E first;
    private E2 second;
    
    public Association(E first, E2 second) {
        this.first = first;
        this.second = second;
    }
    
    public E getFirst() {
        return first;
    }
    
    public E2 getSecond() {
        return second;
    }
    
    public void setFirst(E newFirst) {
        this.first = newFirst;
    }
    
    public void setSecond(E2 newSecond) {
        this.second = newSecond;
    }
    
    @Override
    public String toString() {
        String output = "Pair: [" + getFirst() + ", " + getSecond() + "]";
        return output;
    }
}
