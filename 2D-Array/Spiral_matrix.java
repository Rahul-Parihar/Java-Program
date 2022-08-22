public class Spiral_matrix {

    public static void printSpiral(int matrix[][]) {
        int starRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (starRow <= endCol && startCol <= endCol) {
            // top
            for (int j = startCol; j < +endCol; j++) {
                System.out.print(matrix[starRow][j] + " ");
            }
            // rigth
            for (int i = starRow + 1; i <= endRow; i++)

            {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom

            for (int j = endCol - 1; j >= endCol; j--) {
                if (starRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }
            // left

            for (int i = endRow - 1; i >= starRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");

            }
            startCol++;
            starRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11 },
                { 13, 14, 15, 16, } };
        printSpiral(matrix);

    }

}
