package ge.tbc.testautomation.javaoop.figures;



//Circle-ს უნდა ჰქონდეს მხოლოდ ერთი private double ველი radius.
// ამ კლასს გაუწერეთ სეთერები/გეთერები და ერთ პარამეტრიანი (რადიუსი) კონსტრუქტორი,

import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.RadiusException;

//სადაც შეამოწმეთ, მეტია თუ არა numberOfInstances 5-ზე. თუ არის -
// ისროლეთ LimitException მესიჯით "INSTANTIATION LIMIT REACHED".
//Circle-ს კონსტრუქტორშივე შეამოწმეთ რადიუსი არის თუ არა უარყოფითი მნიშვნელობა.
// თუ არის - ისროლეთ RadiusException მესიჯით "RADIUS VALUE NOT VALID".
public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        if(numberOfInstances > 5){
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
        if(radius <0){
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
        this.radius = radius;
    }
}
