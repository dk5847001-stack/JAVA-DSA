import java.util.*;
public class productOfTwoNumbersUsingFunction {
    public static int productOfTwoNumber(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        int product = productOfTwoNumber(num1, num2);
        System.out.println(num1+" x "+num2+" = "+product);
        input.close();
    }
}
