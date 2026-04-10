public class primeNumber {
    public static void primeOrNotPrime(int a) {
        boolean isPrime = true;
        if (a == 1) {
            System.out.println("1 is not a prime number");
        } else if (a == 2) {
            System.out.println("2 is a prime number");
        } else if (a <= 0) {
            System.out.println("please enter a positive number grater than 1");
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
        }

        
    }

    public static void main(String[] args) {
        primeOrNotPrime(10);
    }
}
