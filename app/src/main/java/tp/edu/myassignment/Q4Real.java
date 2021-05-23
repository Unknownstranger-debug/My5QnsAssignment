package tp.edu.myassignment;

import java.util.Scanner;

public class Q4Real {
    public static int calculatePrice(int noOfIpad)
    {
        int cost = 1000;
        int total = noOfIpad*cost ;
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of iPads");
        Scanner sc = new Scanner(System.in);
        Integer amt = sc.nextInt();

        int total = calculatePrice(amt);
        System.out.println("The total cost of " + amt + " iPads is : $" + total);


    }
}
