import java.util.*;
public class pQ2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a square : ");
        float s = input.nextFloat();
        float area = s*s;
        System.out.println("area of square is : "+ area);
        input.close();
    }
}
