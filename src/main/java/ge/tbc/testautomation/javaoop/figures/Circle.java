package ge.tbc.testautomation.javaoop.figures;

public class Circle {
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
        this.radius = radius;
        numberOfCircleInstances++;
    }

}
