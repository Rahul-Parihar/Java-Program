public class CalcFibonacci {
    public static int calcFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = calcFib(n - 1);
        int fnm2 = calcFib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(calcFib(25));

    }

}
