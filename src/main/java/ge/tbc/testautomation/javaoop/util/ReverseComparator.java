package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.util.Comparator;

public class ReverseComparator implements Comparator {

    @Override
    //მეთოდის გადაფარვა
    public int compare(Object o1, Object o2) {
        Rectangle r1 = (Rectangle)o1;
        Rectangle r2 = (Rectangle)o2;
     // ავიღოთ პერიმეტრები
        double perimetr1 = r1.getLength();
        double perimetr2 = r2.getLength();

        //კლებატობით დალაგება
        return - Double.compare(perimetr1, perimetr2);
    }
}
