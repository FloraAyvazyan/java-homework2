package ge.tbc.testautomation.javaoop.runners;

//1) ge.tbc.testautomation.runners პაკეტში დაამატეთ ContainersAndComparing კლასი.

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.util.ReverseComparator;

import java.util.*;

// ამ კლასის main მეთოდში შექმენით String ელემენტების მქონე ArrayList და დაამატეთ ეს ელემენტები:
//* "555-542-231", "555-887-987", "555-161-143", "555-189-6667".
public class ContainersAndComparing {
    @SuppressWarnings("All")
    public static void main(String[] args) {
        //ახალი სიის შექმნა
        ArrayList<String> arrList = new ArrayList<>();
        //სიაში ელემენტების ჩამატება
        arrList.add("\n555-542-231");
        arrList.add("555-887-987");
        arrList.add("555-161-143");
        arrList.add("555-189-6667");

        //დაბეჭდეთ ამ ლისტის ყველა ელემენტი იტერატორის გამოყენებით.
        Iterator<String> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        //4) შექმენით HashMap. ამ HashMap-ში მოათავსეთ მეორე მითითებაში შექმნილი
        // ლისტის ელემენტები, როგორც value-ები, და key-ებად მოუფიქრეთ სახელები.
        // ანუ რომ გამოვიდეს მაგალითად ასე: key="გიორგი", value="555-887-987";
        HashMap<String, String> phoneMap = new HashMap<>();
        phoneMap.put("Vard", arrList.get(0));
        phoneMap.put("Giorgi", arrList.get(1));
        phoneMap.put("Irakli ", arrList.get(2));
        phoneMap.put("Karina", arrList.get(3));

        //5) გამოდის, რომ ზემო HashMap-ში იქნება <სახელი-ტელეფონის ნომერი> წყვილები.
        // დაბეჭდეთ ყველა სახელი, ანუ key, რომლის ტელეფონის ნომერიც (value) შეიცავს რვიანს.

        for (Object key : phoneMap.keySet()) {
            String value = (String) phoneMap.get(key); //დაყვანა
            if (value.contains("8")) {
                System.out.println(key + ": telefonis nomers sheicavs simbobolo '8'");
            }
        }

        //7) შექმენით Circle ტიპის ელემენტების მქონე TreeSet და
        // დაამატეთ 10 წრეწირის ობიექტი, ზოგს იგივე რადიუსები დაუწერეთ. დაბეჭდეთ ეს TreeSet.
        TreeSet circles = new TreeSet();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomRadius = 1 + random.nextInt(5);  // 1-დან 5-მდე რანდომული მთელი რიცხვი
            Circle cobj = new Circle(randomRadius);  //ახალი ობიექტის შქმნა რადომ რადიუსით
            circles.add(cobj); //ამ ობიექტის   TreeSet ში ჩამატება
        }
        //ბეჭდვა
        System.out.println("\nTreeSet of Circles:");
        circles.forEach(System.out::println);

        //8) გაიმეორეთ მეშვიდე მითითებები HashSet-ისთვისაც.
        HashSet circlesSet = new HashSet();
        for (int i = 0; i < 10; i++) {
            int randomRadius = 1 + random.nextInt(5);  // 1-დან 5-მდე რანდომული მთელი რიცხვი
            Circle cobj = new Circle(randomRadius);
            circlesSet.add(cobj);
        }
        System.out.println("\n\nHashSet of Circles:");
        circlesSet.forEach(System.out::println);


        //შექმენით Rectangle კლასი (ან გამოიყენეთ არსებული) და მისთვის დაწერეთ reverse comparator და
        // ამ კომპარატორის მიხედვით დაალაგეთ Rectangle ობიექტების ლისტი.
        Rectangle[] rectangles = {new Rectangle(4, 5), new Rectangle(2, 8),
                new Rectangle(6, 8), new Rectangle(4, 6), new Rectangle(2, 9)};

        ReverseComparator comp = new ReverseComparator();
        Arrays.sort(rectangles, comp);

        System.out.println("\nRectangles perimetris mixedvit: klebatobit");
        //ელემენტების ბეჭდვა
        for (Object rectangle : rectangles) {
            System.out.println((Rectangle) rectangle);
        }
    }

}