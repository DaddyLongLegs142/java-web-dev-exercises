package exercises;
import java.util.Scanner;
public class mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How far have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much fuel have you consumed? (in gallons)");
        double fuelGallons = input.nextDouble();
        double mpg = miles / fuelGallons;
        System.out.println("Your fuel economy is " + mpg + " miles per gallon.");
    }
}
