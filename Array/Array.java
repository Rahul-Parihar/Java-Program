import java.util.*;

public class Array {
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int marks[] = new int[100];

        // length of array

        // System.out.println("length of array = "+marks.length);

        // input array

        // System.out.println("Enter physics marks");
        // marks[0] = sc.nextInt();
        // System.out.println("Enter maths marks");
        // marks[1] = sc.nextInt();
        // System.out.println("Enter chemistry marks");
        // marks[2] = sc.nextInt();

        // //output array

        // System.out.println("physics = " + marks[0]);
        // System.out.println("maths = " + marks[1]);
        // System.out.println("chemistry = " + marks[2]);

        // //update array

        // marks[2]=marks[2]+10;
        // System.out.println("chemistry = " + marks[2]);

        // int percentage=(marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Percentage = "+percentage+ "%");

        int number[] = { 2, 85, 58, 96, 87, 5, 87, 4, 54, 48, 80 };
        int key = 57;
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.print("not found");
        } else {
            System.out.print("key is at index " + index);
        }

    }

}
