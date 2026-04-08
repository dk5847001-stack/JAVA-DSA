package CONDITIONAL_STATEMENT;
import java.util.*;
public class oddOrEvennNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is a even number.");
        }
        else{
            System.out.println(number + " is a odd number.");
        }
    }
}
