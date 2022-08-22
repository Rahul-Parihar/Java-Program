public class smallest_array {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // + infinity

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 24, 7, 87, 58, 56, 35, 78 };
        System.out.println("smallest number is = " + getSmallest(numbers));

    }

}
