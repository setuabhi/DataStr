package LeetCode.Day7;

/**
 * while condition: while (left <= right && top <= bottom)
 * left to right use top
 * top to bottom use right
 * right to left use bottom
 * bottom to top use left
 */
public class PrintSpiralMatrix {
    public static void main(String[] args) {
        int[][] arr2D = {
                {2, 6, 4},
                {15, 18, 0},
                {1, 0, 3},
                {5, 10, 7}
        };
        printSprial(arr2D);
    }

    private static void printSprial(int[][] arr2D) {
        int left = 0, top = 0, right = arr2D[0].length - 1, bottom = arr2D.length - 1;
        System.out.println();
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.println(arr2D[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(arr2D[i][right]);
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.println(arr2D[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.println(arr2D[i][left]);
            }
            left++;
        }
    }
}
