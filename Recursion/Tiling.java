public class Tiling {
    public static int TilingProblem(int n) {// 2 X n floor size

        //base case

        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // choice
        // vertical
        int fnm1 = TilingProblem(n - 1);

        // horizontal

        int fnm2 = TilingProblem(n - 2);

        // total ways

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(4));

    }

}
