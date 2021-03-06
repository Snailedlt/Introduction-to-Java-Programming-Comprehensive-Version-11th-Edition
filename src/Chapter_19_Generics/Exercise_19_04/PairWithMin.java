/*********************************************************************************
 * Write a generic static method that returns the smallest value in an instance 
 * of Pair from Programming Exercise 19.3
 *********************************************************************************/
package Chapter_19_Generics.Exercise_19_04;

public class PairWithMin<E> {
    private E first;
    private E second;
    
    public PairWithMin(E first, E second) {
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
        this.second = newSecond;
    }
    
    @Override
    public String toString() {
        String output = "Pair: [" + getFirst() + ", " + getSecond() + "]";
        return output;
    }
    
    public static <E extends Comparable> E min(PairWithMin<? extends Comparable> pair) {
        E first = (E) pair.getFirst();
        E second = (E) pair.getSecond();
        if(first.compareTo(second) > 0)
            return second;
        else
            return first;
    }
}