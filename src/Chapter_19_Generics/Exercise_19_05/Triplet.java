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
public class Triplet<E> {
    private E first;
    private E second;
    private E third;
    
    public Triplet(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public E getFirst() {
        return first;
    }
    
    public E getSecond() {
        return second;
    }
    
    public E getThird() {
        return third;
    }
    
    public void setFirst(E newFirst) {
        this.first = newFirst;
    }
    
    public void setSecond(E newSecond) {
        this.second = newSecond;
    }
    
    public void setThird(E newThird) {
        this.third = newThird;
    }
    
    public String toString() {
        String output = "Triplet: [" + getFirst() + ", " + getSecond() + ", " + getThird() + "]";
        return output;
    }
}
