public class iTHbit {
    public static int getiTHbit(int n, int i) {
        int BitMask = 1 << i;

        if ((n & BitMask) == 0) {
            return 0;

        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getiTHbit(10, 2));

    }

}
