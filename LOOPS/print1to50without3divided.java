package LOOPS;

public class print1to50without3divided {
    public static void main(String[] args) {
        int i = 1;
        while (i<=150) {
            if (!(i%3==0)) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
