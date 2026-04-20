import java.util.*;
public class checkPalindromeNumber {
    public static int checkPalindromeNumbers(int a){
        int checkPalindrome = 0;
        while(a > 0){
            checkPalindrome = (checkPalindrome * 10) + a % 10;
            a/=10;
        }
       return checkPalindrome;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        checkPalindromeNumbers(number);
        if(checkPalindromeNumbers(number) == number){
            System.out.println(number+" is a palindrme number.");
        }
        else{
            System.out.println(number+" is not a palindrome number");
        }
        input.close();
    }
}
