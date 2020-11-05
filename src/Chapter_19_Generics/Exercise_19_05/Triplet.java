/*
 * Creates a Triplet class that encapsulates three objects of the same data type
 * in a given instance of Triplet
 */

package Chapter_19_Generics.Exercise_19_05;

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
    
    @Override
    public String toString() {
        String output = "Triplet: [" + getFirst() + ", " + getSecond() + ", " + getThird() + "]";
        return output;
    }
}
