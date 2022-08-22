import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inBuildSort {
    public static void PrintArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3); // first three element are sorted and remaining are
        // same
        Arrays.sort(arr, Collections.reverseOrder());
        PrintArr(arr);

    }

}
