import java.util.*;
public class oddEvenFunction {
    public static boolean oddOrEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        oddOrEven(number);
        if(oddOrEven(number)){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
        input.close();
    }
}
