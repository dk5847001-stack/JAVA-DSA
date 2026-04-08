package LOOPS;
import java.util.*;
public class sumOfNaturalNumber1ton {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a natural number : ");
        int number = input.nextInt();
        if(number<=0){
            System.out.println(number+ " is not a natural number, please enter a natural number (more than 0)!");
        }
        else{
            int i = 1;
        int total = 0;
        while (i<=number) {
            System.out.print(i+" + ");
            total = total+i;
            i++;
        }
        System.out.print("= "+total);
        }
    }
}
