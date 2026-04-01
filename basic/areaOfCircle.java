import java.util.*;
public class areaOfCircle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter the radius : ");
        float r = input.nextFloat();
        float area = pi*r*r;
        System.out.println("[ The area of circle is : " +pi+" X "+r+" X "+r+" = "+area+" squire ]");
        input.close();
    }
}