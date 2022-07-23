package App.Module3;
import java.lang.*;
import java.util.Scanner;

public class ActivityTwo {

    public static void main(String[] args) {
        /*
            Program 1: Write a program that can to find the root of a quadratic equation.
         */

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double r1, r2;

        System.out.println("Enter Co-efficient of a:");
        a = sc.nextInt();

        System.out.println("Enter Co-efficient of b:");
        b = sc.nextInt();

        System.out.println("Enter Co-efficient of c:");
        c = sc.nextInt();

        /*
            Solve for R1
         */
        double equation = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        r1 = (-b + equation)/(2 * a);
        System.out.println("Root R1 of the quadratic equation = " + r1);

        /*
            Solve for R2
         */
        r2 = (-b - equation)/(2 * a);
        System.out.println("Root R2 of the quadratic equation = " + r2);
    }
}