import java.util.*;
public class findFactorialOfnUsingFunction {
    public static int factorial(int a) {
        int fact = 1;
       for(int i = 1; i<=a; i++){
        fact *= i;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int fact = factorial(number);
        System.out.println(fact);
        input.close();
    }
}
