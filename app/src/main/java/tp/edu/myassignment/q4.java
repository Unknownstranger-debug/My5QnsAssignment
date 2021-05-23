package tp.edu.myassignment;

import java.util.Scanner;

public class q4 {
    public static int calculatePrice(int noOfIpad)
    {
        int cost = 1000;
        int total = noOfIpad*cost ;
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of iPad/iPads");
        Scanner sc = new Scanner(System.in);
        Integer amt = sc.nextInt();

        int total = calculatePrice(amt);
        if(amt > 1){
            System.out.println("The total cost of " + amt + " iPads is : $" + total);
        }
        else{
            System.out.println("The total cost of " + amt + " iPad is : $" + total);
        }

    }

}

