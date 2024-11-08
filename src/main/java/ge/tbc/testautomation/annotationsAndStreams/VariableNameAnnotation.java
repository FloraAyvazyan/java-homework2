package ge.tbc.testautomation.annotationsAndStreams;

//2) ზემოხსენებულ პაკეტში შექმენით ანოტაცია VariableNameAnnotation
// ერთი String ველით name, default მნიშვნელობა იყოს "Default Value".

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//3) ამ ანოტაციას გაუწერეთ Target ისე, რომ ის ვრცელდებოდეს მხოლოდ ცვლადებზე.
// მეთოდებზე და კლასებზე ამ ანოტაციას ვერ უნდა ვწერდეთ.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //ველებზე
public @interface VariableNameAnnotation {
    String name() default  "Default Value";

}
