import java.util.*;
public class convertBinaryToDesimal {
    public static void convertBinaryToDeimal(double num){
        double store;
        double dec = 0;
        for(int i = 0; i<num; i++){
            store = num % 2;
            dec = dec + (store + Math.pow(2, i));
            num /=10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double number = input.nextDouble();
        convertBinaryToDeimal(number);
        input.close();
    }
}
