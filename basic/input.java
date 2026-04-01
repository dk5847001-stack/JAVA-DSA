import java.util.*;
public class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("your name is : " + name);
        input.close();
    }
}
