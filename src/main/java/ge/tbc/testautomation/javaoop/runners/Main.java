package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Circle კლასის 5 ინსტანციის შექმნა
        for (int i = 1; i <= 5; i++) {
            double randomRadius = 1 + (random.nextDouble() * 10); // რადიუსი 1-დან 10-მდე
            Circle circle = new Circle(randomRadius);
            System.out.println("Circle #" + i + " :)");
            System.out.println("Number of Circle Instances: " + Circle.numberOfCircleInstances);
            String result = Util.circleToString(circle);
            System.out.println(result);
            System.out.println();
        }
    }
}
