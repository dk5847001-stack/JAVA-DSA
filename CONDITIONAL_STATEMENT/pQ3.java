package CONDITIONAL_STATEMENT;
import java.util.*;
public class pQ3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number (1 to 7) : ");
      int number = input.nextInt();
      switch(number){
        case 1 : System.out.println("Sunday");
        break;
        case 2 : System.out.println("Monday");
        break;
        case 3 : System.out.println("Tuesday");
        break;
        case 4 : System.out.println("wednesday");
        break;
        case 5 : System.out.println("Thirsday");
        break;
        case 6 : System.out.println("Friday");
        break;
        case 7 : System.out.println("Saturday");
        break;
        default : System.out.println("please enter a valid number.");
      }
      input.close();  
    }
}
