package ge.tbc.testautomation.javaoop.figures;


import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

//Circle-ს უნდა ჰქონდეს მხოლოდ ერთი private double ველი radius.
// ამ კლასს გაუწერეთ სეთერები/გეთერები და ერთ პარამეტრიანი (რადიუსი) კონსტრუქტორი,
//სადაც შეამოწმეთ, მეტია თუ არა numberOfInstances 5-ზე. თუ არის -
// ისროლეთ LimitException მესიჯით "INSTANTIATION LIMIT REACHED".
public class Circle extends Figure {
    private double radius;
    public static int numberOfCircleInstances;

    //Getter ფუნქცია
    public double getRadius() {
        return radius;
    }

    //Setter ფუნქცია
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //პარამეტრიანი კონსტრუქტორი
    public Circle(double radius) {
        if (numberOfInstances > 5) {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
        if (radius < 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
        this.radius = radius;
        numberOfCircleInstances++;
    }

}
