import java.util.*;
public class swapNumberUsingFunction {
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("------------------: After swaping :------------------");
        System.out.println("1st number = "+a);
        System.out.println("2nd number = "+b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = input.nextInt();
        swap(num1, num2);
    }
}
