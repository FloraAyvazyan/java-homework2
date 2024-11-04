package ge.tbc.testautomation.javaoop.figures;

// არსებული Figure კლასი გახადეთ აბსტრაქტული და გაწერეთ
// სამი public აბსტრაქტული მეთოდის სიგნატურა:
//* public abstract double getArea();
//* public abstract double getLength();
//* public abstract void printPackageName();
public abstract class Figure {
    public static int numberOfInstances;
    public Figure() {
        numberOfInstances++;
    }
    public abstract double getArea();
    public abstract double getLength();
    public abstract void printPackageName();
}
