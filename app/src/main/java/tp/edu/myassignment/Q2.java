package tp.edu.myassignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        System.out.println("Enter lower limit:");
        Scanner int1 = new Scanner(System.in);
        Integer a = int1.nextInt();

        System.out.println("Enter upper limit:");
        Scanner int2 = new Scanner(System.in);
        Integer b = int2.nextInt();

        System.out.println("Counting: ");

        for (int i = a; i<= b; i = i + 1)
        {
            System.out.println(i);
        }

    }

}
