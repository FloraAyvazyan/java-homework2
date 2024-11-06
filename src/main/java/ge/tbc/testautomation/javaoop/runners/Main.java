package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ვქმნით ორ Circle ობიექტს, ერთს დადებითი და მეორეს უარყოფითი რადიუსით
        Circle positiveRadiusCircle = new Circle(7);
        Circle negativeRadiusCircle = new Circle(-5);

        // ვიძახებთ საერთო მეთოდს თითოეული წრეწირის ობიექტისთვის
        demonstrateCircle(positiveRadiusCircle, "\nCircle No1");
        demonstrateCircle(negativeRadiusCircle, "\nCircle No2");
    }

    // საერთო მეთოდი წრეწირის დემონსტრაციისთვის
    private static void demonstrateCircle(Circle circle, String circleName) {
        System.out.print(circleName + "\nRadius = " + circle.getRadius());

        if (circle.validateCircle(circle)) {
            System.out.println("\nArea: " + circle.getArea());
            System.out.println("Length: " + circle.getLength());
            circle.printPackageName();

            // IResizableCircle მეთოდების დემონსტრაცია
            circle = circle.returnDoubleSizedCircle(circle);
            System.out.println("Double Sized Circle Radius: " + circle.getRadius());

            // მომხმარებლის შეყვანის მოთხოვნა
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the multiplier to scale the circle's radius: ");
            double multiplier = scanner.nextDouble();

            // რადიუსის გაზრდა შეყვანილი მნიშვნელობის მიხედვით
            circle = circle.returnCustomSizedCircle(circle, multiplier);
            System.out.println("Custom Sized Circle Radius: " + circle.getRadius());

        } else {
            System.out.println("\nCircle's radius is not valid.");
        }
    }
}
