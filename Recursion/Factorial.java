public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1); // fnm1 stads for f n minus 1
        int fn = n * fact(n - 1); // fn stads for factorial of n
        return fn;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }

}
