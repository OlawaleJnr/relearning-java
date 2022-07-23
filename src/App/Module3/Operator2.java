package App.Module3;
import java.lang.*;

public class Operator2 {

    public static void main(String[] args) {
        /*
            Increment / Decrement Operators
            ===============================

            We have two aspect of incrementing and decrementing.
            a) post++ (post increment) & post-- (post decrement)
            b) ++pre (pre increment) & --pre (pre decrement)

            Example:
            =======
            1) int x = 5;
            x++;  = 6
            solution: This happens after a change in operation.

            2) int x = 5, y;
            y = x++;
            solution : There are two operations here, The assignment operation (=) and the post increment operation (++)
            In this case the assignment operation (=) is done first because (++) is post increment:
            Which means, use the value of x then increment x by 1
            y = 5; (Assignment Operation =)
            x = 5 + 1 = 6; (Increment Operation ++)

            3) int x = 5, y;
            ++x; = 6
            solution: This will be automatically 6 because the operation is a prefix, which means the increment comes
            first before any other operation.
         */
        
        byte b = 5;
        b = (byte) (b + 1);
        System.out.println(b);
    }
}
