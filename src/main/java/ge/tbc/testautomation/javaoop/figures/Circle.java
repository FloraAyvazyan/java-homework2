package ge.tbc.testautomation.javaoop.figures;


import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;


//არსებული Circle კლასი გახადეთ აბსტრაქტული Figure-ის შვილობილი.

//Circle-ში კომპილატორი მოგთხოვთ მეთოდების რეალიზაციას:
// getArea და getLength წინა დავალების მსგავსად, ხოლო
//printPackage-ში დაბეჭდეთ მიმდინარე ობიექტის კლასის პაკეტის
// დასახელება (ეს უკანასკნელი ნაწილი მოიძიეთ ინტერნეტში).

//6) არსებულ Circle კლასს დააიმპლემენტირებინეთ IResizableCircle ამგვარად:

//Circle კლასში დააიმპლემენტირეთ ეს ინტერფეისიც და რეალიზაცია გაუკეთეთ მის მეთოდსაც:


public class Circle extends Figure implements IResizableCircle, IValidCircle {
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
       // if (numberOfInstances > 5) {
       //     throw new LimitException("INSTANTIATION LIMIT REACHED");
       // }
       // if (radius < 0) {
       //     throw new RadiusException("RADIUS VALUE NOT VALID");
       // }
        this.radius = radius;

        System.out.print("Created new Circle object");

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

    //* returnDoubleSizedCircle მეთოდმა დააბრუნოს გადაცემული წრეწირი გაორმაგებული რადიუსით.
    //* returnCustomSizedCircle მეთოდმა დააბრუნოს გადაცემული წრეწირი,
    // რომლის რადიუსიც გადაცემულ რიცხვზეა გამრავლებული.
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

    //* validateCircle მეთოდმა დააბრუნოს true თუ გადაცემული წრეწირის რადიუსი დადებითი
    // მნიშვნელობისაა,
    // წინააღმდეგ შემთხვევაში - false.
    @Override
    public boolean validateCircle(Circle circle) {
        return circle.getRadius() > 0;
    }


}
