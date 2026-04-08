package CONDITIONAL_STATEMENT;
import java.util.*;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNum = input.nextInt();
        System.out.print("Enter operation : ");
        String operation = input.next();
        switch (operation) {
            case "+": System.out.println(firstNum+" + "+secondNum+" = "+(firstNum+secondNum));                
                break;
            case "-": System.out.println(firstNum+" - "+secondNum+" = "+(firstNum-secondNum));                
                break;
            case "*": System.out.println(firstNum+" x "+secondNum+" = "+(firstNum*secondNum));                
                break;
            case "/": System.out.println(firstNum+" / "+secondNum+" = "+(firstNum/secondNum));                
                break;
            case "%": System.out.println(firstNum+" % "+secondNum+" = "+(firstNum%secondNum));                
                break;
        
            default: System.out.println("Please enter valid operations: (+, -, *, /, %)");
                break;
        }
    }
}
