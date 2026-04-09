import java.util.*;
public class sumOfTwoDigits {
    public static void sum(int num1, int num2) {
        int Sum = num1 + num2;
        System.out.println("Sum = "+Sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = input.nextInt();
        sum(a, b);
    }
}
