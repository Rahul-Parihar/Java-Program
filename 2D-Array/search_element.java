import java.util.*;

public class search_element {
    public static boolean Search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell" + " ( " + i + " , " + j + " ) ");
                    return true;

                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 5);

    }

}
//Answer
// PS E:\Java Program> Java search_element.java
// 1 2 3 4 5 6 7 8 9
// 1 2 3 
// 4 5 6
// 7 8 9
// found at cell ( 1 , 1 ) 