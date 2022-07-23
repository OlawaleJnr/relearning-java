package App.Module3;

public class Operator {

    public static void main(String[] args) {
        /*
            Operator
            ==========

            Types of operators
            ==================
            1. Arithmetic operators (*, /, %, +, -)
            2. Bitwise Operators (&, ~, ^, <<, >>, >>>)
            3. Logical operators (&&, ||, !)
            4. Increment / Decrement (post ++, post --, ++pre, --pre)
            5. Relational Operator (<, >, <=, >=, ==, =!)

            Precedence of operators
            =======================
            Precedence simply means an operator that will get executed first.
            1) Arithmetic Operator:
                a) (*. /, %) = highest precedence
                b) (+, -) = lower precedence
                To make a lower precedence comes first we will use the () bracket
                symbol to make the precedence of a lower move to a higher precedence.

            Arithmetic of datatype
            =====================
            x = b (byte) + s (short) = int
            x = s (short) + i (integer) = int
            x = i (integer) + f (float) = float
            x = l (long) + f (float) = float
            x = c (char) + s (short) = int
            x = c (char) + i (integer) = int
            x = f (float) + d (double) = double
            x = l (long) + d (double) = double
         */

        int a = 14, b = 5;

        int divide = a/b;

        /*
            To get float datatype as the result then comes type casting.
         */
        float divisible = (float) (a / b);

        int modulo = a%b;

        System.out.println(divide);
        System.out.println(divisible);
        System.out.println(modulo);

        float c = 14.3f, d =3.2f;
        float e = c/d;
        float f = c%d;

        System.out.println(e);
        System.out.println(f);

        /*
            Program on Arithmetic of datatype
         */
        byte g = 10;
        short h = 15;

        int i = g + h;
        System.out.println(i);

        /*
            Arithmetic on expressions
         */
        System.out.println((10 + 20) / 2);
    }
}
