package LOOPS;

import java.util.*;

public class pQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int fact = 1;

        if (number < 0) {
            System.out.print("Please enter a positive number\n");
            System.out.print("you can try again!\n");
        } else {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + number + " is : " + fact);
        }
        input.close();
    }
}
