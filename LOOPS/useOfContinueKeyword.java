package LOOPS;
import java.util.*;
public class useOfContinueKeyword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for(int i = 1; i<=number; i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
        input.close();
    }
}
