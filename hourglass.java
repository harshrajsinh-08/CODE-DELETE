import java.io.*;
public class hourglass {
    static int rows = 5;
    static int cols = 5;

    static int findMaxHourglassSum(int[][] matrix) {
        if (rows < 3 || cols < 3) {
            System.out.println("Not possible to calculate hourglass sum.");
            System.exit(0);
        }

        int maxSum = 0;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int hourglassSum = 
                matrix[i][j] + 
                matrix[i][j + 1] + 
                matrix[i][j + 2] +
                matrix[i + 1][j + 1] + 
                matrix[i + 2][j] + 
                matrix[i + 2][j + 1] + 
                matrix[i + 2][j + 2];
                
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 0, 0},
            {0, 0, 0, 0, 0},
            {2, 1, 4, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0}
        };

        int result = findMaxHourglassSum(matrix);
        System.out.println("Maximum sum of hourglass = " + result);
    }
}