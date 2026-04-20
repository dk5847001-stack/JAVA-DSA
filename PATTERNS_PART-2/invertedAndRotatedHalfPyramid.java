
public class invertedAndRotatedHalfPyramid {
    public static void invertedPyramid(int totRows){
        for(int i = 1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedPyramid(15);
    }
}
