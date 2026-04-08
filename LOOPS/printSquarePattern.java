package LOOPS;
import java.util.*;
public class printSquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        for(int i = 1; i <= number; i++){
            System.out.print("\n* ");
            for(int j = 1; j<=number; j++){
                System.out.print("* ");
            }
        }
        input.close();
    }
}
