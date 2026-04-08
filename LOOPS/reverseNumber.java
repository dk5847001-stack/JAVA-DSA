package LOOPS;

public class reverseNumber {
    public static void main(String[] args) {
        int number = 123;
        int lastDigit = 0;
        while (number>0) {
            lastDigit= (number%10);
            System.out.print(lastDigit);
            number/=10;
        }
    }
}
