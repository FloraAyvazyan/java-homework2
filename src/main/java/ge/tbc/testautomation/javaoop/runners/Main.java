package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import java.util.Scanner;
import static ge.tbc.testautomation.javaoop.util.HelperFunctions.compareRectangles;

public class Main {
    public static void main(String[] args) {
        //ცოტა ექსპერიმენტები ჩავატარე :დდ

        //კლავიატურიდან წაკითხვისთვის
        Scanner sc = new Scanner(System.in);
        //ქმნის მართკუტხედის 2 ეგზემპლიარს და ბეჭდავს ინფორმაციას მის შესახებ
        Rectangle rectangle1 = new Rectangle(4, 71);
        rectangle1.print();
        Rectangle rectangle2 = new Rectangle(4, 5);
        rectangle2.print();
        compareRectangles(rectangle1, rectangle2);  // შეადარებს ორ მართკუთხედების პერიმეტრებს

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //სამკუთხედის ობიექტის შექმნა და მისი ველების წაკითხვა კავიატურიდან
        System.out.println("\nშემოიყეთ სამკუთხედის გვერდები და სიმაღლე");
        System.out.print("a->");
        double a = sc.nextDouble();
        System.out.print("b->");
        double b = sc.nextDouble();
        System.out.print("c->");
        double c = sc.nextDouble();
        System.out.print("h->");
        double h = sc.nextDouble();

        //სიმაღლე არ არის შემოწმებული ;D
        if (a + b > c && a + c > b && b + c > a) {  //ამოწმებს ამკუთხედის არსებობის აუცილებელი პირობა
            System.out.println("თქვენი სამკუთხედი წარმატებით შექმნილია ");
            Triangle triangle = new Triangle(a, b, c, h); //ქმნის ახალ ობიექტს და ბეჭდავს ინფორმაციას
            triangle.print();

        } else {  //წინააღმდეგ შემთხვევაში მივიღებს შესაბამისი შეტყობინებას
            System.out.println("სამწუხაროდ თქვენი სამკუთხედი არ შეიქმნა გაითვალისწინეტ " +
                    "რომ a + b >c, a + c > b, b + c > a ");
        }


    }


}
