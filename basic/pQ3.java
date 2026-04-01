import java.util.*;
public class pQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of pen : ");
        float pen = input.nextFloat();
        System.out.print("Enter the prce of pencile : ");
        float pencile = input.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float eraser = input.nextFloat();
        float itemPrice = pen + pencile + eraser;
        float totalPrice = itemPrice + (0.18f * itemPrice);
        System.out.println("The product price is : "+ "INR "+itemPrice+" rupees");
        System.out.println("The total with 18% gst : " + "INR "+totalPrice + " rupees");
        input.close();
    }
}
