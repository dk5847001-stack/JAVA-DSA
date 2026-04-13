public class desimalToBinary {
    public static int desimalToBinarys(int number){
        int pow = 0;
        int binum = 0;
        while(number > 0){
            binum = binum + (number %2) * ((int)Math.pow(10, pow));
            number = number/2;
            pow++;
        }
        return binum;
    }
    public static void main(String[] args) {
        System.out.println(desimalToBinarys(1000));
    }
}
