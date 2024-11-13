package ge.tbc.testautomation.javaoop.figures;

public class Triangle {
    private  double a, b, c, h;
    //პარამეტრიანი ონსტრუქტორი
    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.h = h;
        this.c = c;
        this.b = b;
    }

    // ფუნქციები
    public double getArea() {
        return (a*h)/2;
    }
    public double getPerimeter() {
        return a +b +c;
    }


    //ბეჭდვის ფუნქცია
    public void print(){
        System.out.println("\nსამკუთხედის  გვერდებია: " + a + " " +b + " " +c +" სიმაღლე " + h);
        System.out.println("პერიმეტრი:" + this.getPerimeter());
        System.out.println("ფართობი:" + this.getArea());


    }
}
