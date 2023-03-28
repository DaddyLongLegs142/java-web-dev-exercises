package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        while (!input.hasNextDouble()) {
            System.out.println("That's not a number!");
            input.next();
        }
        while (input.nextDouble() <= 0) {
            System.out.println("The radius must be a positive number!");
            input.next();
        }
        double radius = input.nextDouble();
        input.close();
        double a = Circle.getArea(radius);
        System.out.println("The circle's area is " + a);
    }
}
