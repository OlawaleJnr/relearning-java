package App.Module3;
import java.lang.*;
import java.util.Scanner;

public class ActivityThree {

    public static void main(String[] args) {
        /*
            Program: Write a program to get the area of a cuboid and volume of a cuboid.
            a) Formula for an area of a cuboid = 2 * (length * height) + (breadth * height) + (length * breadth)
            b) Formula volume of a cuboid = length * breadth * height
         */

        float length, height, breadth, totalArea, volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numeric value for the length of a cube");
        length = sc.nextFloat();

        System.out.println("Enter a numeric value for the height of a cube");
        height = sc.nextFloat();

        System.out.println("Enter a numeric value for the breath of a cube");
        breadth = sc.nextFloat();

        /*
            To calculate the area of a cuboid / cube
         */
        float lh = length * height;
        float bh = breadth * height;
        float lb = length * breadth;

        totalArea = (2 * (lh+ bh + lb));
        System.out.println("values / parameter given: \nLength = " + length + "\nBreadth = " + breadth + "\nHeight = " + height);
        System.out.println("Area of a cube = " + totalArea);

        /*
            To calculate the volume of a cuboid / cube
         */
        volume = (length * breadth * height);
        System.out.println("Volume of a cube = "+ volume);
    }
}
