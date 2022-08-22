public class pairs_array {

    public static void pairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("( " + current + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is " + tp);

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 7, 8, 6, 18 };
        pairs(numbers);

    }

}
