package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Analyzable კლასის ყველა ველის მიღება
        Field[] fields = Analyzable.class.getDeclaredFields();

        //  Streams-ის გამოყენებით ორი სიის შექმნა
        List<Field> matchingFields =
                java.util.Arrays.stream(fields)
                        .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class) &&
                                field.getAnnotation(VariableNameAnnotation.class).name().equalsIgnoreCase(field.getName()))
                        .collect(Collectors.toList());

        List<Field> nonMatchingFields =
                java.util.Arrays.stream(fields)
                        .filter(field -> field.isAnnotationPresent(VariableNameAnnotation.class) &&
                                !field.getAnnotation(VariableNameAnnotation.class).name().equalsIgnoreCase(field.getName()))
                        .collect(Collectors.toList());


        //ბეჭდვა
        System.out.print("\nmatching the annotation name: [");
        for (Field field : matchingFields) {
            System.out.print(field.getName() + ", ");
        }
        System.out.println(']');

        System.out.println();

        System.out.print("Not matching the annotation name: [");
        for (Field field : nonMatchingFields) {
            System.out.print(field.getName() + ", ");
        }
        System.out.println(']');


        //7) main-ში შექმენით რამდენიმე ნებისმიერი სახის ცვლადი და არსად გამოიყენოთ,
        // მაგრამ ქენით ისე, რომ კომპაილერმა unused ცვლადის შენიშვნა არ ამოაგდოს.

        @SuppressWarnings("unused")
        String str1 = ":)";

        //@SuppressWarnings("unused")
        int age = 20;

    }
}