package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;

public class Circle extends Figure implements IResizableCircle, IValidCircle, Comparable{
    private double radius;
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
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        circle.setRadius(circle.getRadius() * 2);
        return circle;
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        circle.setRadius(circle.getRadius()* byvValue);
        return circle;
    }

    @Override
    public boolean validateCircle(Circle circle) {
        return circle.getRadius() > 0;
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Circle)) { return -1;}
        Circle other = (Circle) o;
        //თუ რადიუსები ერთმანეთის ტოლია დაბრუნოს 0
        if (radius == other.radius) { return 0; }
        // ვთქვათ რომ ის ობიექტია ნაკლები, რომლის რადიუსი ნაკლებია
        return radius < other.radius ? -1 : 1;

    }
}
