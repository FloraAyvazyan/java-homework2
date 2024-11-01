package ge.tbc.testautomation.javaoop.runners;

//runners პაკეტში შექმენით Main კლასი, ან წინა დავალების კლასი შეცვალეთ.
// აქ main ფუნქციაში დააინსტანცირეთ წრეწირის ობიექტი და რადიუსად გადაეცით უარყოფითი მნიშვნელობა.

//ეს ქმედება ჩასვით try ბლოკში და გაუწერეთ catch-იც, სადაც დაიჭერთ
// RadiusException-ს და მისი ობიექტიდან დაბეჭდავთ მესიჯს getMessage() მეთოდით.


//ამავე ფუნქციაში დააინსტანცირეთ კიდევ რამდენიმე ობიექტი, სანამ ლიმიტს მიაღწევთ.
// ლიმიტის მიღწევის მომენტიც ანალოგიურად მოათავსეთ try-catch-ში.
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle(-2);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        Random random = new Random();
        for (int i = 2; i <= 5; i++) {
            double randomRadius = 1 + (random.nextDouble() * 10);
            Circle circle = new Circle(randomRadius);
        }
        try {
            Circle circle2 = new Circle(3);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }


        // main ფუნქციაშივე შექმენით String ცვლადი და დააინიციალიზეთ ის ლიტერალით
        // "Test Automation Bootcamp 6, 2022". ჩაატარეთ შემდეგი სტრინგური ოპერაციები:
        //* დაბეჭდეთ მხოლოდ Automation სიტყვა, ოღონდ გადაიყვანეთ დაბალ რეგისტრში და ისე.
        //* გადააქციეთ ეს წინადადება სტრიქონების მასივად და დაბეჭდეთ თითო სიტყვა ცალ-ცალკე ხაზზე.
        //* დაბეჭდეთ ამ წინადედების სიგრძე.
        //* შეცვალეთ ყველა სფეისი (" ") ტირეთი ("-") და დაბეჭდეთ შედეგი

        String str = "Test Automation Bootcamp 6, 2022";
        String result = str.substring(5, 15).toLowerCase();
        System.out.println(result);
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("Str length is " + str.length());
        System.out.println(str.replaceAll(" ", "-"));


        //Main კლასში  შექმენით private static boolean ფუნქცია phoneNumberValidation,
        // რომელიც პარამეტრად მიიღებს String phoneNumber-ს. ამ ფუნქციაში დაწერეთ ასეთი regex pattern:
        //* ნომერი უნდა იწყებოდეს აქედან რომელიმე სამეულით - 555, 595, 592, 599.
        //* ამ სამეულის შემდეგ უნდა მოდიოდეს ნებისმიერი 6 ციფრი [0-9].


        //11) შექმენით String მასივი და ჩაწერეთ ტელეფონის ნომრები ამ ფორმატით (599-144-155-166) -
        // ვალიდურები, არავალიდურები, რამდენსაც მოისურვებთ.
        String[] phoneNumbers = {"599-223-123", "599-131-432", "590-112-165",  "578-888-657"};


        //12) ამ მასივის თითოეულ ელემენტზე გაუშვით phoneNumberValidation
        // ფუნქცია და გზადაგზა დაბეჭდეთ პასუხები.
        for(String number: phoneNumbers) {
            if (phoneNumberValidation(number)) {
                System.out.println(number + " is valid");
            } else {
                System.out.println(number + " is not valid");
            }
        }


    }

    //10) Main კლასში  შექმენით private static boolean ფუნქცია phoneNumberValidation,
    // რომელიც პარამეტრად მიიღებს String phoneNumber-ს.
    // ამ ფუნქციაში დაწერეთ ასეთი regex pattern:
    private static boolean phoneNumberValidation(String phoneNumber) {

        String phoneNumberPattern = "^(555|595|592|599)\\d{6}$";
        String parsedPhoneNumber = phoneNumber.replace("-","");
        boolean result = parsedPhoneNumber.matches(phoneNumberPattern);

        return result;
    }
}



