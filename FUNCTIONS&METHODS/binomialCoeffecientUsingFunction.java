public class binomialCoeffecientUsingFunction {
    public static int factorial(int a){
        int fact = 1;
        for(int i = 1; i<=a; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoeffecient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);
        int biCoeff = fact_n/(fact_r * fact_n_r);
        return biCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binomialCoeffecient(3, 2));
    }
}
