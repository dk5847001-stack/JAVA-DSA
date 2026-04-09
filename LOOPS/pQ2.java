package LOOPS;
import java.util.*;
public class pQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter the number : ");
            number = input.nextInt();
            if(number % 2 == 0){
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
            System.out.print("Do you want to continue? press 1 for yes or 0 for not : ");
            choice = input.nextInt();
        }while(choice==1);
            System.out.println("Sum of even numbers : " + evenSum);
            System.out.println("Sum of odd numbers : " + oddSum);
            input.close();
    }
}
