import java.util.*;
public class sumOfTwoNumbersUsingInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = input.nextInt();
        System.out.print("Enter the Second number : ");
        int b = input.nextInt();
        System.out.println(a+" + "+b+" = "+ (a+b));
        input.close();
    }
}
