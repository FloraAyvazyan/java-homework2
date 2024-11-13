package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure {
    private  double a, b;
    //პარამეტრიანი კოსტრუქტორი
    public Rectangle(double b, double a) {
        this.b = b;
        this.a = a;
    }

    // ფუნქცია ფართობისთის
    public double getArea() {
        return a*b;
    }

    @Override
    public double getLength() {return 2*(a+b);}

    @Override
    public void printPackageName() {System.out.println(this.getClass().getPackage().getName());}

    //ბეჭდვის ფუნქცია
    public void print(){
        System.out.println("\nმართკუთხედის გვერდებია: " + a + " " +b);
        System.out.println("პერიმეტრი:" + this.getLength());
        System.out.println("ფართობი:" + this.getArea());

    }

    //toString მეთოდის გადაფარვა
    @Override
    public String toString() {
        return "Rectangle perimetr " + getLength();
    }
}
