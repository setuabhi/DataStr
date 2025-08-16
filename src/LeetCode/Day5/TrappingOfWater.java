package LeetCode.Day5;

/**
 * min (leftMax,rightMax) -current
 */
public class TrappingOfWater {
    public static void main(String[] args) {
        int[] heights = {1, 2, 3, 2, 1, 4};
        System.out.println(waterTrapped(heights));
    }

    private static int waterTrapped(int[] heights) {
        int trappedWater = 0;
        if (heights.length == 2) return trappedWater;

        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        leftMax[0] = 0;
        leftMax[1] = heights[0];

        rightMax[heights.length - 1] = 0;
        rightMax[heights.length - 2] = heights[heights.length - 1];

        for (int i = 2; i < heights.length; i++) {
            leftMax[i] = Math.max(heights[i - 1], leftMax[i - 1]);
        }

        for (int i = heights.length - 3; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i + 1], rightMax[i + 1]);
        }

        for (int i = 1; i < heights.length - 1; i++) {
            if (Math.min(leftMax[i], rightMax[i]) - heights[i] > 0)
                trappedWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        return trappedWater;
    }
}
