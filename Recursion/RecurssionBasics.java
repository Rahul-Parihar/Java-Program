public class RecurssionBasics {

    // Print nuber in decresing order

    public static void PrintdecNo(int n) {
        if (n == 1) { // base case
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        PrintdecNo(n - 1);// call inner fuction

    }

    // Print number in increasing Order

    public static void PrintIncrNo(int n) {
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        PrintIncrNo(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n = 10;
       // PrintdecNo(n);
        PrintIncrNo(n);

    }

}
