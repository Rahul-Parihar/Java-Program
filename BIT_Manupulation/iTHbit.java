public class iTHbit {

    // Get iTh Bit

    public static int getiTHbit(int n, int i) {
        int BitMask = 1 << i;

        if ((n & BitMask) == 0) {
            return 0;

        } else {
            return 1;
        }

    }

    // Set iTh Bit

    public static int setiThbit(int n, int i) {
        int BitMask = 1 << i;

        return n | BitMask;

    }

    // Clear iTH Bit

    public static int cleariTHbit(int n, int i) {
        int BitMask = ~(i << i);
        return n & BitMask;
    }

    // Update iTh Bit

    public static int updateiThbit(int n, int i, int newBit) {
        if (newBit == 0) {
            return cleariTHbit(n, i);
        } else {
            return setiThbit(n, i);
        }

    }

    // Clear last i Bit

    public static int clearLastiBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;

    }
    // clear Range of bits

    public static int claerRangeOfBits(int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask =a|b;

        return n & bitMask;

    }


    public static void main(String[] args) {
        System.out.println(getiTHbit(10, 2));
        System.out.println(setiThbit(10, 2));
        System.out.println(cleariTHbit(10, 1));
        System.out.println(updateiThbit(10, 2, 1));
        System.out.println(clearLastiBit(15, 2));
        System.out.println(claerRangeOfBits(10, 2, 4));

    }

}
