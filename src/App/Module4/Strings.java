package App.Module4;
import java.lang.*;

public class Strings {

    public static void main(String[] args) {
        /*
            Strings
            =======
            String is a datatype
            String is a collection of characters that forms word or sentences

            String Declaration
            ==================
            String str1 = "Java Program"

            str1 = reference
            Java Program = String Literal

            String Constructors
            ===================
            String(char[])
            String(byte[])
            String(String)
         */
        char[] c = {'A', 'B', 'C', 'D'};
        String str1 = new String(c);
        System.out.println(str1+"\n");

        byte[] b = {65, 66, 67, 68};
        String str2 = new String(b);
        System.out.println(str2+"\n");

        String s1 = "Java";
        System.out.println(s1);

        String msg1 = "MideCoder";
        String msg2 = "MideCoder";
        System.out.println(msg1.equals(msg2));

        // Experiment
        String message = "Java";

        // Get the length of the string
        int length = message.length();
        System.out.println(length);

        // Convert string to uppercase
        System.out.println(message.toLowerCase());

        // Convert string to lowercase
        System.out.println(message.toUpperCase());

        // Remove white spaces from strings
        String name = "  Talabi Ayomide  ";
        System.out.println(name.trim());

        // Substring (int begin) gets the remaining strings after the beginning index
        System.out.println(message.substring(2));

        // Substring (int begin, int end) get the strings from the specified beginning and the specified end
        System.out.println(message.substring(1, 3));

        // Replace a string from old character to a new character
        System.out.println(message.replace('a', 'e'));

        String website = "www.google.com";
        // Get the character at a given string using index number
        System.out.println(website.charAt(3));

        // Get the index number of a character in a string
        System.out.println(website.indexOf("."));

        //
        System.out.println(website.lastIndexOf("w", 7));

        // Check if strings are equal or not
        String s2 = "JAVA", s3 = "java", s4 = "Python", s5 = "Python";
        System.out.println(s4.equals(s5));
        System.out.println(s2.equals(s3));

        // check if a string is equal by ignoring the string case
        System.out.println(s2.equalsIgnoreCase(s3));

        // Check if a word exist in a string
        String val = "The great city of china";
        System.out.println(val.contains("china"));

        // Join two string by concat two strings
        String val1 = "The great wall";
        String val2 = " of China";
        System.out.println(val1.concat(val2));
    }
}
