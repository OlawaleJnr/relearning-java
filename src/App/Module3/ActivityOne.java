package App.Module3;
import java.lang.*;
import java.util.Scanner;

public class ActivityOne {

    public static void main(String[] args) {
        /*
            Program 1: Calculate the area of a triangle from a user input
         */
        Scanner sc = new Scanner(System.in);

        float area, base, height;

        System.out.println("Enter base of a triangle:");
        base = sc.nextFloat();

        System.out.println("Enter height of a triangle");
        height = sc.nextFloat();

        area = (base * height) / 0.5f;
        System.out.println("The area of a triangle with base (" + base + ") and height (" + height + ") = " + area);

        /*
            Program 2: Area of a triangle using all three sides
         */
        System.out.println("\n\nStarting second program!!!");
        int a, b, c;
        float s, result;

        System.out.println("Enter Dimension A");
        a = sc.nextInt();

        System.out.println("Enter Dimension B");
        b = sc.nextInt();

        System.out.println("Enter Dimension C");
        c = sc.nextInt();

        s = (a + b + c) / 2f;

        result = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle with dimension a(" + a + "), b(" + b + "), c(" + c + ") = " + result);
    }
}
