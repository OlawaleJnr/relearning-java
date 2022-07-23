package App.Module4;
import java.lang.*;

public class ActivityFive {
    public static void main(String[] args)
    {
        /*
            Exercise
            ========

            1. Find if a number is a binary or not
            2. Find if a number is Hexadecimal or not
            3. Find if a data is in date format (dd/mm/yyy)
         */

        // Solution 1
        int binary = 10110001;
        // convert integer to string using String.valueof() Static method
        String strBinary = String.valueOf(binary);
        System.out.println(strBinary.matches("([01])+"));
        System.out.println(strBinary.matches("[01]+"));

        // Solution 2
        String hexadecimal = "2F";
        System.out.println(hexadecimal.matches("[0-9A-F]+"));

        // Solution 3
        String date = "19/12/2012";
        System.out.println(date.matches("([0-3][0-9])/([01][0-9])/(\\d{4})"));

        /*
            Exercise 2
            ===========

            1. Remove special characters from a string
            2. Remove extra spaces from a string
            3. Find number of words in a string
         */

        // Solution 1
        String str = "a!b@c#1$2%3", newreplace;
        System.out.println(str.replaceAll("(\\W)",""));
        System.out.println(str.replaceAll("([^a-zA-Z0-9])",""));

        // Solution 2
        String str1 = "   abc   de fgh  ijk  ";
        System.out.println(str1.replaceAll("(\\s+)", " "));
        System.out.println(str1.replaceAll("(\\s+)", " ").trim());

        // Solution 3
        String str2 = "Joseph likes inumidun and they love playing on the bed";
        System.out.println(str2.split("(\\s)").length +" words");
    }
}
