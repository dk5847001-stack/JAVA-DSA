import java.util.*;
public class productOfTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = input.nextInt();
        System.out.print("Enter the second number : ");
        int b = input.nextInt();
        int product = a * b;
        System.out.println(a+" X "+b+" = "+ product);
        input.close();
    }
}
