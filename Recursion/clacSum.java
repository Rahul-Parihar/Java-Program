public class clacSum {
    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int nm1 = CalcSum(n - 1);
        int sn = n + nm1;
        return sn;
    }

    public static void main(String[] args) {
        System.out.println(CalcSum(5));

    }

}
