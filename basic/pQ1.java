import java.util.*;
public class pQ1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = input.nextInt();
        System.out.print("Enter second Number : ");
        int b = input.nextInt();
        System.out.print("Enter third Number : ");
        int c = input.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("The average number is : "+avg);
        input.close();
    }
}
