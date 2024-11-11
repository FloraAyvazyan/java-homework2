package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        //getDeclaredFields მეთოდის გამოძაება
        AnyPair<Field[], Field[]> fieldsPair = getDeclaredFields(1, ":)");

        List<Field> firstList = Arrays.asList(fieldsPair.getElementOne());
        List<Field> secondList = Arrays.asList(fieldsPair.getElementTwo());

        //ველების ბეჭდვა
        System.out.println("\nInteger-ის ველები");
        for(Field field : firstList){
            System.out.print(field.getName() + ", ");
        }
        System.out.println("\nString-ის ველები");
        for(Field field : secondList){
            System.out.print(field.getName() + ", ");
        }
        System.out.println();

        //Circle და Rectangle კლასების ობიექტის შექმნა
        Circle c1 = new Circle(4);
        Rectangle r1 = new Rectangle(3, 7);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(c1, r1);

        //FigurePair-ის ბეჭდვა
        System.out.println("\nFigurePair");
        System.out.println(figurePair);
    }

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo ){
        Field[] objOneFields = objOne.getClass().getDeclaredFields();
        Field[] objTwoFields = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(objOneFields, objTwoFields);
    }
}