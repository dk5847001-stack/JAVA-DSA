import java.util.*;
public class averageOfThreeNumber {
    public static double averageOfThreeNumbers(double a, double b, double c){
        double average = ( a + b + c ) /3;
        return average;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();
        System.out.print("Enter the third number : ");
        double num3 = input.nextDouble();
        System.out.println("Average of three numbers : ( "+num1+" + "+num2+" + "+num3+" ) / 3 = "+averageOfThreeNumbers(num1, num2, num3));
        input.close();
    }
}
