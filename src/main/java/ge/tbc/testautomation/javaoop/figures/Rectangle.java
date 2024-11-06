package ge.tbc.testautomation.javaoop.figures;


//9) შექმენით Rectangle კლასი (ან გამოიყენეთ არსებული) და მისთვის
// დაწერეთ reverse comparator და ამ კომპარატორის მიხედვით დაალაგეთ
// Rectangle ობიექტების ლისტი.
public class Rectangle {
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

    // ფუნქცია პერიმეტრისთვის
    public double getPerimeter() {
        return 2*(a+b);
    }


    //ბეჭდვის ფუნქცია
    public void print(){
        System.out.println("\nმართკუთხედის გვერდებია: " + a + " " +b);
        System.out.println("პერიმეტრი:" + this.getPerimeter());
        System.out.println("ფართობი:" + this.getArea());

    }

    //toString მეთოდის გადაფარვა
    @Override
    public String toString() {
        return "Rectangle perimetr " + getPerimeter();
    }
}
