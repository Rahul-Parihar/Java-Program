public class oddOrEven {
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // Even number
            System.out.println("Even Number");

        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        OddOrEven(5);
        OddOrEven(11);
        OddOrEven(6);

    }

}
