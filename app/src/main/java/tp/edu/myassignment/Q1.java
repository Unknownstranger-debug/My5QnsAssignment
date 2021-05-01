package tp.edu.myassignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("First Number: ");
        Scanner int1 = new Scanner(System.in);
        Integer a = int1.nextInt();

        System.out.println("Second Number: ");
        Scanner int2 = new Scanner(System.in);
        Integer b = int2.nextInt();

        System.out.println("Third Number: ");
        Scanner int3 = new Scanner(System.in);
        Integer c = int3.nextInt();

        if ((a < b) && (a < c))
        {
            System.out.println(" The smallest integer is: " + a);
        }
        else if ((b < a) && (b < c))
        {
            System.out.println(" The smallest integer is: " + b);
        }
        else
        {
            System.out.println(" The smallest integer is: " + c);
        }



    }
}
