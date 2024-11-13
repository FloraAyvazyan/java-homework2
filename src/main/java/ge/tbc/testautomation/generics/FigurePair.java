package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.javaoop.figures.Figure;

//განზოგადებული კლასი
public class FigurePair<E extends Figure, T extends Figure>{
    //კლასის განზოგადებული ველები
    private E elementOne;
    private T elementTwo;

    //პარამეტრიანი კონსტრუქტორი
    public FigurePair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    //Getter ფუქციები
    public E getElementOne() {return elementOne;}
    public T getElementTwo() {return elementTwo;}

    //Setter ფუნქციები
    public void setElementOne(E elementOne) {this.elementOne = elementOne;}
    public void setElementTwo(T elementTwo) {this.elementTwo = elementTwo;}

    //გადაფარული toString() მეთოდი
    @Override
    public String toString() {
        return "FigurePair{" + "elementOne=" + elementOne + ", elementTwo=" + elementTwo + '}';
    }
}
