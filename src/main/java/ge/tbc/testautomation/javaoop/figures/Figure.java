package ge.tbc.testautomation.javaoop.figures;
//figures პაკეტში შექმენით კლასი Figure და იქ გაწერეთ
// ორი ღია უპარამეტრო მეთოდი getArea და getPerimeter. ორივე აბრუნებს ათწილადს, -1.0-ს.

//// Figure კლასს გაუწერეთ ერთი public static int ველი numberOfInstances
//// და ამავე კლასის უპარამეტრო კონსტრუქტორში გაზარდეთ იგი, ან დატოვეთ იგივე წინა დავალებიდან.\

public class Figure {
    public static int numberOfInstances;

    public Figure() {
        numberOfInstances++;
    }

    public double getArea(){
        return -1.0;
    }
    public double getPerimeter(){
        return -1.0;
    }
}
