import java.util.*;

public class printPrimeInRange {
    public static void primeNumber(int a) {

        if (a <= 1) {
            System.out.println("please enter a positive number grater than 1");
        } else {
            for (int i = 2; i <= a; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int number = input.nextInt();
        primeNumber(number);
        input.close();
    }
}
