package App.Module1;
import java.lang.*;
import java.util.Scanner;

public class ReadKeyboard {
    /*
        Understanding how to read inputs from the keyboard using java.util.Scanner; package.
        Available methods using Scanner
        ===============================
        nextInt(), nextFloat(), nextDouble(), next(), nextLine(), nextByte(), nextShort(), nextLong(), nextBoolean()
        hasNextInt(), hasNextFloat()
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Testing Scanner Methods
            Program 1 (Adding 2 numbers together)
         */
        int a, b, sum;
        System.out.println("Enter First Number");
        a = sc.nextInt();

        System.out.println("Enter Second Number");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("The sum of "+ a + " and " + b + "= " + sum);

        /*
            Program 2 (Experimenting next())
         */
        String name;
        System.out.println("May i know your name?");
        name = sc.next();
        System.out.println("Welcome Mr / Miss" + name);

        /*
            Program 3 (Experimenting nextFloat())
         */
        float x;
        System.out.println("Enter a float number");
        x = sc.nextFloat();
        System.out.println("Float number = " + x);

        /*
            Program 4 (Experimenting nextLine())
         */
        String txt;
        System.out.println("Enter any word of your choice:");
        txt = sc.nextLine();
        System.out.println(txt);

        /*
            Program 5 (Experimenting useRadix())
         */
        int y;
        sc.useRadix(2);
        System.out.println("Enter a binary number for conversion");
        y = sc.nextInt();
        System.out.println("Conversion of " + y + " to decimal /  base 10 = " + y);
    }
}
