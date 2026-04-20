
import java.util.*;
public class sumOfNumber {
    public static int sumOfNumbers(int a){
        int sum = 0;
        
        while(a>0){
         sum = sum + a %10;
         a/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum = sumOfNumbers(n);
        System.out.println("The sum : "+ sum);
        input.close();
    }
}
