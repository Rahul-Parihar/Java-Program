public class FriendsPair {
    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single

        // int fnm1 = friendsPair(n - 1);

        // // pair
        // int fnm2 = friendsPair(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // total ways
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        //all above code in one line

        return friendsPair(n - 1) + (n - 1) * friendsPair(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(friendsPair(4));

    }

}
