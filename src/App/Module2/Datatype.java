package App.Module2;
import java.lang.Integer;

public class Datatype {

    public static void main(String[] args) {
        /*
            Understanding Datatype
            Primitive datatype
            ==================
            1. Integral (for storing numbers without decimal point)
                a) Byte (size: 1 byte, range: -128 to 127, default: 0)
                b) Short (size: 2 byte, range: -32768 to 32767, default: 0)
                c) Int (size: 4 byte, range: -2147483648 to 2147483647, default: 0)
                d) Long (size: 8 byte, range: ----, default: 0)
            2. Floating point (for storing numbers with decimal point)
                a) Float (size: 4 byte, default: 0.0f)
                b) Double (size: 8 byte, default: 0.0d)
            3. Char (for storing strings) (size: 2 byte)
            4. Boolean (for storing true / false) (size: null, range: true / false, default: false)
        */

        /*
            Program 1: How to get the min, max and byte of an Integer range datatype
         */
        System.out.println("Minimum Integer range: " + Integer.MIN_VALUE);
        System.out.println("Maximum Integer range: " + Integer.MAX_VALUE);
        System.out.println("Byte of an Integer: " + Integer.BYTES);

        /*
            Program 2: How to get the min, max and byte of a Byte range datatype
         */
        System.out.println("\nMinimum Byte range: " + Byte.MIN_VALUE);
        System.out.println("Maximum Byte range: " + Byte.MAX_VALUE);
        System.out.println("Byte of a Bytes: " + Byte.BYTES);
    }
}
