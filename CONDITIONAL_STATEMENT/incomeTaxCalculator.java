package CONDITIONAL_STATEMENT;
import java.util.*;
public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you anual incom : ");
        float incom = input.nextFloat();
        if(incom <= 500000){
            System.out.println("Tax : 0%");
        }
        else if(incom > 500000 && incom <= 1000000){
            System.out.println("Tax : 20%");
            System.out.println("Total Tax : " + incom/5 + " rupees.");
            System.out.println("your total income : " + (incom - (incom/5))+ " rupees.");
        }
        else{
            System.out.println("Tax : 30%");
            System.out.println("Total Tax : " + incom*0.3 + " rupees.");
            System.out.println("your total income : " + (incom - (incom*0.3))+ " rupees.");            
        }
        input.close();
    }
}
