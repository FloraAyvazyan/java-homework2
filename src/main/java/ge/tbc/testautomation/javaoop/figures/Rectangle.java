package ge.tbc.testautomation.javaoop.figures;
// ამავე პაკეტში დაამატეთ კლასი Rectangle (double a,b ველებით) და
// გახადეთ ის Figure-ს შვილობილი.
//Rectangle კლასში გადაფარეთ (override) Figure-ის ორივე მეთოდი, მაგრამ -1-ის ნაცვლად ამ ფუნქციებმა
//დააბრუნონ მართკუთხედის ფართობისა და პერიმეტრის ფორმულით მიღებული შედეგები.

public class Rectangle extends Figure {
    private  double a, b;

    //პარამეტრიანი კოსტრუქტორი
    public Rectangle(double b, double a) {
        this.b = b;
        this.a = a;
    }
    //გადაფარული ფუნქცია ფართობისთის
    @Override
    public double getArea() {
        return a*b;
    }
    //გადაფარული ფუნქცია პერიმეტრისთვის
    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
    //ბეჭდვის ფუნქცია
    public void print(){
        System.out.println("\nმართკუთხედის გვერდებია: " + a + " " +b);
        System.out.println("პერიმეტრი:" + this.getPerimeter());
        System.out.println("ფართობი:" + this.getArea());

    }
}
