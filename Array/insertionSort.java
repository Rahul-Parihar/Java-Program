public class insertionSort {

    //having some error in code

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding oot currect position to insert
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[curr];
                prev--;
            }
            // insertion

            arr[prev + 1] = curr;
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        InsertionSort(arr);
        PrintArr(arr);

    }

}
