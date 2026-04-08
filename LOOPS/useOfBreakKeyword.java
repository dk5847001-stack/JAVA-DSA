package LOOPS;

public class useOfBreakKeyword {
public static void main(String[] args) {
    for(int i = 1; i<=10; i++){
        if(i==3){
            break;
        }
        System.out.print(i+" ");
    }
    System.out.println("\ni am the out of loop");
}
    
}