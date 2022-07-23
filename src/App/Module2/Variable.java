package App.Module2;

public class Variable {

    public static void main(String[] args) {
        /*
            Variables & Literals
            ====================

            Declaring a variable is done by:
            =====================
            byte b;
            String name;
            int a, b, c;
            char letters;
            float num;

            Initialization of a variable is done by:
            =======================================
            b = 1;
            b = 5;
            name = "Ayomide";
            a = 250, b = 400, c = 10;
            letters = 'A';
            letters = 'T';
            float num = 33.5F;
         */

        /*
            Program 1: Brief run on declaration and initialization
         */
            byte no;
            String name;
            int a, b, c;
            char letter;
            float num;

        /*
            Naming Convention / Rules
            =========================
            1. Case Sensitive
            2. contains Alphabet, numbers or $
            3. starts with Alphabet or $
            4. should not be a keyword
            5. should not be a class name if class is in use
            6. follow camelCase
         */

            no = 4;
            name = "Mide Coder";
            a = 5;
            b = 20;
            c = 400;
            letter = 'A';
            num = 40.2F;

            System.out.println(no);
            System.out.println(name);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(letter);
            System.out.println(num);

        /*
            Literals
            ========
            Literals are constant values that are used in a program.

            z = 5 * x + 7 * y (Expression)
            In this expression:
            5 = Literal
            7 = Literal

            Types of literal
            ================
            1. Integer Literal: (5, 7)
            2. Double  Literal: (137.34, 100.43, 3.142)
            3. String Literal: ("Ayomide", "Mide", "Coder", 'A', 'V');

            Declaration and Initialization of a Literal
            ===========================================
            long datatype = 5L, 87L
            float datatype = 3.142F
            double datatype = 45.345D
            char datatype = 'A', ' '
            boolean datatype = true / false
         */

        /*
            Program: Printing Unicode Symbols (Φ)
         */
            char symbol = 0x03A6;
            System.out.println(symbol);
    }
}
