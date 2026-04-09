package LOOPS;
import java.util.*;
public class pQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a set of integer number : ");
        int number = input.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int middle = 0;
        for(int i = -10; i<number; i++){
            middle = number%10;
            if(middle%2==0){
                evenSum = evenSum + middle;
            }
            else{
                oddSum = oddSum + middle;
            }
            number/=10;
        }
        System.out.println("even sum => "+ evenSum);
        System.out.println("odd sum => " + oddSum);
        input.close();
    }
}
