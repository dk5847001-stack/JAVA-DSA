package LOOPS;
import java.util.*;
public class printReverseOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int a = number;
        int reverseNumber = 0;
        while (number>0) {
            reverseNumber= (reverseNumber*10) + number%10;
            number/=10;
        }
        System.out.println("[ "+a+" => "+reverseNumber+" ]");
        input.close();
    }
}
