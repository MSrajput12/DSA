package array;

public class maximumSum {

    public static int maximumsum(int n, int m, int[][] arr) {

        int sum = 0;
        int prev = Integer.MAX_VALUE;

        for(int i = n-1; i >= 0; i--) {

            int currMax = Integer.MIN_VALUE;

            for(int j = 0; j < m; j++) {

                if(arr[i][j] < prev) {
                    currMax = Math.max(currMax, arr[i][j]);
                }
            }

            if(currMax == Integer.MIN_VALUE) {
                return 0;
            }

            sum += currMax;
            prev = currMax;
        }

        return sum;
    }
}