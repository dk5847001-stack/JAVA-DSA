import java.util.*;
public class pQ{
    public static int avg(int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter third number : ");
        int num3 = input.nextInt();
        input.close();
        int average = avg(num1, num2, num3);
        System.out.println("The average is: " + average);
    }
}