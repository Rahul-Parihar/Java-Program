public class firstOccerrence {
    public static int FirstOccerrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccerrence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 9, 7, 6, 1 };
        System.out.println(FirstOccerrence(arr, 7, 0));

    }
}
