package ge.tbc.testautomation.javaoop.figures;

//Figure კლასს გაუწერეთ ერთი public static int ველი numberOfInstances
// და ამავე კლასის უპარამეტრო კონსტრუქტორში გაზარდეთ იგი, ან დატოვეთ იგივე წინა დავალებიდან.
public class Figure {
    public static int numberOfInstances;


    public Figure() {
        numberOfInstances++;
    }
    public double getArea(){
        return -1;
    }
    public double getPerimeter(){
        return -1;
    }
}
