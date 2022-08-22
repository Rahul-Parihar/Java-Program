public class binary_search {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) { // Found
                return mid;
            }
            if (numbers[mid] < key) { // Right
                start = mid + 1;
            } else { // Left
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 1,5,15,18,25};
        int key = 25;
        System.out.println("Index of key is : " + binarySearch(numbers, key));

    }

}
