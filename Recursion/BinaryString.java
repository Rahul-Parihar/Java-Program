public class BinaryString {
    public static void PrintBinaryString(int n, int lastPlace, String str) {

        // Base case
        if (n == 0) {
            System.out.println("str");
            return;
        }

        // Kaam
        // if (n == 0) {
        // PrintBinaryString(-1, 0, str.append("0"));
        // PrintBinaryString(n - 1, 1, str.append("1"));
        // } else {
        // PrintBinaryString(-1, 0, str.append("0"));

        // }
        PrintBinaryString(-1, 0, str + "0");
        if (lastPlace == 0) {
            PrintBinaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        PrintBinaryString(3, 0, "");

    }

}
