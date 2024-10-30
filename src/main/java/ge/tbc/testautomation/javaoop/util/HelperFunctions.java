package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

//აქ დაწერეთ ღია სტატიკური void ფუნქცია compareRectangles() რომელიც
//პარამეტრად მიიღებს ორ Rectangle ტიპის ობიექტს. ამ ფუნქციამ უნდა შეადაროს
// ორი მართხუთხედის პერიმეტრები ერთმანეთს (getPerimeter()-ების შედარება).
// ამ ფუნქციამ უნდა დაბეჭდოს პასუხი ამ ფორმატით:
//"parameter 1 > parameter 2". < სიმბოლო შეგიძლიათ ჩაანაცვლოთ
//\> ან = სიმბოლოებით შემთხვევიდან გამომდინარე.


public class HelperFunctions {
    public static void compareRectangles(Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() < r2.getPerimeter()) {
            System.out.println("parameter 1 < parameter 2");
        }else if(r1.getPerimeter() > r2.getPerimeter()){
            System.out.println("parameter 1 > parameter 2");

        }else{
            System.out.println("parameter 1 = parameter 2");

        }
    }
}
