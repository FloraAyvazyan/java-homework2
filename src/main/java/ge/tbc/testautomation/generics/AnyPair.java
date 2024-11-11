package ge.tbc.testautomation.generics;
//გნაზოგადებული კლასი
public class  AnyPair<E,T> {
    //კლასის განზოგადებული ველები
    private E elementOne;
    private T elementTwo;

    //პარამეტრიანი კონსტრუქტორი
    public AnyPair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    //Getter ფუნქციები
    public E getElementOne() {return elementOne;}
    public T getElementTwo() {return elementTwo;}

    //Setter ფუნქციები
    public void setElementOne(E elementOne) {this.elementOne = elementOne;}
    public void setElementTwo(T elementTwo) {this.elementTwo = elementTwo;}

    //toString() მეთოდი
    @Override
    public String toString() {
        return "AnyPair{" + "elementOne=" + elementOne + ", elementTwo=" + elementTwo + '}';
    }
}
