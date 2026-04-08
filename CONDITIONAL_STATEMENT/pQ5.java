package CONDITIONAL_STATEMENT;
import java.util.*;
public class pQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your : ");
        int year = input.nextInt();
        if((year%4==0 || year%100==0 || year%400==0) && (year>=2000)){
            System.out.println(year+" is the leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
        input.close();
    }
}
