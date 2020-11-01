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
public class Transition<E, E2, E3> {
    private E first;
    private E2 second;
    private E3 third;
    
    public Transition(E first, E2 second, E3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public E getFirst() {
        return first;
    }
    
    public E2 getSecond() {
        return second;
    }
    
    public E3 getThird() {
        return third;
    }
    
    public void setFirst(E newFirst) {
        this.first = newFirst;
    }
    
    public void setSecond(E2 newSecond) {
        this.second = newSecond;
    }
    
    public void setThird(E3 newThird) {
        this.third = newThird;
    }
    
    @Override
    public String toString() {
        String output = "Pair: [" + getFirst().toString() + ", " + getSecond().toString() + ", " + getThird().toString() + "]";
        return output;
    }
}
