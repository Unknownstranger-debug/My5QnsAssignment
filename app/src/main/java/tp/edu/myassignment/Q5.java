package tp.edu.myassignment;

import java.util.Scanner;

public class Q5 {
    public static int computeProduct (int first, int second)
    {
        int total = first * second;
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner fir = new Scanner(System.in);
        Integer first = fir.nextInt();

        System.out.println("Enter second number:");
        Scanner sec = new Scanner(System.in);
        Integer second = sec.nextInt();

        int total = computeProduct(first, second);

        if(first>=10 && first <=50 && second>=10 && second <=50)
        {
            System.out.println("The product of " + first +" & " + second + " is : " + total);
        }
        else
        {
            System.out.println("Out of range");
        }
    }
}
