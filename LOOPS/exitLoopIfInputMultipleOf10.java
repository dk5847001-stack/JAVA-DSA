package LOOPS;
import java.util.*;
public class exitLoopIfInputMultipleOf10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number : ");
            int number = input.nextInt();
            if(number%10==0){
                break;
            }
        }
        System.out.println("you are out of the loop");
        input.close();
    }
}
