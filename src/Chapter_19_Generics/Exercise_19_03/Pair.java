/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_19_Generics.Exercise_19_03;

/**
 *
 * @author J�rgen
 */
public class Pair<E> {
    private E first;
    private E second;
    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }
    
    public E getFirst() {
        return first;
    }
    
    public E getSecond() {
        return second;
    }
    
    public void setFirst(E newFirst) {
        this.first = newFirst;
    }
    
    public void setSecond(E newSecond) {
        this.first = newSecond;
    }
    
    public String toString() {
        String output = "Pair: [" + getFirst() + ", " + getSecond() + "]";
        return output;
    }
}
