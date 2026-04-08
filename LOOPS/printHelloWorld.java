package LOOPS;

import java.util.*;

public class printHelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int i = 1;
        if (number <= 0) {
            System.out.println("please enter a positive number!");
        } else {
            while (i <= number) {
                System.out.println("Hello World : "+i);
                i++;
            }
            System.out.println("finnaly print " + number + " times 'Hello World'");
        }
        input.close();
    }
}