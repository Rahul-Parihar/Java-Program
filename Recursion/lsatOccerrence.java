public class lsatOccerrence {
    public static int LsatOccerrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LsatOccerrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

        // // ccheck with self
        // if (arr[i] == key) {
        // return i;
        // }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 7, 3, 5, 8, 2 };
        System.out.println(LsatOccerrence(arr, 5, 0));

    }

}
